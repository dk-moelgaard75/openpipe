package dk.moelgaards.openpipe.entities;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@Entity
@Table(name="tbl_waterpipe")
public class WaterPipeEntity  extends PipeEntity {
	
	@SuppressWarnings("unused")
	private WaterPipeEntity() {
		//empty private constructor ensures a WasteWaterNode isn´t created without a name
	}
	public WaterPipeEntity(WaterNodeEntity fromNode, WaterNodeEntity toNode) {
		super.setFromNode(fromNode);
		super.setToNode(toNode);
	}
	
}
