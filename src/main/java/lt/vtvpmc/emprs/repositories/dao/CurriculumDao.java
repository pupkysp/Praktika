package lt.vtvpmc.emprs.repositories.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;

import lt.vtvpmc.emprs.entities.CurriculumSubjects;
import lt.vtvpmc.emprs.entities.Student;
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
	public Student getStudentByName(String firstName, String lastName) {
		EntityManager em = getEntityManager();

		try {
			Query q1 = em.createQuery(
					"SELECT id FROM Student WHERE FIRSTNAME='" + firstName + "' AND LASTNAME='" + lastName + "'");
			Long result = (Long) q1.getSingleResult();
			Student student = em.find(Student.class, result);
			return student;
		} finally {
			em.close();
		}
	}

	@Override
	public Long getStudentIdByName(String firstName, String lastName) {
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

	@Override
	public CurriculumSubjects getCurriculumByID(Long id) {
		EntityManager em = getEntityManager();
		try {
			Query q1 = em.createQuery("SELECT id FROM CurriculumSubjects WHERE STUDENT_ID='" + id + "'");
			Long result = (Long) q1.getSingleResult();
			CurriculumSubjects curriculumSubjects = em.find(CurriculumSubjects.class, result);
			return curriculumSubjects;
		} finally {
			em.close();
		}
	}

	@Override
	public double getMandatorySubjectsTotalHoursByStudentId(Long id) {
		EntityManager em = getEntityManager();
		try {
			Query q1 = em.createQuery(
					"SELECT RELIGION + ETHIC + LITHUANIAN_A + LITHUANIAN_B + NATIVE_RUSSIAN + NATIVE_POLISH + HISTORY + GEOGRAPHY +SOCIAL + FOREIGN_ENGLISH + FOREIGN_FRENCH + FOREIGN_GERMAN + FOREIGN_RUSSIAN + MATHEMATICS + BIOLOGY + PHYSICS + CHEMISTRY + NATURAL_SCIENCES + PHYSICAL_EDUCATION + FOOTBALL + BASKETBALL FROM CurriculumSubjects WHERE STUDENT_ID = '"
							+ id + "'");
			double result = (double) q1.getSingleResult();
			return result;
		} finally {
			em.close();
		}
	}

	@Override
	public double getOptionalSubjectsTotalHoursByStudentId(Long id) {
		EntityManager em = getEntityManager();
		try {
			Query q1 = em.createQuery(
					"SELECT RUSSIAN_II + ENGLISH_II + GERMAN_II + DESIGN + ART + THEATER + MUSIC + INFORMATION_TECHNOLOGY + ADVANCED_LITHUANIAN_NATIVE + ADVANCED_LITHUANIAN_STATE + ADVANCED_FOREIGN_LANGUAGE + ADVANCED_HISTORY + ADVANCED_MATHEMATICS + ADVANCED_BIOLOGY + ADVANCED_PHYSICS + ADVANCED_CHEMISTRY + BIOLOGY_MODULE_I + CHEMISTRY_MODULE + BIOLOGY_MODULE_II + PHYSICS_MODULE_I + PHYSICS_MODULE_II + PHYSICS_MODULE_III + MATHEMATICS_MODULE_I + MATHEMATICS_MODULE_II + MATHEMATICS_MODULE_III FROM CurriculumSubjects WHERE STUDENT_ID='"
							+ id + "'");
			double result = (double) q1.getSingleResult();
			return result;
		} finally {
			em.close();
		}
	}

	public void setEntityManagerFactory(EntityManagerFactory entityManagerFactory) {
		this.entityManagerFactory = entityManagerFactory;
	}

}
