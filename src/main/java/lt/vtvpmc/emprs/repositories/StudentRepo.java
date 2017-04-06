package lt.vtvpmc.emprs.repositories;

import java.util.Date;
import java.util.List;

import lt.vtvpmc.emprs.entities.Student;




public interface StudentRepo {

	public Student findById(Long id);
	
	public List<Student> findAll();
	
	public void save(Student student);
	
	public void delete(Student student);
	
	public Student update(Student student);
	
	public Student findByFNameLNameAndBDate(String firstName, String lastName, Date dateOfBirth);
	
}
