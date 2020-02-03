package dk.moelgaards.openpipe.entities;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="tbl_waterpipe")
public class WaterPipeEntity  extends PipeEntity {
	private WaterPipeEntity() {
		
	}
	public WaterPipeEntity(WaterNodeEntity fromNode, WaterNodeEntity toNode) {
		super.setFromNode(fromNode);
		super.setToNode(toNode);
	}
	
}
