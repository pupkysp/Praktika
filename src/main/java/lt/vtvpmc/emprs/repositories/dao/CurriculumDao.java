package lt.vtvpmc.emprs.repositories.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

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
	
	public void setEntityManagerFactory(EntityManagerFactory entityManagerFactory) {
		this.entityManagerFactory = entityManagerFactory;
	}
}
