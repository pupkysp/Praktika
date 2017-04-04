package lt.vtvpmc.emprs.entities;

import java.io.Serializable;


import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class StudentInfo implements Serializable{

	private static final long serialVersionUID = 2166267409195707544L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long id;

	private String address;
	
	private String municipality;
	
	private String phoneNumber;

	private String email;
	
	private String maritalStatus;
	
	@OneToOne(cascade = CascadeType.ALL, mappedBy = "studentInfo")
	@JoinColumn(name = "student_id")
	private Student student;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Education education;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getMunicipality() {
		return municipality;
	}

	public void setMunicipality(String municipality) {
		this.municipality = municipality;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Education getEducation() {
		return education;
	}

	public void setEducation(Education education) {
		this.education = education;
	}

	public String getMaritalStatus() {
		return maritalStatus;
	}

	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}
	
	
	
}
