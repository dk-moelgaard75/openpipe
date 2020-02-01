package dk.moelgaards.openpipe.entities;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class NodeEntity {
	@Id
    @GeneratedValue
    private Long id;
	
	@Column(name="name")
	private String name;	
	@Column(name="x")
	private double x;
	@Column(name="y")
	private double y;

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

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}


}
