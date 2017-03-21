package finalpvz;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "education")
public class Education implements Serializable{
	
	private static final long serialVersionUID = 1264694348861453192L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long id;
	
	private List<String> education;
	
	private String school;
	
	private String schoolGraduationYear;
	
	private String speciality;
	
	private String nameOfInstitution;
	
	private String institutionType;
	
	private String institutionGraduationYear;

	@OneToOne
	private Student student;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public List<String> getEducation() {
		return education;
	}

	public void setEducation(List<String> education) {
		this.education = education;
	}

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}

	public String getSchoolGraduationYear() {
		return schoolGraduationYear;
	}

	public void setSchoolGraduationYear(String schoolGraduationYear) {
		this.schoolGraduationYear = schoolGraduationYear;
	}

	public String getSpeciality() {
		return speciality;
	}

	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}

	public String getNameOfInstitution() {
		return nameOfInstitution;
	}

	public void setNameOfInstitution(String nameOfInstitution) {
		this.nameOfInstitution = nameOfInstitution;
	}

	public String getInstitutionType() {
		return institutionType;
	}

	public void setInstitutionType(String institutionType) {
		this.institutionType = institutionType;
	}

	public String getInstitutionGraduationYear() {
		return institutionGraduationYear;
	}

	public void setInstitutionGraduationYear(String institutionGraduationYear) {
		this.institutionGraduationYear = institutionGraduationYear;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}
	
	
	
}
