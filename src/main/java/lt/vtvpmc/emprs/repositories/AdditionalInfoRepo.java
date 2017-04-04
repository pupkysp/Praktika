package lt.vtvpmc.emprs.repositories;

import java.util.List;

import lt.vtvpmc.emprs.entities.AdditionalInfo;

public interface AdditionalInfoRepo {
	
	public AdditionalInfo findById(Long id);
	
	public List<AdditionalInfo> findAll();
	
	public void save(AdditionalInfo additionalInfo);
	
	public void delete(AdditionalInfo additionalInfo);
	
	public AdditionalInfo update(AdditionalInfo additionalInfo);

}
