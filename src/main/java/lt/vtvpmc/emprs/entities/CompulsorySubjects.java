package lt.vtvpmc.emprs.entities;

import java.io.Serializable;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "curriculum")
public class CompulsorySubjects implements Serializable {

	private static final long serialVersionUID = -8794537808930413345L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long id;
	private int religion;
	private int ethic;
	private int lithuanian_A;
	private int lithuanian_B;
	private int native_Russian;
	private int native_Polish;
	private int history;
	private int geography;
	private int social;
	private int foreign_English;
	private int foreign_German;
	private int foreign_French;
	private int foreign_Russian;
	private int mathematics;
	private int biology;
	private int physics;
	private int chemistry;
	private int natural_Sciences;
	private int physical_Education;
	private int football;
	private int basketball;
	
	@Embedded
	private OptionalSubjects OptionalSubjects;

	public int getReligion() {
		return religion;
	}

	public void setReligion(int religion) {
		this.religion = religion;
	}

	public int getEthic() {
		return ethic;
	}

	public void setEthic(int ethic) {
		this.ethic = ethic;
	}

	public int getLithuanian_A() {
		return lithuanian_A;
	}

	public void setLithuanian_A(int lithuanian_A) {
		this.lithuanian_A = lithuanian_A;
	}

	public int getLithuanian_B() {
		return lithuanian_B;
	}

	public void setLithuanian_B(int lithuanian_B) {
		this.lithuanian_B = lithuanian_B;
	}

	public int getNative_Russian() {
		return native_Russian;
	}

	public void setNative_Russian(int native_Russian) {
		this.native_Russian = native_Russian;
	}

	public int getNative_Polish() {
		return native_Polish;
	}

	public void setNative_Polish(int native_Polish) {
		this.native_Polish = native_Polish;
	}

	public int getHistory() {
		return history;
	}

	public void setHistory(int history) {
		this.history = history;
	}

	public int getGeography() {
		return geography;
	}

	public void setGeography(int geography) {
		this.geography = geography;
	}

	public int getSocial() {
		return social;
	}

	public void setSocial(int social) {
		this.social = social;
	}

	public int getForeign_English() {
		return foreign_English;
	}

	public void setForeign_English(int foreign_English) {
		this.foreign_English = foreign_English;
	}

	public int getForeign_German() {
		return foreign_German;
	}

	public void setForeign_German(int foreign_German) {
		this.foreign_German = foreign_German;
	}

	public int getForeign_French() {
		return foreign_French;
	}

	public void setForeign_French(int foreign_French) {
		this.foreign_French = foreign_French;
	}

	public int getForeign_Russian() {
		return foreign_Russian;
	}

	public void setForeign_Russian(int foreign_Russian) {
		this.foreign_Russian = foreign_Russian;
	}

	public int getMathematics() {
		return mathematics;
	}

	public void setMathematics(int mathematics) {
		this.mathematics = mathematics;
	}

	public int getBiology() {
		return biology;
	}

	public void setBiology(int biology) {
		this.biology = biology;
	}

	public int getPhysics() {
		return physics;
	}

	public void setPhysics(int physics) {
		this.physics = physics;
	}

	public int getChemistry() {
		return chemistry;
	}

	public void setChemistry(int chemistry) {
		this.chemistry = chemistry;
	}

	public int getNatural_Sciences() {
		return natural_Sciences;
	}

	public void setNatural_Sciences(int natural_Sciences) {
		this.natural_Sciences = natural_Sciences;
	}

	public int getPhysical_Education() {
		return physical_Education;
	}

	public void setPhysical_Education(int physical_Education) {
		this.physical_Education = physical_Education;
	}

	public int getFootball() {
		return football;
	}

	public void setFootball(int football) {
		this.football = football;
	}

	public int getBasketball() {
		return basketball;
	}

	public void setBasketball(int basketball) {
		this.basketball = basketball;
	}

	public OptionalSubjects getOptionalSubjects() {
		return OptionalSubjects;
	}

	public void setOptionalSubjects(OptionalSubjects optionalSubjects) {
		OptionalSubjects = optionalSubjects;
	}

}