package dk.moelgaards.openpipe.models;

import dk.moelgaards.openpipe.exceptions.NodeException;
import dk.moelgaards.openpipe.models.*;

public class WasteWaterPipeModel extends PipeModel {
	private WasteWaterPipeModel() {
		//empty private constructor ensures a WasteWaterNode isn´t created without a name
	}
	public WasteWaterPipeModel(WasteWaterNodeModel fromNode, WasteWaterNodeModel toNode) {
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
			double nodeDropDelta = Math.abs(((WasteWaterNodeModel)super.getFromNode()).getBottomLevel() - 
				((WasteWaterNodeModel)super.getToNode()).getBottomLevel());
			retValue = length / nodeDropDelta;
		}
		catch (Exception e){
			//Log error
		}
		return retValue;
	}


}
