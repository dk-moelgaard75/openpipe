package dk.moelgaards.openpipe.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="tbl_waternode")
public class WaterNodeEntity extends NodeEntity {
	
	@Column(name="depth")
	private double depth;
	
	public double getDepth() {
		return depth;
	}
	public void setDepth(double depth) {
		this.depth = depth;
	}
	private WaterNodeEntity() {
		//empty private constructor ensures a WasteWaterNode isn´t created without a name
	}
	public WaterNodeEntity(String name) {
		super.setName(name);
	}
}
