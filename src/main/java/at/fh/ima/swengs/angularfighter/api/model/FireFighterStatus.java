package at.fh.ima.swengs.angularfighter.api.model;

import javax.persistence.*;


@Entity
@Table(name="FireFighterStatus")
public class FireFighterStatus {

	@Id
	@Column(name = "FireFighterStatusID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@Column(name = "description", nullable = false, length = 250)
	private String description;
	
	@Version
	long version;
	
	
	public FireFighterStatus() {
		
	}

	public FireFighterStatus(String description) {
		super();
		this.description = description;
	}


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "FireFighterStatus [id=" + id + ", description=" + description + "]";
	}
	
	
	
	
	
	

}
