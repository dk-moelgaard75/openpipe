package dk.moelgaards.openpipe.models;

public class WasteWaterNodeModel extends NodeModel {
	private double topLevel;
	
	public double getTopLevel() {
		return topLevel;
	}
	public void setTopLevel(double topLevel) {
		this.topLevel = topLevel;
	}
	
	private double bottomLevel;
	
	public double getBottomLevel() {
		return bottomLevel;
	}
	public void setBottomLevel(double bottomLevel) {
		this.bottomLevel = bottomLevel;
	}

	private WasteWaterNodeModel()	{
		//empty private constructor ensures a WasteWaterNode isn´t created without a name
	}
	public WasteWaterNodeModel(String name) {
		super.setName(name);
	}

	public double depth(){
		return topLevel - bottomLevel;
	}
}
