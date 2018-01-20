package at.fh.ima.swengs.angularfighter.api.model;

import javax.persistence.*;
//import java.util.Calendar;
//import org.springframework.format.annotation.DateTimeFormat;


@Entity
@Table(name="FireFighter")
public class FireFighter {

	@Id
	@Column(name = "FireFighterID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@Column(name = "title", length = 30)
	private String title;

	@Column(name = "surname", nullable = false, length = 30)
	private String surname;

	@Column(name = "name", nullable = false, length = 30)
	private String name;

	@Column(name = "gender", nullable = false, length = 1)
	private String gender;

	@Column(name = "dayOfBirth", nullable = false, length = 10)
	private String dayOfBirth;

	@ManyToOne
	private Rank rank;

	@ManyToOne
	private FireBrigade fireBrigade;

	@ManyToOne
	private FireFighterStatus fireFighterStatus;

/*
	@Column(name = "streetName", nullable = false, length = 45)
	private FireBrigade streetName;

	@Column(name = "postalCode", nullable = false, length = 8)
	private FireBrigade postalCode;

	@Column(name = "postTown", nullable = false, length = 45)
	private FireBrigade postTown;
*/

	//@Temporal(TemporalType.DATE)
	//@Column(name = "dayOfBirth", nullable = false)
	//@DateTimeFormat(pattern = "dd.MM.yyyy")
	//private Calendar dayOfBirth;

	@OneToOne(cascade = CascadeType.ALL)

	@Version
	long version;


	public FireFighter() {
	}

	public FireFighter(String title, String surname, String name, String gender, String dayOfBirth,
					   Rank rank, FireBrigade fireBrigade, FireFighterStatus fireFighterStatus
					   //,FireBrigade streetName, FireBrigade postalCode, FireBrigade postTown,
					   ) {
		super();
		this.title = title;
		this.surname = surname;
		this.name = name;
		this.gender = gender;
		this.dayOfBirth = dayOfBirth;

		this.rank = rank;
		this.fireBrigade = fireBrigade;
		this.fireFighterStatus = fireFighterStatus;
/*
		this.streetName = streetName;
		this.postalCode = postalCode;
		this.postTown = postTown;
*/
	}


	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getDayOfBirth() {
		return dayOfBirth;
	}

	public void setDayOfBirth(String dayOfBirth) {
		this.dayOfBirth = dayOfBirth;
	}


	public Rank getRank() {
		return rank;
	}

	public void setRank(Rank rank) {
		this.rank = rank;
	}

	public FireBrigade getFireBrigade() {
		return fireBrigade;
	}

	public void setFireBrigade(FireBrigade fireBrigade) {
		this.fireBrigade=fireBrigade;
	}

	public FireFighterStatus getFireFighterStatus() {
		return fireFighterStatus;
	}

	public void setFireFighterStatus(FireFighterStatus fireFighterStatus) {
		this.fireFighterStatus=fireFighterStatus;
	}

/*
	public FireBrigade getStreetName() {
		return streetName;
	}

	public void setStreetName(FireBrigade streetName) {
		this.streetName = streetName;
	}

	public FireBrigade getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(FireBrigade postalCode) {
		this.postalCode = postalCode;
	}

	public FireBrigade getPostTown() {
		return postTown;
	}

	public void setPostTown(FireBrigade postTown) {
		this.postTown = postTown;
	}
*/

/*
	@Override
	public String toString() {
		return "FireFighter [id=" + id + ", title=" + title + ", surname=" + surname + ", name=" + name + ", rank="
				+ rank + ", fireBrigade=" + fireBrigade + ", fireFighterStatus=" + fireFighterStatus + ", streetName="
				+ streetName + ", postalCode=" + postalCode + ", postTown=" + postTown + ", gender=" + gender
				+ ", dayOfBirth=" + dayOfBirth + "]";
	}

*/




}