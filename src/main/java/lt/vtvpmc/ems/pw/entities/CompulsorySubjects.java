package lt.vtvpmc.ems.pw.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "curriculum")
public class CompulsorySubjects implements Serializable {

	private static final long serialVersionUID = -8794537808930413345L;

	private int religion;
	private int ethic;
	private int lithuanianA;
	private int lithuanianB;
	private int nativeRussian;
	private int nativePolish;
	private int history;
	private int geography;
	private int social;
	private int foreignEnglish;
	private int foreignGerman;
	private int foreignFrench;
	private int foreignRussian;
	private int mathematics;
	private int biology;
	private int physics;
	private int chemistry;
	private int naturalSciences;
	private int physicalEducation;
	private int football;
	private int basketball;

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

	public int getLithuanianA() {
		return lithuanianA;
	}

	public void setLithuanianA(int lithuanianA) {
		this.lithuanianA = lithuanianA;
	}

	public int getLithuanianB() {
		return lithuanianB;
	}

	public void setLithuanianB(int lithuanianB) {
		this.lithuanianB = lithuanianB;
	}

	public int getNativeRussian() {
		return nativeRussian;
	}

	public void setNativeRussian(int nativeRussian) {
		this.nativeRussian = nativeRussian;
	}

	public int getNativePolish() {
		return nativePolish;
	}

	public void setNativePolish(int nativePolish) {
		this.nativePolish = nativePolish;
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

	public int getForeignEnglish() {
		return foreignEnglish;
	}

	public void setForeignEnglish(int foreignEnglish) {
		this.foreignEnglish = foreignEnglish;
	}

	public int getForeignGerman() {
		return foreignGerman;
	}

	public void setForeignGerman(int foreignGerman) {
		this.foreignGerman = foreignGerman;
	}

	public int getForeignFrench() {
		return foreignFrench;
	}

	public void setForeignFrench(int foreignFrench) {
		this.foreignFrench = foreignFrench;
	}

	public int getForeignRussian() {
		return foreignRussian;
	}

	public void setForeignRussian(int foreignRussian) {
		this.foreignRussian = foreignRussian;
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

	public int getNaturalSciences() {
		return naturalSciences;
	}

	public void setNaturalSciences(int naturalSciences) {
		this.naturalSciences = naturalSciences;
	}

	public int getPhysicalEducation() {
		return physicalEducation;
	}

	public void setPhysicalEducation(int physicalEducation) {
		this.physicalEducation = physicalEducation;
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

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}