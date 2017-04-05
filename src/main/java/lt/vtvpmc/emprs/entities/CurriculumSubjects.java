package lt.vtvpmc.emprs.entities;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "curriculum")
public class CurriculumSubjects implements Serializable {

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
	private int russian_II;
	private int english_II;
	private int german_II;
	private int design;
	private int art;
	private int theater;
	private int music;
	private int information_Technology;
	private int advanced_Lithuanian_Native;
	private int advanced_Lithuanian_State;
	private int advanced_Foreign_Language;
	private int advanced_History;
	private int advanced_Mathematics;
	private int advanced_Biology;
	private int advanced_Physics;
	private int advanced_Chemistry;
	private int chemistry_Module;
	private int biology_Module_I;
	private int biology_Module_II;
	private int physics_Module_I;
	private int physics_Module_II;
	private int physics_Module_III;
	private int mathematics_Module_I;
	private int mathematics_Module_II;
	private int mathematics_Module_III;
	private String club;
	private String wishes;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Student student;

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

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getRussian_II() {
		return russian_II;
	}

	public void setRussian_II(int russian_II) {
		this.russian_II = russian_II;
	}

	public int getEnglish_II() {
		return english_II;
	}

	public void setEnglish_II(int english_II) {
		this.english_II = english_II;
	}

	public int getGerman_II() {
		return german_II;
	}

	public void setGerman_II(int german_II) {
		this.german_II = german_II;
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

	public int getInformation_Technology() {
		return information_Technology;
	}

	public void setInformation_Technology(int information_Technology) {
		this.information_Technology = information_Technology;
	}

	public int getAdvanced_Lithuanian_Native() {
		return advanced_Lithuanian_Native;
	}

	public void setAdvanced_Lithuanian_Native(int advanced_Lithuanian_Native) {
		this.advanced_Lithuanian_Native = advanced_Lithuanian_Native;
	}

	public int getAdvanced_Lithuanian_State() {
		return advanced_Lithuanian_State;
	}

	public void setAdvanced_Lithuanian_State(int advanced_Lithuanian_State) {
		this.advanced_Lithuanian_State = advanced_Lithuanian_State;
	}

	public int getAdvanced_Foreign_Language() {
		return advanced_Foreign_Language;
	}

	public void setAdvanced_Foreign_Language(int advanced_Foreign_Language) {
		this.advanced_Foreign_Language = advanced_Foreign_Language;
	}

	public int getAdvanced_History() {
		return advanced_History;
	}

	public void setAdvanced_History(int advanced_History) {
		this.advanced_History = advanced_History;
	}

	public int getAdvanced_Mathematics() {
		return advanced_Mathematics;
	}

	public void setAdvanced_Mathematics(int advanced_Mathematics) {
		this.advanced_Mathematics = advanced_Mathematics;
	}

	public int getAdvanced_Biology() {
		return advanced_Biology;
	}

	public void setAdvanced_Biology(int advanced_Biology) {
		this.advanced_Biology = advanced_Biology;
	}

	public int getAdvanced_Physics() {
		return advanced_Physics;
	}

	public void setAdvanced_Physics(int advanced_Physics) {
		this.advanced_Physics = advanced_Physics;
	}

	public int getAdvanced_Chemistry() {
		return advanced_Chemistry;
	}

	public void setAdvanced_Chemistry(int advanced_Chemistry) {
		this.advanced_Chemistry = advanced_Chemistry;
	}

	public int getChemistry_Module() {
		return chemistry_Module;
	}

	public void setChemistry_Module(int chemistry_Module) {
		this.chemistry_Module = chemistry_Module;
	}

	public int getBiology_Module_I() {
		return biology_Module_I;
	}

	public void setBiology_Module_I(int biology_Module_I) {
		this.biology_Module_I = biology_Module_I;
	}

	public int getBiology_Module_II() {
		return biology_Module_II;
	}

	public void setBiology_Module_II(int biology_Module_II) {
		this.biology_Module_II = biology_Module_II;
	}

	public int getPhysics_Module_I() {
		return physics_Module_I;
	}

	public void setPhysics_Module_I(int physics_Module_I) {
		this.physics_Module_I = physics_Module_I;
	}

	public int getPhysics_Module_II() {
		return physics_Module_II;
	}

	public void setPhysics_Module_II(int physics_Module_II) {
		this.physics_Module_II = physics_Module_II;
	}

	public int getPhysics_Module_III() {
		return physics_Module_III;
	}

	public void setPhysics_Module_III(int physics_Module_III) {
		this.physics_Module_III = physics_Module_III;
	}

	public int getMathematics_Module_I() {
		return mathematics_Module_I;
	}

	public void setMathematics_Module_I(int mathematics_Module_I) {
		this.mathematics_Module_I = mathematics_Module_I;
	}

	public int getMathematics_Module_II() {
		return mathematics_Module_II;
	}

	public void setMathematics_Module_II(int mathematics_Module_II) {
		this.mathematics_Module_II = mathematics_Module_II;
	}

	public int getMathematics_Module_III() {
		return mathematics_Module_III;
	}

	public void setMathematics_Module_III(int mathematics_Module_III) {
		this.mathematics_Module_III = mathematics_Module_III;
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

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}
	
}