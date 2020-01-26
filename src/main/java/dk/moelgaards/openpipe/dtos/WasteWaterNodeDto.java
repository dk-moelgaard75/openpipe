package dk.moelgaards.openpipe.dtos;

public class WasteWaterNodeDto extends NodeDto {
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
}
