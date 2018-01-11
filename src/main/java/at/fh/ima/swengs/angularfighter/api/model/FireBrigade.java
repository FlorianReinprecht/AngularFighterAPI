package at.fh.ima.swengs.angularfighter.api.model;

import javax.persistence.*;


@Entity
@Table(name="FireBrigade")
public class FireBrigade {
	
	@Id
	@Column(name = "FireBrigadeID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "name", nullable = false, length = 45)
    private String name;
    
	@Column(name = "streetName", nullable = false, length = 45)
	private String streetName;

	@Column(name = "postalCode", nullable = false, length = 8)
	private String postalCode; 

	@Column(name = "postTown", nullable = false, length = 45)
    private String postTown;
    
    @Version
	long version;


    public FireBrigade() {
    	
    }
    
	public FireBrigade(String name, String streetName, String postalCode, String postTown) {
		super();
		this.name = name;
		this.streetName = streetName;
		this.postalCode = postalCode;
		this.postTown = postTown;
	}

	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStreetName() {
		return streetName;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public String getPostTown() {
		return postTown;
	}

	public void setPostTown(String postTown) {
		this.postTown = postTown;
	}

	@Override
	public String toString() {
		return "FireBrigade [id=" + id + ", name=" + name + ", streetName=" + streetName + ", postalCode="
				+ postalCode + ", postTown=" + postTown + "]";
	}
    
	
    

}
