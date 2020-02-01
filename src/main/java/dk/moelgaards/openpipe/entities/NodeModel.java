package dk.moelgaards.openpipe.models;

public abstract class NodeModel {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	private double x;

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}
	
	private double y;

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}
}
