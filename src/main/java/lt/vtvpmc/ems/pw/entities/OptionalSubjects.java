package lt.vtvpmc.ems.pw.entities;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "curriculum")
public class OptionalSubjects implements Serializable {

	private static final long serialVersionUID = -1890088228622198395L;

	private int russianII;
	private int englishII;
	private int germanII;
	private int design;
	private int art;
	private int theater;
	private int music;
	private int informationTechnology;
	private int advancedLithuanianNative;
	private int advancedLithuanianState;
	private int advancedForeignLanguage;
	private int advancedHistory;
	private int advancedMathematics;
	private int advancedBiology;
	private int advancedPhysics;
	private int advancedChemistry;
	private int chemistryModule;
	private int biologyModuleI;
	private int biologyModuleII;
	private int physicsModuleI;
	private int physicsModuleII;
	private int physicsModuleIII;
	private int mathematicsModuleI;
	private int mathematicsModuleII;
	private int mathematicsModuleIII;
	private String club;
	private String wishes;

	public int getRussianII() {
		return russianII;
	}

	public void setRussianII(int russianII) {
		this.russianII = russianII;
	}

	public int getEnglishII() {
		return englishII;
	}

	public void setEnglishII(int englishII) {
		this.englishII = englishII;
	}

	public int getGermanII() {
		return germanII;
	}

	public void setGermanII(int germanII) {
		this.germanII = germanII;
	}

	public int getDesign() {
		return design;
	}

	public void setDesign(int design) {
		this.design = design;
	}

	public int getArt() {
		return art;
	}

	public void setArt(int art) {
		this.art = art;
	}

	public int getTheater() {
		return theater;
	}

	public void setTheater(int theater) {
		this.theater = theater;
	}

	public int getMusic() {
		return music;
	}

	public void setMusic(int music) {
		this.music = music;
	}

	public int getInformationTechnology() {
		return informationTechnology;
	}

	public void setInformationTechnology(int informationTechnology) {
		this.informationTechnology = informationTechnology;
	}

	public int getAdvancedLithuanianNative() {
		return advancedLithuanianNative;
	}

	public void setAdvancedLithuanianNative(int advancedLithuanianNative) {
		this.advancedLithuanianNative = advancedLithuanianNative;
	}

	public int getAdvancedLithuanianState() {
		return advancedLithuanianState;
	}

	public void setAdvancedLithuanianState(int advancedLithuanianState) {
		this.advancedLithuanianState = advancedLithuanianState;
	}

	public int getAdvancedForeignLanguage() {
		return advancedForeignLanguage;
	}

	public void setAdvancedForeignLanguage(int advancedForeignLanguage) {
		this.advancedForeignLanguage = advancedForeignLanguage;
	}

	public int getAdvancedHistory() {
		return advancedHistory;
	}

	public void setAdvancedHistory(int advancedHistory) {
		this.advancedHistory = advancedHistory;
	}

	public int getAdvancedMathematics() {
		return advancedMathematics;
	}

	public void setAdvancedMathematics(int advancedMathematics) {
		this.advancedMathematics = advancedMathematics;
	}

	public int getAdvancedBiology() {
		return advancedBiology;
	}

	public void setAdvancedBiology(int advancedBiology) {
		this.advancedBiology = advancedBiology;
	}

	public int getAdvancedPhysics() {
		return advancedPhysics;
	}

	public void setAdvancedPhysics(int advancedPhysics) {
		this.advancedPhysics = advancedPhysics;
	}

	public int getAdvancedChemistry() {
		return advancedChemistry;
	}

	public void setAdvancedChemistry(int advancedChemistry) {
		this.advancedChemistry = advancedChemistry;
	}

	public int getChemistryModule() {
		return chemistryModule;
	}

	public void setChemistryModule(int chemistryModule) {
		this.chemistryModule = chemistryModule;
	}

	public int getBiologyModuleI() {
		return biologyModuleI;
	}

	public void setBiologyModuleI(int biologyModuleI) {
		this.biologyModuleI = biologyModuleI;
	}

	public int getBiologyModuleII() {
		return biologyModuleII;
	}

	public void setBiologyModuleII(int biologyModuleII) {
		this.biologyModuleII = biologyModuleII;
	}

	public int getPhysicsModuleI() {
		return physicsModuleI;
	}

	public void setPhysicsModuleI(int physicsModuleI) {
		this.physicsModuleI = physicsModuleI;
	}

	public int getPhysicsModuleII() {
		return physicsModuleII;
	}

	public void setPhysicsModuleII(int physicsModuleII) {
		this.physicsModuleII = physicsModuleII;
	}

	public int getPhysicsModuleIII() {
		return physicsModuleIII;
	}

	public void setPhysicsModuleIII(int physicsModuleIII) {
		this.physicsModuleIII = physicsModuleIII;
	}

	public int getMathematicsModuleI() {
		return mathematicsModuleI;
	}

	public void setMathematicsModuleI(int mathematicsModuleI) {
		this.mathematicsModuleI = mathematicsModuleI;
	}

	public int getMathematicsModuleII() {
		return mathematicsModuleII;
	}

	public void setMathematicsModuleII(int mathematicsModuleII) {
		this.mathematicsModuleII = mathematicsModuleII;
	}

	public int getMathematicsModuleIII() {
		return mathematicsModuleIII;
	}

	public void setMathematicsModuleIII(int mathematicsModuleIII) {
		this.mathematicsModuleIII = mathematicsModuleIII;
	}

	public String getClub() {
		return club;
	}

	public void setClub(String club) {
		this.club = club;
	}

	public String getWishes() {
		return wishes;
	}

	public void setWishes(String wishes) {
		this.wishes = wishes;
	}
}