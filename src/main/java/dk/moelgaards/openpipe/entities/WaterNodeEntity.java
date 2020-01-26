package dk.moelgaards.openpipe.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

//https://howtodoinjava.com/spring-boot2/hibernate-configuration-example/

@Entity
@Table(name="tbl_waternode")
public class WaterNodeEntity {
    @Id
    @GeneratedValue
    private Long id;

    @Column(name="name")
	private String name;
    
    @Column(name="x")
    private double x;
    
    @Column(name="y")
    private double y;
    
    @Column(name="depth")
    private double depth;

	public Long getId() {
		return id;
	}

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
