package lt.vtvpmc.emprs.repositories;

import java.util.List;

import lt.vtvpmc.emprs.entities.Request;



public interface RequestRepo {
	
	public Request findById(Long id);
	
	public List<Request> findAll();
	
	public void save(Request request);
	
	public void delete(Request request);
	
	public Request update(Request request);

}

