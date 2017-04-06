package lt.vtvpmc.emprs.repositories.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import lt.vtvpmc.emprs.entities.StudentInfo;
import lt.vtvpmc.emprs.repositories.StudentInfoRepo;

public class StudentInfoDao implements StudentInfoRepo {

		private EntityManagerFactory entityManagerFactory;
		
		private EntityManager getEntityManager() {
			return entityManagerFactory.createEntityManager();
		}
		
		public StudentInfo findById(Long id) {
			EntityManager em = getEntityManager();
			try {
				TypedQuery<StudentInfo> invoiceQuery = em.createQuery("SELECT si From StudentInfo si WHERE si.id =:id", StudentInfo.class);
				invoiceQuery.setParameter("id", id);
				invoiceQuery.setMaxResults(1);

				return invoiceQuery.getSingleResult();
			} finally {
				em.close();
			}
		}

		public List<StudentInfo> findAll() {
			EntityManager em = getEntityManager();
			try {
				CriteriaBuilder cb = em.getCriteriaBuilder();
				CriteriaQuery<StudentInfo> cq = cb.createQuery(StudentInfo.class);
				Root<StudentInfo> root = cq.from(StudentInfo.class);
				cq.select(root);
				TypedQuery<StudentInfo> tq = em.createQuery(cq);
				return tq.getResultList();
			} finally {
				em.close();
			}
		}

		public void save(StudentInfo studentInfo) {
			EntityManager em = getEntityManager();
			try {
				em.getTransaction().begin();
				if (!em.contains(studentInfo))
					studentInfo = em.merge(studentInfo);
				em.persist(studentInfo);
				em.getTransaction().commit();
			} finally {
				em.close();
			}
			
		}

		public void delete(StudentInfo studentInfo) {
			EntityManager em = getEntityManager();

			try {
				em.getTransaction().begin();
				studentInfo = em.merge(studentInfo);
				em.remove(studentInfo);
				em.getTransaction().commit();
			} finally {
				em.close();
			}
			
		}

		public StudentInfo update(StudentInfo studentInfo) {
			EntityManager em = getEntityManager();
			try {
				return em.merge(studentInfo);
			} finally {
				em.close();
			}
			
		}

		public void setEntityManagerFactory(EntityManagerFactory entityManagerFactory) {
			this.entityManagerFactory = entityManagerFactory;
		}

	
}
