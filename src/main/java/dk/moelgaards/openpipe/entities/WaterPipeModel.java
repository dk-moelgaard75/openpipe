package dk.moelgaards.openpipe.models;

public class WaterPipeModel  extends PipeModel {
	private WaterPipeModel() {
		
	}
	public WaterPipeModel(WaterNodeModel fromNode, WaterNodeModel toNode) {
		super.setFromNode(fromNode);
		super.setToNode(toNode);
	}
	
}
