package lt.vtvpmc.emprs.repositories.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import lt.vtvpmc.emprs.entities.CompulsorySubjects;
import lt.vtvpmc.emprs.repositories.CurriculumRepo;

public class CurriculumDao implements CurriculumRepo {

	private EntityManagerFactory entityManagerFactory;

	private EntityManager getEntityManager() {
		return entityManagerFactory.createEntityManager();
	}

	@Override
	public void save(CompulsorySubjects CompulsorySubjects) {
		EntityManager em = getEntityManager();
		try {
			em.getTransaction().begin();
			if (!em.contains(CompulsorySubjects))
				CompulsorySubjects = em.merge(CompulsorySubjects);
			em.persist(CompulsorySubjects);
			em.getTransaction().commit();
		} finally {
			em.close();
		}
	}

	@Override
	public void delete(CompulsorySubjects CompulsorySubjects) {
		EntityManager em = getEntityManager();

		try {
			em.getTransaction().begin();
			CompulsorySubjects = em.merge(CompulsorySubjects);
			em.remove(CompulsorySubjects);
			em.getTransaction().commit();
		} finally {
			em.close();
		}
	}
}
