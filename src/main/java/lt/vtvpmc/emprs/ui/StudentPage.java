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

	public static final String NAV_SHOW_VIEW = "show-view-page";

	public static final String NAV_SHOW_MAIN = "show-main-page";

	static final Logger log = LoggerFactory.getLogger(StudentPage.class);

	public static class StudentData implements Serializable {

		private static final long serialVersionUID = -2088646025586048142L;

		@Valid
		private Student newStudent;

		@Valid
		private Student currentStudent;

		@Valid
		private Education newEducation;

		@Valid
		private Education currentEducation;

		@Valid
		private StudentInfo newStudentInfo;

		@Valid
		private StudentInfo currentStudentInfo;

		@Valid
		private Request newRequest;

		@Valid
		private Request currentRequest;

		@Valid
		private ParentInfo newParentInfo;

		@Valid
		private ParentInfo currentParentInfo;

		@Valid
		private AdditionalInfo newAdditionalInfo;

		@Valid
		private AdditionalInfo currentAdditionalInfo;

		public void init() {

			newEducation = new Education();

			newStudentInfo = new StudentInfo();

			newParentInfo = new ParentInfo();

			newRequest = new Request();

			newStudent = new Student();

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

		public Education getCurrentEducation() {
			return currentEducation;
		}

		public void setCurrentEducation(Education currentEducation) {
			this.currentEducation = currentEducation;
		}

		public StudentInfo getCurrentStudentInfo() {
			return currentStudentInfo;
		}

		public void setCurrentStudentInfo(StudentInfo currentStudentInfo) {
			this.currentStudentInfo = currentStudentInfo;
		}

		public Request getCurrentRequest() {
			return currentRequest;
		}

		public void setCurrentRequest(Request currentRequest) {
			this.currentRequest = currentRequest;
		}

		public ParentInfo getCurrentParentInfo() {
			return currentParentInfo;
		}

		public void setCurrentParentInfo(ParentInfo currentParentInfo) {
			this.currentParentInfo = currentParentInfo;
		}

		public AdditionalInfo getCurrentAdditionalInfo() {
			return currentAdditionalInfo;
		}

		public void setCurrentAdditionalInfo(AdditionalInfo currentAdditionalInfo) {
			this.currentAdditionalInfo = currentAdditionalInfo;
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

	public String findStudentData() {

		if (data.newStudent == null || data.newStudent.getFirstName() == null || data.newStudent.getLastName() == null
				|| data.newStudent.getDateOfBirth() == null) {
			data.newStudent = new Student();
			return NAV_SHOW_VIEW;
		}

		Student st = null;
		try {
			st = studentRepo.findByFNameLNameAndBDate(data.newStudent.getFirstName(), data.newStudent.getLastName(),
					data.newStudent.getDateOfBirth());
		} catch (Exception e) {
			
			e.printStackTrace();
			data.newStudent = new Student();
			return NAV_SHOW_VIEW;
		}

		data.currentStudent = st;
		data.currentRequest = requestRepo.findById(st.getRequest().getId());
		data.currentStudentInfo = studentInfoRepo.findById(st.getStudentInfo().getId());
		data.currentParentInfo = parentInfoRepo.findById(st.getParentInfo().getId());
		data.currentEducation = educationRepo.findById(data.currentStudentInfo.getEducation().getId());

		data.currentAdditionalInfo = additionalInfoRepo.findById(data.currentRequest.getAdditionalInfo().getId());

		data.newStudent = new Student();

		return NAV_SHOW_VIEW;

	}

	public String fromViewToMain() {

		data.currentStudent = null;
		data.currentRequest = null;
		data.currentStudentInfo = null;
		data.currentParentInfo = null;
		data.currentEducation = null;

		return NAV_SHOW_MAIN;

	}

	public void listBeanInit() {
		listBean = new ListBean();
		listBean.init();

	}

	public Map<String, String> maritalStatusMap() {
		listBean.init();
		return listBean.getMaritalStatusMap();
	}

	public Map<String, String> educationMap() {
		listBean.init();
		return listBean.getEducationMap();
	}

	public Map<String, String> institutionTypeMap() {
		listBean.init();
		return listBean.getInstitutionTypeMap();
	}

	public Map<String, String> municipalityMap() {
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
