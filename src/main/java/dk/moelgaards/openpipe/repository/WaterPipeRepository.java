package dk.moelgaards.openpipe.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


import dk.moelgaards.openpipe.entities.WaterPipeEntity;

@Repository
public interface WaterPipeRepository extends JpaRepository<WaterPipeEntity, Long>{
	@Query("SELECT t FROM WaterPipeEntity t WHERE t.fromNode = ?1 and t.toNode = ?2")
	WaterPipeEntity findByNodes(String fromNode, String toNode);
}
