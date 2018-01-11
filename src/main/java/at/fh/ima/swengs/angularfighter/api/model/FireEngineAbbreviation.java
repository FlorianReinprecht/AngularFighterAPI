package at.fh.ima.swengs.angularfighter.api.model;

import javax.persistence.*;



@Entity
@Table(name="FireEngineAbbreviation")
public class FireEngineAbbreviation {
	
	
	@Id
	@Column(name = "FireEngineAbbreaviationID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "description", nullable = false, length = 250)
	private String description;
	
	@Column(name = "abbreviation", nullable = false, length = 45)
	private String abbreviation;
	
	@Column(name = "operatingLife", nullable = false, length = 20)
	private int operatingLife;
	
    @Version
	long version;
    
    public FireEngineAbbreviation() {
    	
    }

	public FireEngineAbbreviation(String description, String abbreviation, int operatingLife) {
		super();
		this.description = description;
		this.abbreviation = abbreviation;
		this.operatingLife = operatingLife;
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

	public String getAbbreviation() {
		return abbreviation;
	}

	public void setAbbreviation(String abbreviation) {
		this.abbreviation = abbreviation;
	}

	public int getOperatingLife() {
		return operatingLife;
	}

	public void setOperatingLife(int operatingLife) {
		this.operatingLife = operatingLife;
	}
    
}
