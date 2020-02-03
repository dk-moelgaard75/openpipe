package dk.moelgaards.openpipe.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="tbl_wastewaternode")
public class WasteWaterNodeEntity extends NodeEntity {
	
	@Column(name="toplevel")
	private double topLevel;
	@Column(name="bottomLevel")
	private double bottomLevel;	
	
	public double getTopLevel() {
		return topLevel;
	}
	public void setTopLevel(double topLevel) {
		this.topLevel = topLevel;
	}
	
	public double getBottomLevel() {
		return bottomLevel;
	}
	public void setBottomLevel(double bottomLevel) {
		this.bottomLevel = bottomLevel;
	}

	private WasteWaterNodeEntity()	{
		//empty private constructor ensures a WasteWaterNode isn´t created without a name
	}
	public WasteWaterNodeEntity(String name) {
		super.setName(name);
	}

	public double depth(){
		return topLevel - bottomLevel;
	}
}
