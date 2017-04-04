package lt.vtvpmc.emprs.ui;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import lt.vtvpmc.emprs.entities.AdditionalInfo;
import lt.vtvpmc.emprs.entities.Education;
import lt.vtvpmc.emprs.entities.ParentInfo;
import lt.vtvpmc.emprs.entities.Request;
import lt.vtvpmc.emprs.entities.Student;
import lt.vtvpmc.emprs.entities.StudentInfo;
import lt.vtvpmc.emprs.repositories.AdditionalInfoRepo;
import lt.vtvpmc.emprs.repositories.EducationRepo;
import lt.vtvpmc.emprs.repositories.ParentInfoRepo;
import lt.vtvpmc.emprs.repositories.RequestRepo;
import lt.vtvpmc.emprs.repositories.StudentInfoRepo;
import lt.vtvpmc.emprs.repositories.StudentRepo;




public class StudentPage {
	
	public static final String NAV_SHOW_INDEX = "show-index-page";
	
	static final Logger log = LoggerFactory.getLogger(StudentPage.class);
	
	public static class StudentData implements Serializable {		

		private static final long serialVersionUID = -2088646025586048142L;
		
		@Valid
		private Student newStudent;
		
		@Valid
		private Education newEducation;
		
		@Valid
		private StudentInfo newStudentInfo;
		
		@Valid
		private Student currentStudent;
		
		private List<Student> foundStudents;
		
		@Valid
		private Request newRequest;
		
		@Valid
		private ParentInfo newParentInfo;
		
		@Valid
		private AdditionalInfo newAdditionalInfo;
			
		
		public void init() {
			
			newEducation = new Education();
			
			newStudentInfo = new StudentInfo();
			
			newParentInfo = new ParentInfo();
			
			newRequest = new Request();
			
			newStudent = new Student();
			
			foundStudents = new ArrayList<Student>();
			
			newAdditionalInfo = new AdditionalInfo();
			
		}

		
		
		public Request getNewRequest() {
			return newRequest;
		}



		public Education getNewEducation() {
			return newEducation;
		}



		public void setNewEducation(Education newEducation) {
			this.newEducation = newEducation;
		}



		public StudentInfo getNewStudentInfo() {
			return newStudentInfo;
		}



		public void setNewStudentInfo(StudentInfo newStudentInfo) {
			this.newStudentInfo = newStudentInfo;
		}



		public ParentInfo getNewParentInfo() {
			return newParentInfo;
		}



		public void setNewParentInfo(ParentInfo newParentInfo) {
			this.newParentInfo = newParentInfo;
		}



		public void setNewRequest(Request newRequest) {
			this.newRequest = newRequest;
		}

		public Student getNewStudent() {
			return newStudent;
		}

		public void setNewStudent(Student newStudent) {
			this.newStudent = newStudent;
		}

		public Student getCurrentStudent() {
			return currentStudent;
		}

		public void setCurrentStudent(Student currentStudent) {
			this.currentStudent = currentStudent;
		}

		public List<Student> getFoundStudents() {
			return foundStudents;
		}

		public void setFoundStudents(List<Student> foundStudents) {
			this.foundStudents = foundStudents;
		}

		public AdditionalInfo getNewAdditionalInfo() {
			return newAdditionalInfo;
		}

		public void setNewAdditionalInfo(AdditionalInfo newAdditionalInfo) {
			this.newAdditionalInfo = newAdditionalInfo;
		}

		
	}

	private ListBean listBean;
	
	private StudentData data;
	
	private StudentRepo studentRepo;
	
	private RequestRepo requestRepo;
	
	private ParentInfoRepo parentInfoRepo;
	
	private StudentInfoRepo studentInfoRepo;
	
	private EducationRepo educationRepo;
	
	private AdditionalInfoRepo additionalInfoRepo;
	
	public String addNew() {
		
		
		log.debug("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");

		data.newRequest.setAdditionalInfo(data.newAdditionalInfo);
		
		data.newStudent.setRequest(data.newRequest);
		
		data.newStudent.setParentInfo(data.newParentInfo);
		
		data.newStudentInfo.setEducation(data.newEducation);
		
		data.newStudent.setStudentInfo(data.newStudentInfo);
		
		studentRepo.save(data.newStudent);
		
		data.newEducation = new Education();
		
		data.newParentInfo = new ParentInfo();
		
		data.newStudentInfo = new StudentInfo();
		
		data.newStudent = new Student();
		
		data.newRequest = new Request();
		
		data.newAdditionalInfo = new AdditionalInfo();
		
		return NAV_SHOW_INDEX;
		
	}
		
	
	public void listBeanInit() {
		listBean = new ListBean();
		listBean.init();
		
	}
	
	public Map<String,String> maritalStatusMap(){
		listBean.init();
		return listBean.getMaritalStatusMap();
	}
	public Map<String,String> educationMap(){
		listBean.init();
		return listBean.getEducationMap();
	}
	public Map<String,String> institutionTypeMap(){
		listBean.init();
		return listBean.getInstitutionTypeMap();
	}
	public Map<String,String> municipalityMap(){
		this.listBeanInit();
		return listBean.getMunicipalityMap();
	}
	
	public StudentInfoRepo getStudentInfoRepo() {
		return studentInfoRepo;
	}

	public EducationRepo getEducationRepo() {
		return educationRepo;
	}


	public void setEducationRepo(EducationRepo educationRepo) {
		this.educationRepo = educationRepo;
	}



	public void setStudentInfoRepo(StudentInfoRepo studentInfoRepo) {
		this.studentInfoRepo = studentInfoRepo;
	}



	public ParentInfoRepo getParentInfoRepo() {
		return parentInfoRepo;
	}

	public ListBean getListBean() {
		return listBean;
	}

	public void setListBean(ListBean listBean) {
		this.listBean = listBean;
	}



	public void setParentInfoRepo(ParentInfoRepo parentInfoRepo) {
		this.parentInfoRepo = parentInfoRepo;
	}



	public RequestRepo getRequestRepo() {
		return requestRepo;
	}

	public void setRequestRepo(RequestRepo requestRepo) {
		this.requestRepo = requestRepo;
	}

	public StudentData getData() {
		return data;
	}

	public void setData(StudentData data) {
		this.data = data;
	}

	public StudentRepo getStudentRepo() {
		return studentRepo;
	}

	public void setStudentRepo(StudentRepo studentRepo) {
		this.studentRepo = studentRepo;
	}


	public AdditionalInfoRepo getAdditionalInfoRepo() {
		return additionalInfoRepo;
	}


	public void setAdditionalInfoRepo(AdditionalInfoRepo additionalInfoRepo) {
		this.additionalInfoRepo = additionalInfoRepo;
	}




}

























