package dk.moelgaards.openpipe.dtos;

//https://howtodoinjava.com/spring-boot2/hibernate-configuration-example/

public class WaterNodeDto {
	private String name;
    private double x;
    private double y;
    private double depth;

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

	public double getDepth() {
		return depth;
	}

	public void setDepth(double depth) {
		this.depth = depth;
	}

}
