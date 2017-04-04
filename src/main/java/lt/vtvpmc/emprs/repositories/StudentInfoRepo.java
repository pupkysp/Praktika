package lt.vtvpmc.emprs.repositories;

import java.util.List;

import lt.vtvpmc.emprs.entities.StudentInfo;

public interface StudentInfoRepo {

		
		public StudentInfo findById(Long id);
		
		public List<StudentInfo> findAll();
		
		public void save(StudentInfo studentInfo);
		
		public void delete(StudentInfo studentInfo);
		
		public StudentInfo update(StudentInfo studentInfo);


}
