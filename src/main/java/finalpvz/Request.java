package finalpvz;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
	private Date requestdare;
	
	private String group;
	
	private String stage;
	
	private List<String> attachments;
	
	private String fatherName;

	private String fatherAdress;

	private String fatherPhone;

	private String motherName;

	private String motherAdress;

	private String motherPhone;

	private String guardianName;

	private String guardianAdress;

	private String guardianPhone;
	
	private List<String> dormitory;
	
	private List<String> howYouFoundUs;
	
	private List<String> infoAboutDocuments;
	
	@OneToOne
	private Student student;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getRequestdare() {
		return requestdare;
	}

	public void setRequestdare(Date requestdare) {
		this.requestdare = requestdare;
	}

	public String getGroup() {
		return group;
	}

	public void setGroup(String group) {
		this.group = group;
	}

	public String getStage() {
		return stage;
	}

	public void setStage(String stage) {
		this.stage = stage;
	}

	public List<String> getAttachments() {
		return attachments;
	}

	public void setAttachments(List<String> attachments) {
		this.attachments = attachments;
	}

	public String getFatherName() {
		return fatherName;
	}

	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}

	public String getFatherAdress() {
		return fatherAdress;
	}

	public void setFatherAdress(String fatherAdress) {
		this.fatherAdress = fatherAdress;
	}

	public String getFatherPhone() {
		return fatherPhone;
	}

	public void setFatherPhone(String fatherPhone) {
		this.fatherPhone = fatherPhone;
	}

	public String getMotherName() {
		return motherName;
	}

	public void setMotherName(String motherName) {
		this.motherName = motherName;
	}

	public String getMotherAdress() {
		return motherAdress;
	}

	public void setMotherAdress(String motherAdress) {
		this.motherAdress = motherAdress;
	}

	public String getMotherPhone() {
		return motherPhone;
	}

	public void setMotherPhone(String motherPhone) {
		this.motherPhone = motherPhone;
	}

	public String getGuardianName() {
		return guardianName;
	}

	public void setGuardianName(String guardianName) {
		this.guardianName = guardianName;
	}

	public String getGuardianAdress() {
		return guardianAdress;
	}

	public void setGuardianAdress(String guardianAdress) {
		this.guardianAdress = guardianAdress;
	}

	public String getGuardianPhone() {
		return guardianPhone;
	}

	public void setGuardianPhone(String guardianPhone) {
		this.guardianPhone = guardianPhone;
	}

	public List<String> getDormitory() {
		return dormitory;
	}

	public void setDormitory(List<String> dormitory) {
		this.dormitory = dormitory;
	}

	public List<String> getHowYouFoundUs() {
		return howYouFoundUs;
	}

	public void setHowYouFoundUs(List<String> howYouFoundUs) {
		this.howYouFoundUs = howYouFoundUs;
	}

	public List<String> getInfoAboutDocuments() {
		return infoAboutDocuments;
	}

	public void setInfoAboutDocuments(List<String> infoAboutDocuments) {
		this.infoAboutDocuments = infoAboutDocuments;
	}
	
	

}