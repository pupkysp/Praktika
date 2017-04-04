package lt.vtvpmc.emprs.repositories;

import lt.vtvpmc.emprs.entities.CurriculumSubjects;

public interface CurriculumRepo {

public void save(CurriculumSubjects CurriculumSubjects);
	
public void delete(CurriculumSubjects CurriculumSubjects);

public Long getIdByName(String firstName, String lastName);

public String getEducationByName(String firstName, String lastName);

}
