package dk.moelgaards.openpipe.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import dk.moelgaards.openpipe.entities.WasteWaterPipeEntity;

@Repository
public interface WasteWaterPipeRepository extends JpaRepository<WasteWaterPipeEntity, Long> {
	
	/**
	 * 
	 * @param fromNode - start node of the pipe
	 * @param toNode - end node of the pipe
	 * @return WasteWaterPipeEntity based on to and from nodes
	 */
	@Query("SELECT t FROM WasteWaterPipeEntity t WHERE t.fromNode = ?1 and t.toNode = ?2")
	WasteWaterPipeEntity findByNodes(String fromnode, String tonode);
}
