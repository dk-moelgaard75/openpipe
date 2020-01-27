package dk.moelgaards.openpipe.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import dk.moelgaards.openpipe.models.WasteWaterPipeModel;

@Repository
public interface WasteWaterPipeRepository extends JpaRepository<WasteWaterPipeModel, Long> {
	
	/**
	 * 
	 * @param fromNode - start node of the pipe
	 * @param toNode - end node og the pipe
	 * @return WasteWaterPipeEntity based on from and to nodes
	 */
	@Query("SELECT t FROM WasteWaterPipeEntity t WHERE t.fromNode = ?1 and t.toNode = ?2")
	WasteWaterPipeModel findByNodes(String fromnode, String tonode);
}
