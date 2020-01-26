package dk.moelgaards.openpipe.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tbl_wastewaternode")
public class WasteWaterNodeEntity {

    @Id
    @GeneratedValue
    private Long id;

    @Column(name="name")
	private String name;
    
    @Column(name="x")
    private double x;
    
    @Column(name="y")
    private double y;
    
    @Column(name="toplevel")
    private double topLevel;

	@Column(name="bottomlevel")
    private double bottomLevel;

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
