package dk.moelgaards.openpipe.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import dk.moelgaards.openpipe.models.WaterNodeModel;
 
@Repository
public interface WaterNodeRepository extends JpaRepository<WaterNodeModel, Long> {
	
	@Query("SELECT t FROM WaterNodeEntity t WHERE t.name = ?1")
	WaterNodeModel findByName(String name);
 
}