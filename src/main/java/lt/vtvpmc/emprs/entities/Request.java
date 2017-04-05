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
@Table(name = "request")
public class Request implements Serializable {

	private static final long serialVersionUID = 9142838422382630682L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long id;

	@Temporal(TemporalType.DATE)
	private Date requestdate;

	private String unit;

	private String stage;
	
	private boolean credential;
	
	private boolean medicalCertificate;
	
	private boolean photo;
	
	private boolean passportCopy;
	
	private boolean drafteeCertificate;
	
	private boolean entranceFee;
	
	private boolean documentsWithdrawn;
	
	private String dormitory;
	
	@OneToOne(cascade = CascadeType.ALL)
	private AdditionalInfo additionalInfo;

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

	public boolean isCredential() {
		return credential;
	}

	public void setCredential(boolean credential) {
		this.credential = credential;
	}

	public boolean isMedicalCertificate() {
		return medicalCertificate;
	}

	public void setMedicalCertificate(boolean medicalCertificate) {
		this.medicalCertificate = medicalCertificate;
	}

	public boolean isPhoto() {
		return photo;
	}

	public void setPhoto(boolean photo) {
		this.photo = photo;
	}

	public boolean isPassportCopy() {
		return passportCopy;
	}

	public void setPassportCopy(boolean passportCopy) {
		this.passportCopy = passportCopy;
	}

	public boolean isDrafteeCertificate() {
		return drafteeCertificate;
	}

	public void setDrafteeCertificate(boolean drafteeCertificate) {
		this.drafteeCertificate = drafteeCertificate;
	}

	public boolean isEntranceFee() {
		return entranceFee;
	}

	public void setEntranceFee(boolean entranceFee) {
		this.entranceFee = entranceFee;
	}

	public boolean isDocumentsWithdrawn() {
		return documentsWithdrawn;
	}

	public void setDocumentsWithdrawn(boolean documentsWithdrawn) {
		this.documentsWithdrawn = documentsWithdrawn;
	}
	
	public String getDormitory() {
		return dormitory;
	}

	public void setDormitory(String dormitory) {
		this.dormitory = dormitory;
	}

	public AdditionalInfo getAdditionalInfo() {
		return additionalInfo;
	}

	public void setAdditionalInfo(AdditionalInfo additionalInfo) {
		this.additionalInfo = additionalInfo;
	}

}
