package at.fh.ima.swengs.angularfighter.api.model;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.transaction.annotation.Transactional;

@RepositoryRestResource
public interface FireEngineAbbreviationRepository extends PagingAndSortingRepository<FireEngineAbbreviation, Long> {

	@Transactional
	FireEngineAbbreviation findByAbbreviation(String abbreviation);

	public FireEngineAbbreviation findById(int id);
	
}
