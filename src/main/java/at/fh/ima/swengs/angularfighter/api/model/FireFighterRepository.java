package at.fh.ima.swengs.angularfighter.api.model;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.transaction.annotation.Transactional;

@RepositoryRestResource

public interface FireFighterRepository extends PagingAndSortingRepository<FireFighter, Long> {

	@Transactional
	public List<FireFighter>findByFireBrigade(FireBrigade fireBrigade);
	public List<FireFighter>findByFireBrigade_Id(@Param("id")  long id);

	public List<FireFighter>findByName(@Param("name")  String name);
	public List<FireFighter>findBySurname(@Param("surname")  String surname);
	public List<FireFighter>findByFireFighterStatus_id(@Param("status")  long statusId);

	public List<FireFighter>findByRank_Abbreviation(String rank);
	public List<FireFighter>findByFireFighterStatus_Description(String status);
	public List<FireFighter>findByGender(String gender);
	public List<FireFighter>findByNameContainingOrSurnameContainingAllIgnoreCase(String name, String surname);
	public List<FireFighter>findByFireBrigade_Name(String fireBrigade);
	public List<FireFighter>findBySurnameContainingAllIgnoreCase(String surname);
	public List<FireFighter>findByNameContainingAllIgnoreCase(String name);
/*
	public List<FireFighter>findByStreetName(String streetName);
	public List<FireFighter>findByPostalCode(String postalCode);
	public List<FireFighter>findByPostTown(String postTown);
*/
	@Query("select e from FireFighter e where e.surname = :name or e.name = :name")
	public List<FireFighter> findByWhateverName(@Param("name") String searchString);
	
	public FireFighter findById(int id);
	public FireFighter findByFireBrigadeAndId(FireBrigade fireBrigade, int id);
	
	public void deleteByFireBrigadeAndId(FireBrigade fireBrigade, int id);

	public int countByGender(String gender);
	
	@Query(value = "SELECT count(*) as count, ff.fireBrigade_FireBrigadeID FROM FireFighter as ff GROUP BY ff.fireBrigade_FireBrigadeID ORDER BY count DESC LIMIT 5", nativeQuery=true)
	public List<Object[]>groupByFireBrigade();

}
