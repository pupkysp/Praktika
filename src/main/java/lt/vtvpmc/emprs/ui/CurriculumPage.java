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
		
		private double mandatorySubjectsHours;
		private double optionalSubjectsHours;
		private double totalCurriculumHours;

		public void init() {
			newCurriculumSubjects = new CurriculumSubjects();
			student = new Student();
			mandatorySubjectsHours = 0;
			optionalSubjectsHours = 0;
			totalCurriculumHours = 0;
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

		public double getMandatorySubjectsHours() {
			return mandatorySubjectsHours;
		}

		public void setMandatorySubjectsHours(int mandatorySubjectsHours) {
			this.mandatorySubjectsHours = mandatorySubjectsHours;
		}

		public double getOptionalSubjectsHours() {
			return optionalSubjectsHours;
		}

		public void setOptionalSubjectsHours(int optionalSubjectsHours) {
			this.optionalSubjectsHours = optionalSubjectsHours;
		}

		public double getTotalCurriculumHours() {
			return totalCurriculumHours;
		}

		public void setTotalCurriculumHours(int totalCurriculumHours) {
			this.totalCurriculumHours = totalCurriculumHours;
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
		data.newCurriculumSubjects
				.setStudent(curriculumRepo.getStudentByName(data.student.getFirstName(), data.student.getLastName()));
		// nebaigtas message
	}

	public void showCurriculum() {
		Long id = curriculumRepo.getStudentIdByName(data.student.getFirstName(), data.student.getLastName());
		data.newCurriculumSubjects = curriculumRepo.getCurriculumByID(id);
		mandatorySubjectsHours();
		optionalSubjectsHours();
		totalCurriculumHours();
	}

	public void mandatorySubjectsHours() {
		Long id = curriculumRepo.getStudentIdByName(data.student.getFirstName(), data.student.getLastName());
		data.mandatorySubjectsHours = curriculumRepo.getMandatorySubjectsTotalHoursByStudentId(id);
	}

	public void optionalSubjectsHours() {
		Long id = curriculumRepo.getStudentIdByName(data.student.getFirstName(), data.student.getLastName());
		data.optionalSubjectsHours = curriculumRepo.getOptionalSubjectsTotalHoursByStudentId(id);
	}

	public void totalCurriculumHours() {
		Long id = curriculumRepo.getStudentIdByName(data.student.getFirstName(), data.student.getLastName());
		data.totalCurriculumHours = curriculumRepo.getMandatorySubjectsTotalHoursByStudentId(id)
				+ curriculumRepo.getOptionalSubjectsTotalHoursByStudentId(id);
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
