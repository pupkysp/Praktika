package lt.vtvpmc.emprs.ui;

import java.io.Serializable;

import javax.validation.Valid;

import lt.vtvpmc.emprs.entities.CurriculumSubjects;
import lt.vtvpmc.emprs.entities.Student;
import lt.vtvpmc.emprs.repositories.CurriculumRepo;

public class CurriculumPage {
	public static final String NAV_SHOW_INDEX = "show-index";

	public static class CurriculumData implements Serializable {

		private static final long serialVersionUID = -8355552873418690458L;

		@Valid
		private CurriculumSubjects newCurriculumSubjects;
		
		@Valid
		private Student student;

		public void init() {
			newCurriculumSubjects = new CurriculumSubjects();
			student = new Student();
		}

		public void setNewCurriculumSubjects(CurriculumSubjects newCurriculumSubjects) {
			this.newCurriculumSubjects = newCurriculumSubjects;
		}

		public CurriculumSubjects getNewCurriculumSubjects() {
			return newCurriculumSubjects;
		}

		public Student getStudent() {
			return student;
		}

		public void setStudent(Student student) {
			this.student = student;
		}
	}

	private CurriculumData data;
	private CurriculumRepo curriculumRepo;

	public String addNew() {
		curriculumRepo.save(data.newCurriculumSubjects);
		data.newCurriculumSubjects = new CurriculumSubjects();
		return NAV_SHOW_INDEX;
	}
	
	public void validate() {
		String education = curriculumRepo.getEducationByName(data.student.getFirstName(), data.student.getLastName());
		if(education == "Pagrindinis išsilavinimas"){
			data.newCurriculumSubjects.setStudent(curriculumRepo.getStudentByName(data.student.getFirstName(), data.student.getLastName()));
			//nebaigtas message
		} 
	}

	public CurriculumData getData() {
		return data;
	}

	public void setData(CurriculumData data) {
		this.data = data;
	}

	public CurriculumRepo getCurriculumRepo() {
		return curriculumRepo;
	}

	public void setCurriculumRepo(CurriculumRepo curriculumRepo) {
		this.curriculumRepo = curriculumRepo;
	}
}
