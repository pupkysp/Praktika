package lt.vtvpmc.emprs.repositories.dao;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import lt.vtvpmc.emprs.entities.Student;
import lt.vtvpmc.emprs.repositories.StudentRepo;

public class StudentDao implements StudentRepo {

	private EntityManagerFactory entityManagerFactory;

	private EntityManager getEntityManager() {
		return entityManagerFactory.createEntityManager();
	}

	public Student findById(Long id) {
		EntityManager em = getEntityManager();
		try {
			TypedQuery<Student> invoiceQuery = em.createQuery("SELECT s From Student s WHERE s.id =:id", Student.class);
			invoiceQuery.setParameter("id", id);
			invoiceQuery.setMaxResults(1);

			return invoiceQuery.getSingleResult();
		} finally {
			em.close();
		}
	}

	public List<Student> findAll() {
		EntityManager em = getEntityManager();
		try {
			CriteriaBuilder cb = em.getCriteriaBuilder();
			CriteriaQuery<Student> cq = cb.createQuery(Student.class);
			Root<Student> root = cq.from(Student.class);
			cq.select(root);
			TypedQuery<Student> tq = em.createQuery(cq);
			return tq.getResultList();
		} finally {
			em.close();
		}
	}

	public void save(Student student) {
		EntityManager em = getEntityManager();
		try {
			em.getTransaction().begin();
			if (!em.contains(student))
				student = em.merge(student);
			em.persist(student);
			em.getTransaction().commit();
		} finally {
			em.close();
		}

	}

	public void delete(Student student) {
		EntityManager em = getEntityManager();

		try {
			em.getTransaction().begin();
			student = em.merge(student);
			em.remove(student);
			em.getTransaction().commit();
		} finally {
			em.close();
		}

	}

	public Student update(Student student) {
		EntityManager em = getEntityManager();
		try {
			return em.merge(student);
		} finally {
			em.close();
		}

	}

	public void setEntityManagerFactory(EntityManagerFactory entityManagerFactory) throws Exception {
		this.entityManagerFactory = entityManagerFactory;
	}

	@Override
	public Student findByFNameLNameAndBDate(String firstName, String lastName, Date dateOfBirth) {
		EntityManager em = getEntityManager();

		try {
			SimpleDateFormat dmyFormat = new SimpleDateFormat("yyyy-MM-dd");
			String dob = dmyFormat.format(dateOfBirth);
			Query q1 = em.createQuery("SELECT id FROM Student WHERE FIRSTNAME='" + firstName + "' AND LASTNAME='"
					+ lastName + "' AND DATEOFBIRTH='" + dob + "'");
			Long result = (Long) q1.getSingleResult();
			Student s = em.find(Student.class, result);
			return s;

		} finally {
			em.close();
		}

	}

}
