package at.fh.ima.swengs.angularfighter.api.model;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.transaction.annotation.Transactional;

@RepositoryRestResource
public interface FireFighterStatusRepository extends PagingAndSortingRepository<FireFighterStatus, Long> {

	@Transactional
    FireFighterStatus findByDescription(String fireFighterStatusName);

	public FireFighterStatus findById(int id);

}
