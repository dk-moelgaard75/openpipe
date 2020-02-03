package dk.moelgaards.openpipe.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import dk.moelgaards.openpipe.entities.WasteWaterNodeEntity;
 
@Repository
public interface WasteWaterNodeRepository extends JpaRepository<WasteWaterNodeEntity, Long> {
	
	@Query("SELECT t FROM WasteWaterNodeEntity t WHERE t.name = ?1")
	WasteWaterNodeEntity findByName(String name);
 
}
