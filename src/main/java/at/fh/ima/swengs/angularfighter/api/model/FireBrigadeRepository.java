package at.fh.ima.swengs.angularfighter.api.model;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@RepositoryRestResource
public interface FireBrigadeRepository extends PagingAndSortingRepository<FireBrigade, Long> {

	@Transactional
	
	public List<FireBrigade> findByName(String name);
	public List<FireBrigade> findByPostalCode(String postalCode);
	public List<FireBrigade> findByPostTown(String postTown);
	public List<FireBrigade> findAllByOrderByName();
	public List<FireBrigade> findAllByOrderByPostTown();
	public List<FireBrigade> findByNameContainingAllIgnoreCase(String searchString);
	
	
	public FireBrigade findById(int id);
	public FireBrigade findByIdAndName(int id, String name);
	public void deleteByNameAndId(String name, int id);
	
}
