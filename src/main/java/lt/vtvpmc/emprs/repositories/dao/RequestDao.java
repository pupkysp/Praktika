package lt.vtvpmc.emprs.repositories.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import lt.vtvpmc.emprs.entities.Request;
import lt.vtvpmc.emprs.repositories.RequestRepo;

public class RequestDao implements RequestRepo{

	private EntityManagerFactory entityManagerFactory;
	
	private EntityManager getEntityManager() {
		return entityManagerFactory.createEntityManager();
	}
	
	public Request findById(Long id) {
		EntityManager em = getEntityManager();
		try {
			TypedQuery<Request> invoiceQuery = em.createQuery("SELECT r From Request r WHERE r.id =:id", Request.class);
			invoiceQuery.setParameter("id", id);
			invoiceQuery.setMaxResults(1);

			return invoiceQuery.getSingleResult();
		} finally {
			em.close();
		}
	}

	public List<Request> findAll() {
		EntityManager em = getEntityManager();
		try {
			CriteriaBuilder cb = em.getCriteriaBuilder();
			CriteriaQuery<Request> cq = cb.createQuery(Request.class);
			Root<Request> root = cq.from(Request.class);
			cq.select(root);
			TypedQuery<Request> tq = em.createQuery(cq);
			return tq.getResultList();
		} finally {
			em.close();
		}
	}

	public void save(Request request) {
		EntityManager em = getEntityManager();
		try {
			em.getTransaction().begin();
			if (!em.contains(request))
				request = em.merge(request);
			em.persist(request);
			em.getTransaction().commit();
		} finally {
			em.close();
		}
		
	}

	public void delete(Request request) {
		EntityManager em = getEntityManager();

		try {
			em.getTransaction().begin();
			request = em.merge(request);
			em.remove(request);
			em.getTransaction().commit();
		} finally {
			em.close();
		}
		
	}

	public Request update(Request request) {
		EntityManager em = getEntityManager();
		try {
			return em.merge(request);
		} finally {
			em.close();
		}
		
	}

	public void setEntityManagerFactory(EntityManagerFactory entityManagerFactory) {
		this.entityManagerFactory = entityManagerFactory;
	}

}
