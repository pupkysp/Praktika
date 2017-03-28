package lt.vtvpmc.ems.pw.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;

@Entity
public class Student implements Serializable {

	private static final long serialVersionUID = 8792058981525206917L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long id;

	@NotNull
	@NotBlank
	private String firstName;

	@NotNull
	@NotBlank
	private String lastName;

	@NotNull
	@Temporal(TemporalType.TIMESTAMP)
	private Date birthDate;

	private String address;

	private List<String> municipality;

	private String phoneNumber;

	private String email;

	private List<String> education;

	private String nameOfSchool;

	private String graduationYear;

	private List<String> maritalStatus; //

	private String profession;

	private String nameOfInstitution;

	private String typeOfInstitution;

	private String yearOfInstitutionGraduation; //

	@Temporal(TemporalType.TIMESTAMP)
	private Date requestDate;

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

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public List<String> getMunicipality() {
		return municipality;
	}

	public void setMunicipality(List<String> municipality) {
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

	public List<String> getEducation() {
		return education;
	}

	public void setEducation(List<String> education) {
		this.education = education;
	}

	public String getNameOfSchool() {
		return nameOfSchool;
	}

	public void setNameOfSchool(String nameOfSchool) {
		this.nameOfSchool = nameOfSchool;
	}

	public String getGraduationYear() {
		return graduationYear;
	}

	public void setGraduationYear(String graduationYear) {
		this.graduationYear = graduationYear;
	}

	public List<String> getMaritalStatus() {
		return maritalStatus;
	}

	public void setMaritalStatus(List<String> maritalStatus) {
		this.maritalStatus = maritalStatus;
	}

	public String getProfession() {
		return profession;
	}

	public void setProfession(String profession) {
		this.profession = profession;
	}

	public String getNameOfInstitution() {
		return nameOfInstitution;
	}

	public void setNameOfInstitution(String nameOfInstitution) {
		this.nameOfInstitution = nameOfInstitution;
	}

	public String getTypeOfInstitution() {
		return typeOfInstitution;
	}

	public void setTypeOfInstitution(String typeOfInstitution) {
		this.typeOfInstitution = typeOfInstitution;
	}

	public String getYearOfInstitutionGraduation() {
		return yearOfInstitutionGraduation;
	}

	public void setYearOfInstitutionGraduation(String yearOfInstitutionGraduation) {
		this.yearOfInstitutionGraduation = yearOfInstitutionGraduation;
	}

	public Date getRequestDate() {
		return requestDate;
	}

	public void setRequestDate(Date requestDate) {
		this.requestDate = requestDate;
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


}
// Jei mokosi antrą kartą, papildomai pateikti šiuos duomenis:
// - įgyta specialybė
// - institucijos pavadinimas
// - institucijos tipas
// - baigimo metai
// Prašymas (informacija apie prašymą):
// - priėmimo prašymo data
// - grupė
// - pakopa
// Pridedama prie prašymo (checkbox):
// - išsilavinimo dokumentas
// - sveikatos pažymėjimas
// - nuotraukos 3x4 (2-4 vnt.)
// - paso kopija (tapatybės kortelės kopija)
// - šauktinio liudijimas
// - stojamasis mokestis
// Duomenys apie tėvus/globėjus:
// - tėvas (vardas, pavardė)
// - tėvo adresas (gyvenamoji vieta)
// - tėvo telefonas
// - motina (vardas, pavardė)
// 3
// - motinos adresas (gyvenamoji vieta)
// - motinos telefonas
// - globėjas(-a) (vardas, pavardė)
// - globėjo(-os) adresas (gyvenamoji vieta)
// - globėjo(-os) telefonas
// Papildoma informacija (anketa):
// - ar reikalingas bendrabutis (pasirinkimas: taip/ne)
// - iš kur sužinojote apie mūsų įstaigą (pasirinkimas: iš draugų