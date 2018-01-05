package at.fh.ima.swengs.angularfighter.api.model;

import javax.persistence.*;


@Entity
@Table(name="Rank")

public class Rank {
	
	
	@Id
	@Column(name = "RankID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "description", nullable = false, length = 250)
	private String description;
	
	@Column(name = "abbreviation", nullable = false, length = 45)
	private String abbreviation;
	
    @Version
	long version;
    
    public Rank() {
    	
    }
    
	public Rank(String description, String abbreviation) {
		super();
		this.description = description;
		this.abbreviation = abbreviation;
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

	@Override
	public String toString() {
		return "Rank [id=" + id + ", description=" + description + ", abbreviation=" + abbreviation + "]";
	}
    
    
	

}
