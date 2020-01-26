package dk.moelgaards.openpipe.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tbl_wastewaterpipe")
public class WasteWaterPipeEntity {
	@Id
    @GeneratedValue
    private Long id;
	
	 @Column(name="fromNode")
	 private String fromNode;

	 @Column(name="toNode")
	 private String toNode;
	
	 public String getToNode() {
		return toNode;
	}

	public void setToNode(String toNode) {
		this.toNode = toNode;
	}

	public String getFromNode() {
		return fromNode;
	}

	public void setFromNode(String fromNode) {
		this.fromNode = fromNode;
	}
}
