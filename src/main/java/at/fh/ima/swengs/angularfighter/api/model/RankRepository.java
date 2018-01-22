package at.fh.ima.swengs.angularfighter.api.model;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@RepositoryRestResource

public interface RankRepository extends PagingAndSortingRepository<Rank, Long> {

	@Transactional
    //Rank findByAbbreviation(String abbreviation);

	public Rank findById(long id);
	public List<Rank> findByAbbreviationContaining(@Param("abbreviation")  String abbreviation);
	public List<Rank> findByDescriptionContaining(@Param("description")  String description);
}
