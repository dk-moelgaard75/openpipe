package dk.moelgaards.openpipe.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import dk.moelgaards.openpipe.entities.WaterNodeEntity;
 
@Repository
public interface WaterNodeRepository extends JpaRepository<WaterNodeEntity, Long> {
	
	@Query("SELECT t FROM WaterNodeEntity t WHERE t.name = ?1")
	WaterNodeEntity findByName(String name);
 
}