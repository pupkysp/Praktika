package lt.vtvpmc.emprs.repositories.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import lt.vtvpmc.emprs.entities.Education;
import lt.vtvpmc.emprs.repositories.EducationRepo;



public class EducationDao implements EducationRepo{

	private EntityManagerFactory entityManagerFactory;
	
	private EntityManager getEntityManager() {
		return entityManagerFactory.createEntityManager();
	}
	
	public Education findById(Long id) {
		EntityManager em = getEntityManager();
		try {
			TypedQuery<Education> invoiceQuery = em.createQuery("SELECT e From Education e WHERE e.id =:id", Education.class);
			invoiceQuery.setParameter("id", id);
			invoiceQuery.setMaxResults(1);

			return invoiceQuery.getSingleResult();
		} finally {
			em.close();
		}
	}

	public List<Education> findAll() {
		EntityManager em = getEntityManager();
		try {
			CriteriaBuilder cb = em.getCriteriaBuilder();
			CriteriaQuery<Education> cq = cb.createQuery(Education.class);
			Root<Education> root = cq.from(Education.class);
			cq.select(root);
			TypedQuery<Education> tq = em.createQuery(cq);
			return tq.getResultList();
		} finally {
			em.close();
		}
	}

	public void save(Education education) {
		EntityManager em = getEntityManager();
		try {
			em.getTransaction().begin();
			if (!em.contains(education))
				education = em.merge(education);
			em.persist(education);
			em.getTransaction().commit();
		} finally {
			em.close();
		}
		
	}

	public void delete(Education education) {
		EntityManager em = getEntityManager();

		try {
			em.getTransaction().begin();
			education = em.merge(education);
			em.remove(education);
			em.getTransaction().commit();
		} finally {
			em.close();
		}
		
	}

	public Education update(Education education) {
		EntityManager em = getEntityManager();
		try {
			return em.merge(education);
		} finally {
			em.close();
		}
		
	}

	public void setEntityManagerFactory(EntityManagerFactory entityManagerFactory) {
		this.entityManagerFactory = entityManagerFactory;
	}

}
