package dk.moelgaards.openpipe.models;

public class WaterNodeModel extends NodeModel {
	
	private double depth;
	
	public double getDepth() {
		return depth;
	}
	public void setDepth(double depth) {
		this.depth = depth;
	}
	private WaterNodeModel() {
		//empty private constructor ensures a WasteWaterNode isn´t created without a name
	}
	public WaterNodeModel(String name) {
		super.setName(name);
	}
}
