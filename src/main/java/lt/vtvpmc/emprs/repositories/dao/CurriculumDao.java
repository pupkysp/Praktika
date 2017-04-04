package lt.vtvpmc.emprs.repositories.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;

import lt.vtvpmc.emprs.entities.CurriculumSubjects;
import lt.vtvpmc.emprs.repositories.CurriculumRepo;

public class CurriculumDao implements CurriculumRepo {

	private EntityManagerFactory entityManagerFactory;

	private EntityManager getEntityManager() {
		return entityManagerFactory.createEntityManager();
	}

	@Override
	public void save(CurriculumSubjects CurriculumSubjects) {
		EntityManager em = getEntityManager();
		try {
			em.getTransaction().begin();
			if (!em.contains(CurriculumSubjects))
				CurriculumSubjects = em.merge(CurriculumSubjects);
			em.persist(CurriculumSubjects);
			em.getTransaction().commit();
		} finally {
			em.close();
		}
	}

	@Override
	public void delete(CurriculumSubjects CurriculumSubjects) {
		EntityManager em = getEntityManager();

		try {
			em.getTransaction().begin();
			CurriculumSubjects = em.merge(CurriculumSubjects);
			em.remove(CurriculumSubjects);
			em.getTransaction().commit();
		} finally {
			em.close();
		}
	}

	@Override
	public Long getIdByName(String firstName, String lastName) {
		EntityManager em = getEntityManager();

		try {
			Query q1 = em.createQuery(
					"SELECT id FROM Student WHERE FIRSTNAME='" + firstName + "' AND LASTNAME='" + lastName + "'");
			Long result = (Long) q1.getSingleResult();
			return result;
		} finally {
			em.close();
		}
	}

	@Override
	public String getEducationByName(String firstName, String lastName) {
		EntityManager em = getEntityManager();

		try {
			Query q1 = em.createNativeQuery(
					"SELECT EDUCATION FROM EDUCATION JOIN STUDENTINFO ON EDUCATION.ID = STUDENTINFO.EDUCATION_ID JOIN STUDENT ON STUDENTINFO.ID = STUDENT.STUDENTINFO_ID WHERE FIRSTNAME='"
							+ firstName + "' AND LASTNAME='" + lastName + "';");
			String result = (String) q1.getSingleResult();
			return result;
		} finally {
			em.close();
		}
	}

	public void setEntityManagerFactory(EntityManagerFactory entityManagerFactory) {
		this.entityManagerFactory = entityManagerFactory;
	}
}
