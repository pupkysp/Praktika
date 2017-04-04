package lt.vtvpmc.emprs.repositories;

import java.util.List;

import lt.vtvpmc.emprs.entities.ParentInfo;



public interface ParentInfoRepo {
	
	public ParentInfo findById(Long id);
	
	public List<ParentInfo> findAll();
	
	public void save(ParentInfo parentInfo);
	
	public void delete(ParentInfo parentInfo);
	
	public ParentInfo update(ParentInfo parentInfo);

}
