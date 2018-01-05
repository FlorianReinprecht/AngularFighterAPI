package at.fh.ima.swengs.angularfighter.api.model;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.transaction.annotation.Transactional;

@RepositoryRestResource

public interface RankRepository extends PagingAndSortingRepository<Rank, Integer> {

	@Transactional
    Rank findByAbbreviation(String abbreviation);

	public Rank findById(int id);

}
