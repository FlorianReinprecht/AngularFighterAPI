package at.fh.ima.swengs.angularfighter.api.model;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@RepositoryRestResource
public interface FireEngineRepository extends PagingAndSortingRepository<FireEngine, Long> {
	
	@Transactional
	//FireEngine findByBuildYear(String buildYear);
	//public List<FireEngine> findByFireBrigade(FireBrigade fireBrigade);
	public List<FireEngine> findByFireBrigade_Id(@Param("id")  long id);
	public List<FireEngine> findAllByOrderByModel();
	public List<FireEngine> findAllByOrderByPerformance();
	public List<FireEngine> findAllByOrderByBuildYear();
	public List<FireEngine> findByActive(@Param("active") String active);
	public List<FireEngine> findByAbbreviation_Abbreviation(@Param("abbreviation") String abbreviation);
	public List<FireEngine> findByModelContainingAllIgnoreCase(@Param("searchString") String searchString);
	
	public FireEngine findById(@Param("id")long id);
	//public FireEngine findByFireBrigadeAndId(FireBrigade fireBrigade, long id);

	//public void deleteByFireBrigadeAndId(FireBrigade fireBrigade, long id);
	
}
