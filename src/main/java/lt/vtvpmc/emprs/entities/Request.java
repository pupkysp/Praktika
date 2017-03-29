package lt.vtvpmc.emprs.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
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
@Table(name = "request")
public class Request implements Serializable {

	private static final long serialVersionUID = 9142838422382630682L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long id;

	@Temporal(TemporalType.TIMESTAMP)
	private Date requestdate;

	private String unit;

	private String stage;

//	@ElementCollection(targetClass = String.class)
//	private List<String> attachments;
//
//	@Column
//	@ElementCollection(targetClass = String.class)
//	private List<String> dormitory;
//
//	@Column
//	@ElementCollection(targetClass = String.class)
//	private List<String> infoAboutUs;
//
//	@Column
//	@ElementCollection(targetClass = String.class)
//	private List<String> infoAboutDocuments;

	@OneToOne(cascade = CascadeType.ALL, mappedBy = "request")
	@JoinColumn(name = "student_id")
	private Student student;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getRequestdate() {
		return requestdate;
	}

	public void setRequestdate(Date requestdate) {
		this.requestdate = requestdate;
	}

	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	public String getStage() {
		return stage;
	}

	public void setStage(String stage) {
		this.stage = stage;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}


}
