package at.fh.ima.swengs.angularfighter.api.model;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@RepositoryRestResource
public interface FireEngineAbbreviationRepository extends PagingAndSortingRepository<FireEngineAbbreviation, Long> {

	@Transactional
	//FireEngineAbbreviation findByAbbreviation(String abbreviation);

	public FireEngineAbbreviation findById(int id);
	public List<FireEngineAbbreviation> findByAbbreviationContaining(@Param("abbreviation")  String abbreviation);
	public List<FireEngineAbbreviation> findByDescriptionContaining(@Param("description")  String description);
}
