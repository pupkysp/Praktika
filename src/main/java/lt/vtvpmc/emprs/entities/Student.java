package lt.vtvpmc.emprs.entities;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "student")
public class Student implements Serializable {

	private static final long serialVersionUID = -6936795541099197176L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long id;

	private String firstName;

	private String lastName;

	@Temporal(TemporalType.DATE)
	private Date dateOfBirth;
	
	@OneToOne(cascade = CascadeType.ALL)
	private StudentInfo studentInfo;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Request request;
	
	@OneToOne(cascade = CascadeType.ALL)
	private ParentInfo parentInfo;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		
		this.dateOfBirth = dateOfBirth;
	}

	public Request getRequest() {
		return request;
	}

	public void setRequest(Request request) {
		this.request = request;
	}

	public StudentInfo getStudentInfo() {
		return studentInfo;
	}

	public void setStudentInfo(StudentInfo studentInfo) {
		this.studentInfo = studentInfo;
	}

	public ParentInfo getParentInfo() {
		return parentInfo;
	}

	public void setParentInfo(ParentInfo parentInfo) {
		this.parentInfo = parentInfo;
	}

}
