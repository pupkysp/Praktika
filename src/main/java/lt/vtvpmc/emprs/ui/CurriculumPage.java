package lt.vtvpmc.emprs.ui;

import java.io.Serializable;

import javax.validation.Valid;

import lt.vtvpmc.emprs.entities.CurriculumSubjects;
import lt.vtvpmc.emprs.repositories.CurriculumRepo;

public class CurriculumPage {
	public static final String NAV_SHOW_INDEX = "show-index";

	public static class CurriculumData implements Serializable {

		private static final long serialVersionUID = -8355552873418690458L;

		@Valid
		private CurriculumSubjects newCurriculumSubjects;

		public void init() {
			newCurriculumSubjects = new CurriculumSubjects();
		}

		public void setNewCurriculumSubjects(CurriculumSubjects newCurriculumSubjects) {
			this.newCurriculumSubjects = newCurriculumSubjects;
		}

		public CurriculumSubjects getNewCurriculumSubjects() {
			return newCurriculumSubjects;
		}
	}

	private CurriculumData data;
	private CurriculumRepo curriculumRepo;

	public String addNew() {
		curriculumRepo.save(data.newCurriculumSubjects);
		data.newCurriculumSubjects = new CurriculumSubjects();
		return NAV_SHOW_INDEX;
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
