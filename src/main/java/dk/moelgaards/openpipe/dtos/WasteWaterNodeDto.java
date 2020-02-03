package dk.moelgaards.openpipe.dtos;



public class WasteWaterNodeDto {
	private String name;
    private double x;
    private double y;
    private double topLevel;
    private double bottomLevel;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}
	
	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}
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

}
