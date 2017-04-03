package lt.vtvpmc.emprs.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "education")
public class Education implements Serializable {

	private static final long serialVersionUID = 1264694348861453192L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long id;
	
	private String education;

	private String school;

	@Temporal(TemporalType.DATE)
	private Date schoolGraduationYear;

	private String institutionType;
	
	private String speciality;

	private String nameOfInstitution;

	@Temporal(TemporalType.DATE)
	private Date institutionGraduationYear;

	@OneToOne(cascade = CascadeType.ALL, mappedBy = "education")
	@JoinColumn(name = "studentInfo_id")
	private StudentInfo studentInfo;

	public Long getId() {
		return id;
	}

	public String getEducation() {
		return education;
	}

	public void setEducation(String education) {
		this.education = education;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}

	public Date getSchoolGraduationYear() {
		return schoolGraduationYear;
	}

	public void setSchoolGraduationYear(Date schoolGraduationYear) {
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

	public Date getInstitutionGraduationYear() {
		return institutionGraduationYear;
	}

	public void setInstitutionGraduationYear(Date institutionGraduationYear) {
		this.institutionGraduationYear = institutionGraduationYear;
	}

	public StudentInfo getStudentInfo() {
		return studentInfo;
	}

	public void setStudentInfo(StudentInfo studentInfo) {
		this.studentInfo = studentInfo;
	}



}
