package lt.vtvpmc.emprs.repositories.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import lt.vtvpmc.emprs.entities.AdditionalInfo;
import lt.vtvpmc.emprs.repositories.AdditionalInfoRepo;



public class AdditionalInfoDao implements AdditionalInfoRepo{
	
	private EntityManagerFactory entityManagerFactory;
	
	private EntityManager getEntityManager() {
		return entityManagerFactory.createEntityManager();
	}
	
	public AdditionalInfo findById(Long id) {
		EntityManager em = getEntityManager();
		try {
			TypedQuery<AdditionalInfo> invoiceQuery = em.createQuery("SELECT a From AdditionalInfo a WHERE a.id =:id", AdditionalInfo.class);
			invoiceQuery.setParameter("id", id);
			invoiceQuery.setMaxResults(1);

			return invoiceQuery.getSingleResult();
		} finally {
			em.close();
		}
	}

	public List<AdditionalInfo> findAll() {
		EntityManager em = getEntityManager();
		try {
			CriteriaBuilder cb = em.getCriteriaBuilder();
			CriteriaQuery<AdditionalInfo> cq = cb.createQuery(AdditionalInfo.class);
			Root<AdditionalInfo> root = cq.from(AdditionalInfo.class);
			cq.select(root);
			TypedQuery<AdditionalInfo> tq = em.createQuery(cq);
			return tq.getResultList();
		} finally {
			em.close();
		}
	}

	public void save(AdditionalInfo additionalInfo) {
		EntityManager em = getEntityManager();
		try {
			em.getTransaction().begin();
			if (!em.contains(additionalInfo))
				additionalInfo = em.merge(additionalInfo);
			em.persist(additionalInfo);
			em.getTransaction().commit();
		} finally {
			em.close();
		}
		
	}

	public void delete(AdditionalInfo additionalInfo) {
		EntityManager em = getEntityManager();

		try {
			em.getTransaction().begin();
			additionalInfo = em.merge(additionalInfo);
			em.remove(additionalInfo);
			em.getTransaction().commit();
		} finally {
			em.close();
		}
		
	}

	public AdditionalInfo update(AdditionalInfo additionalInfo) {
		EntityManager em = getEntityManager();
		try {
			return em.merge(additionalInfo);
		} finally {
			em.close();
		}
		
	}

	public void setEntityManagerFactory(EntityManagerFactory entityManagerFactory) {
		this.entityManagerFactory = entityManagerFactory;
	}

}
