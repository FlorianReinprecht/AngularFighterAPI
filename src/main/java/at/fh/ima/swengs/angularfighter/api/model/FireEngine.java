package at.fh.ima.swengs.angularfighter.api.model;

import javax.persistence.*;

import org.hibernate.annotations.Type;


@Entity
@Table(name="FireEngine")
public class FireEngine {
	
	@Id
	@Column(name = "FireEngineID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "model", nullable = false, length = 45)
	private String model;
	
	@Column(name = "licensePlate", nullable = false, length = 15)
	private String licensePlate;
	
	@Column(name = "performance", nullable = false, length = 10)
	private String performance;
	
	@Column(name = "buildYear", nullable = false, length = 4)
	private String buildYear;
	
	@Type(type = "org.hibernate.type.NumericBooleanType")
	private Boolean active;
	
	@ManyToOne
	private FireEngineAbbreviation abbreviation;
	
	@ManyToOne
	private FireBrigade fireBrigade;
	

    @Version
	long version;
    
    public FireEngine() {
    	
    }

	public FireEngine(String model, String licensePlate, String performance, String buildYear,
					  Boolean active, FireEngineAbbreviation abbreviation, FireBrigade fireBrigade) {
		super();
		this.model = model;
		this.licensePlate = licensePlate;
		this.performance = performance;
		this.buildYear = buildYear;
		this.active = active;
		this.abbreviation = abbreviation;
		this.fireBrigade = fireBrigade;
	}

	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getLicensePlate() {
		return licensePlate;
	}

	public void setLicensePlate(String licensePlate) {
		this.licensePlate = licensePlate;
	}

	public String getPerformance() {
		return performance;
	}

	public void setPerformance(String performance) {
		this.performance = performance;
	}

	public String getBuildYear() {
		return buildYear;
	}

	public void setBuildYear(String buildYear) {
		this.buildYear = buildYear;
	}

	public Boolean getActive() {
		return active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}

	public FireEngineAbbreviation getAbbreviation() {
		return abbreviation;
	}

	public void setAbbreviation(FireEngineAbbreviation abbreviation) {
		this.abbreviation = abbreviation;
	}

	public FireBrigade getFireBrigade() {
		return fireBrigade;
	}

	public void setFireBrigade(FireBrigade fireBrigade) {
		this.fireBrigade = fireBrigade;
	}
    
    
    
    	

}
