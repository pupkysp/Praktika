package lt.vtvpmc.emprs.repositories;

import lt.vtvpmc.emprs.entities.CurriculumSubjects;
import lt.vtvpmc.emprs.entities.Student;

public interface CurriculumRepo {

public void save(CurriculumSubjects CurriculumSubjects);
	
public void delete(CurriculumSubjects CurriculumSubjects);

public Student getStudentByName(String firstName, String lastName);

public String getEducationByName(String firstName, String lastName);

public CurriculumSubjects getCurriculumByID(Long id);

public Long getStudentIdByName(String firstName, String lastName);

public double getMandatorySubjectsTotalHoursByStudentId(Long id);

public double getOptionalSubjectsTotalHoursByStudentId(Long id);

}
