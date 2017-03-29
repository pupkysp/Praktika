package lt.vtvpmc.emprs.ui;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


import lt.vtvpmc.emprs.entities.Request;
import lt.vtvpmc.emprs.entities.Student;
import lt.vtvpmc.emprs.repositories.RequestRepo;
import lt.vtvpmc.emprs.repositories.StudentRepo;




public class StudentPage {
	
	public static final String NAV_SHOW_INDEX = "show-index-page";
	
	static final Logger log = LoggerFactory.getLogger(StudentPage.class);
	
	public static class StudentData implements Serializable {		

		private static final long serialVersionUID = -2088646025586048142L;
		
		@Valid
		private Student newStudent;
		
		@Valid
		private Student currentStudent;
		
		private List<Student> foundStudents;
		
		@Valid
		private Request newRequest;
		
		
		
		
		public void init() {
			
			newRequest = new Request();
			
			newStudent = new Student();
			
			foundStudents = new ArrayList<Student>();
		}

		
		
		public Request getNewRequest() {
			return newRequest;
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

		
	}
	
	private StudentData data;
	
	private StudentRepo studentRepo;
	
	private RequestRepo requestRepo;
	
	
	public String addNew() {
		
		
		log.debug("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
//		Address a = data.newAddress;
//		a.setStudent(data.newStudent);
		data.newStudent.setRequest(data.newRequest);
		
		studentRepo.save(data.newStudent);
//		addressRepo.save(a);
		
		
		
		data.newStudent = new Student();
		data.newRequest = new Request();
		return NAV_SHOW_INDEX;
		
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


}

























