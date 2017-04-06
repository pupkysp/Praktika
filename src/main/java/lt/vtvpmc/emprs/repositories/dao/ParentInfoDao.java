package lt.vtvpmc.emprs.repositories.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import lt.vtvpmc.emprs.entities.ParentInfo;
import lt.vtvpmc.emprs.repositories.ParentInfoRepo;



public class ParentInfoDao implements ParentInfoRepo{

	private EntityManagerFactory entityManagerFactory;
	
	private EntityManager getEntityManager() {
		return entityManagerFactory.createEntityManager();
	}
	
	public ParentInfo findById(Long id) {
		EntityManager em = getEntityManager();
		try {
			TypedQuery<ParentInfo> invoiceQuery = em.createQuery("SELECT p From ParentInfo p WHERE p.id =:id", ParentInfo.class);
			invoiceQuery.setParameter("id", id);
			invoiceQuery.setMaxResults(1);

			return invoiceQuery.getSingleResult();
		} finally {
			em.close();
		}
	}

	public List<ParentInfo> findAll() {
		EntityManager em = getEntityManager();
		try {
			CriteriaBuilder cb = em.getCriteriaBuilder();
			CriteriaQuery<ParentInfo> cq = cb.createQuery(ParentInfo.class);
			Root<ParentInfo> root = cq.from(ParentInfo.class);
			cq.select(root);
			TypedQuery<ParentInfo> tq = em.createQuery(cq);
			return tq.getResultList();
		} finally {
			em.close();
		}
	}

	public void save(ParentInfo parentInfo) {
		EntityManager em = getEntityManager();
		try {
			em.getTransaction().begin();
			if (!em.contains(parentInfo))
				parentInfo = em.merge(parentInfo);
			em.persist(parentInfo);
			em.getTransaction().commit();
		} finally {
			em.close();
		}
		
	}

	public void delete(ParentInfo parentInfo) {
		EntityManager em = getEntityManager();

		try {
			em.getTransaction().begin();
			parentInfo = em.merge(parentInfo);
			em.remove(parentInfo);
			em.getTransaction().commit();
		} finally {
			em.close();
		}
		
	}

	public ParentInfo update(ParentInfo parentInfo) {
		EntityManager em = getEntityManager();
		try {
			return em.merge(parentInfo);
		} finally {
			em.close();
		}
		
	}

	public void setEntityManagerFactory(EntityManagerFactory entityManagerFactory) {
		this.entityManagerFactory = entityManagerFactory;
	}

}
