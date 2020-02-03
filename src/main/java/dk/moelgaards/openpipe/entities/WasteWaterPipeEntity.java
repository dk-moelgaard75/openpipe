package dk.moelgaards.openpipe.entities;

import dk.moelgaards.openpipe.exceptions.NodeException;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;



@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name="tbl_wastewaterpipe")
public class WasteWaterPipeEntity extends PipeEntity {
	
	private WasteWaterPipeEntity() {
		//empty private constructor ensures a WasteWaterNode isn´t created without a name
	}
	public WasteWaterPipeEntity(WasteWaterNodeEntity fromNode, WasteWaterNodeEntity toNode) {
		super.setFromNode(fromNode);
		super.setToNode(toNode);
	}
	public double drop() throws NodeException {
		if (super.getFromNode() != null && super.getToNode() != null) {
			return calcdrop();
		} else {
			throw new NodeException("toNode or fromNode is missing");
		}		
	}
	private double calcdrop()
	{
		double retValue = -1;
		try
		{
			double length = super.length();
			double nodeDropDelta = Math.abs(((WasteWaterNodeEntity)super.getFromNode()).getBottomLevel() - 
				((WasteWaterNodeEntity)super.getToNode()).getBottomLevel());
			retValue = length / nodeDropDelta;
		}
		catch (Exception e){
			//Log error
		}
		return retValue;
	}


}
