package lt.vtvpmc.emprs.entities;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class AdditionalInfo implements Serializable{

	private static final long serialVersionUID = 1373217311645058754L;
	
	@Id
	@GeneratedValue
	private Long id;
	
	private boolean fromFriends;
	
	private boolean fromWeb;
	
	private boolean fromSchool;
	
	private boolean fromAds;
	
	private boolean fromPublication;
	
	private boolean fromProf;
	
	private boolean other;
	
	@OneToOne(cascade = CascadeType.ALL, mappedBy = "additionalInfo")
	@JoinColumn(name = "request_id")
	private Request request;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public boolean isFromFriends() {
		return fromFriends;
	}

	public void setFromFriends(boolean fromFriends) {
		this.fromFriends = fromFriends;
	}

	public boolean isFromWeb() {
		return fromWeb;
	}

	public void setFromWeb(boolean fromWeb) {
		this.fromWeb = fromWeb;
	}


	public boolean isFromSchool() {
		return fromSchool;
	}

	public void setFromSchool(boolean fromSchool) {
		this.fromSchool = fromSchool;
	}

	public boolean isFromAds() {
		return fromAds;
	}

	public void setFromAds(boolean fromAds) {
		this.fromAds = fromAds;
	}

	public boolean isFromPublication() {
		return fromPublication;
	}

	public void setFromPublication(boolean fromPublication) {
		this.fromPublication = fromPublication;
	}

	public boolean isFromProf() {
		return fromProf;
	}

	public void setFromProf(boolean fromProf) {
		this.fromProf = fromProf;
	}

	public boolean isOther() {
		return other;
	}

	public void setOther(boolean other) {
		this.other = other;
	}

	public Request getRequest() {
		return request;
	}

	public void setRequest(Request request) {
		this.request = request;
	}
	

}
