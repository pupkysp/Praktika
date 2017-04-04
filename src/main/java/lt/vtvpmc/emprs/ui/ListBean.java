package lt.vtvpmc.emprs.ui;

import java.io.Serializable;
import java.util.HashMap;

import java.util.Map;



public class ListBean implements Serializable {

	private static final long serialVersionUID = -6697908620358790529L;
	
	private Map<String,String> educationMap = new HashMap<String, String>();
	
	private Map<String,String> institutionTypeMap = new HashMap<String, String>();
	
	private Map<String,String> maritalStatusMap = new HashMap<String, String>();
	
	private Map<String,String> municipalityMap = new HashMap<String, String>();
	

	public void init() {
		
		this.addMaritalStatusMap();
		this.addInstitutionTypeMap();
		this.addEducationMap();
		this.addMunicipalityList();
	}
	
	private void addMaritalStatusMap(){
		
		maritalStatusMap.put("vedęs/ištekėjusi","vedęs/ištekėjusi");
		maritalStatusMap.put("nevedęs/netekėjusi","nevedęs/netekėjusi");
		maritalStatusMap.put("našlaitis(-ė)", "našlaitis(-ė)");
		
	}
	
	private void addInstitutionTypeMap(){
		
		institutionTypeMap.put("Ikimokyklinio ugdymo mokykla","Ikimokyklinio ugdymo mokykla");
		institutionTypeMap.put("Pradinė mokykla","Pradinė mokykla");
		institutionTypeMap.put("Pagrindinė mokykla","Pagrindinė mokykla");
		institutionTypeMap.put("Vidurinė mokykla","Vidurinė mokykla");
		institutionTypeMap.put("Gimnazija","Gimnazija");
		institutionTypeMap.put("Progimnazija","Progimnazija");
		institutionTypeMap.put("Profesinio mokymo įstaiga","Profesinio mokymo įstaiga");
		institutionTypeMap.put("Pedagoginė psichologinė tarnyba","Pedagoginė psichologinė tarnyba");
		institutionTypeMap.put("Mokytojų švietimo centras","Mokytojų švietimo centras");
		institutionTypeMap.put("Švietimo pagalbos tarnyba","Švietimo pagalbos tarnyba");
		institutionTypeMap.put("Profesinio orientavimo centras","Profesinio orientavimo centras");
		institutionTypeMap.put("Kitas švietimo teikėjas","Kitas švietimo teikėjas");
		institutionTypeMap.put("Neformaliojo suaugusiųjų švietimo mokykla","Neformaliojo suaugusiųjų švietimo mokykla");
		institutionTypeMap.put("Laisvasis mokytojas","Laisvasis mokytojas");
		institutionTypeMap.put("Kompetencijų vertinimo institucija","Kompetencijų vertinimo institucija");
		institutionTypeMap.put("Kolegija","Kolegija");
		institutionTypeMap.put("Universitetas","Universitetas");
		institutionTypeMap.put("Mokslinių tyrimų institutas","Mokslinių tyrimų institutas");
		
	}
	
	private void addEducationMap() {
		
		educationMap.put("Aukštasis išsilavinimas","Aukštasis išsilavinimas");
		educationMap.put("Aukštesnysis išsilavinimas","Aukštesnysis išsilavinimas");
		educationMap.put("Specialusis vidurinis išsilavinimas","Specialusis vidurinis išsilavinimas");
		educationMap.put("Vidurinis išsilavinimas","Vidurinis išsilavinimas");
		educationMap.put("Pagrindinis išsilavinimas","Pagrindinis išsilavinimas");
		educationMap.put("Pradinis išsilavinimas","Pradinis išsilavinimas");
		educationMap.put("Nereglamentuojamas","Nereglamentuojamas");
		educationMap.put("Aukštasis universitetinis išsilavinimas","Aukštasis universitetinis išsilavinimas");
		educationMap.put("Aukštasis koleginis","Aukštasis koleginis");
		
	}
	
