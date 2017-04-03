package lt.vtvpmc.emprs.repositories;

import java.util.List;

import lt.vtvpmc.emprs.entities.Education;


public interface EducationRepo {

	public Education findById(Long id);
	
	public List<Education> findAll();
	
	public void save(Education education);
	
	public void delete(Education education);
	
	public Education update(Education education);
	
}