	private void addMunicipalityList(){
		
		municipalityMap.put("Akmenės rajono savivaldybė","Akmenės rajono savivaldybė");
		municipalityMap.put("Alytaus miesto savivaldybė","Alytaus miesto savivaldybė");
		municipalityMap.put("Alytaus rajono savivaldybė","Alytaus rajono savivaldybė");
		municipalityMap.put("Anykščių rajono savivaldybė","Anykščių rajono savivaldybė");
		municipalityMap.put("Birštono savivaldybė","Birštono savivaldybė");
		municipalityMap.put("Biržų rajono savivaldybė","Biržų rajono savivaldybė");
		municipalityMap.put("Druskininkų savivaldybė","Druskininkų savivaldybė");
		municipalityMap.put("Elektrėnų savivaldybė","Elektrėnų savivaldybė");
		municipalityMap.put("Ignalinos rajono savivaldybė","Ignalinos rajono savivaldybė");
		municipalityMap.put("Jonavos rajono savivaldybė","Jonavos rajono savivaldybė");
		municipalityMap.put("Joniškio rajono savivaldybė","Joniškio rajono savivaldybė");
		municipalityMap.put("Jurbarko rajono savivaldybė","Jurbarko rajono savivaldybė");
		municipalityMap.put("Kaišiadorių rajono savivaldybė","Kaišiadorių rajono savivaldybė");
		municipalityMap.put("Kalvarijos savivaldybė","Kalvarijos savivaldybė");
		municipalityMap.put("Kauno miesto savivaldybė","Kauno miesto savivaldybė");
		municipalityMap.put("Kauno rajono savivaldybė","Kauno rajono savivaldybė");
		municipalityMap.put("Kazlų Rūdos savivaldybė","Kazlų Rūdos savivaldybė");
		municipalityMap.put("Kėdainių rajono savivaldybė","Kėdainių rajono savivaldybė");
		municipalityMap.put("Kelmės rajono savivaldybė","Kelmės rajono savivaldybė");
		municipalityMap.put("Klaipėdos miesto savivaldybė","Klaipėdos miesto savivaldybė");
		municipalityMap.put("Klaipėdos rajono savivaldybė","Klaipėdos rajono savivaldybė");
		municipalityMap.put("Kretingos rajono savivaldybė","Kretingos rajono savivaldybė");
		municipalityMap.put("Kupiškio rajono savivaldybė","Kupiškio rajono savivaldybė");
		municipalityMap.put("Lazdijų rajono savivaldybė","Lazdijų rajono savivaldybė");
		municipalityMap.put("Marijampolės savivaldybė","Marijampolės savivaldybė");
		municipalityMap.put("Mažeikių rajono savivaldybė","Mažeikių rajono savivaldybė");
		municipalityMap.put("Molėtų rajono savivaldybė","Molėtų rajono savivaldybė");
		municipalityMap.put("Neringos savivaldybė","Neringos savivaldybė");
		municipalityMap.put("Pagėgių savivaldybė","Pagėgių savivaldybė");
		municipalityMap.put("Pakruojo rajono savivaldybė","Pakruojo rajono savivaldybė");
		municipalityMap.put("Palangos miesto savivaldybė","Palangos miesto savivaldybė");
		municipalityMap.put("Panevėžio miesto savivaldybė","Panevėžio miesto savivaldybė");
		municipalityMap.put("Panevėžio rajono savivaldybė","Panevėžio rajono savivaldybė");
		municipalityMap.put("Pasvalio rajono savivaldybė","Pasvalio rajono savivaldybė");
		municipalityMap.put("Plungės rajono savivaldybė","Plungės rajono savivaldybė");
		municipalityMap.put("Prienų rajono savivaldybė","Prienų rajono savivaldybė");
		municipalityMap.put("Radviliškio rajono savivaldybė","Radviliškio rajono savivaldybė");
		municipalityMap.put("Raseinių rajono savivaldybė","Raseinių rajono savivaldybė");
		municipalityMap.put("Rietavo savivaldybė","Rietavo savivaldybė");
		municipalityMap.put("Rokiškio rajono savivaldybė","Rokiškio rajono savivaldybė");
		municipalityMap.put("Skuodo rajono savivaldybė","Skuodo rajono savivaldybė");
		municipalityMap.put("Šakių rajono savivaldybė","Šakių rajono savivaldybė");
		municipalityMap.put("Šalčininkų rajono savivaldybė","Šalčininkų rajono savivaldybė");
		municipalityMap.put("Šiaulių miesto savivaldybė","Šiaulių miesto savivaldybė");
		municipalityMap.put("Šiaulių rajono savivaldybė","Šiaulių rajono savivaldybė");
		municipalityMap.put("Šilalės rajono savivaldybė","Šilalės rajono savivaldybė");
		municipalityMap.put("Šilutės rajono savivaldybė","Šilutės rajono savivaldybė");
		municipalityMap.put("Širvintų rajono savivaldybė","Širvintų rajono savivaldybė");
		municipalityMap.put("Švenčionių rajono savivaldybė","Švenčionių rajono savivaldybė");
		municipalityMap.put("Tauragės rajono savivaldybė","Tauragės rajono savivaldybė");
		municipalityMap.put("Telšių rajono savivaldybė","Telšių rajono savivaldybė");
		municipalityMap.put("Trakų rajono savivaldybė","Trakų rajono savivaldybė");
		municipalityMap.put("Ukmergės rajono savivaldybė","Ukmergės rajono savivaldybė");
		municipalityMap.put("Utenos rajono savivaldybė","Utenos rajono savivaldybė");
		municipalityMap.put("Varėnos rajono savivaldybė","Varėnos rajono savivaldybė");
		municipalityMap.put("Vilkaviškio rajono savivaldybė","Vilkaviškio rajono savivaldybė");
		municipalityMap.put("Vilniaus miesto savivaldybė","Vilniaus miesto savivaldybė");
		municipalityMap.put("Vilniaus rajono savivaldybė","Vilniaus rajono savivaldybė");
		municipalityMap.put("Visagino savivaldybė","Visagino savivaldybė");
		municipalityMap.put("Zarasų rajono savivaldybė","Zarasų rajono savivaldybė");
	}


	public Map<String, String> getEducationMap() {
		return educationMap;
	}

	public Map<String, String> getInstitutionTypeMap() {
		return institutionTypeMap;
	}

	public Map<String, String> getMaritalStatusMap() {
		return maritalStatusMap;
	}

	public Map<String, String> getMunicipalityMap() {
		return municipalityMap;
	}




	
	
}
