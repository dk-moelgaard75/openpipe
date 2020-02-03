package dk.moelgaards.openpipe.entities;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.MappedSuperclass;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import dk.moelgaards.openpipe.exceptions.NodeException;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@Table(name = "tbl_pipes")
public abstract class PipeEntity {
	@Id
    @GeneratedValue
    private Long id;

	//@Column(name="fromnode")
	@OneToOne(targetEntity = NodeEntity.class)
	private NodeEntity fromNode;
	///@Column(name="tonode")
	@OneToOne(targetEntity = NodeEntity.class)
	private NodeEntity toNode;
	
	public NodeEntity getFromNode() {
		return fromNode;
	}

	public void setFromNode(NodeEntity fromNode) {
		this.fromNode = fromNode;
	}

	public NodeEntity getToNode() {
		return toNode;
	}

	public void setToNode(NodeEntity toNode) {
		this.toNode = toNode;
	}
	
	/**
		The methods simply returns the name of the pipe
		@param none
		@return the name of the pipe base on the to and from nodes
		@throws NodeException
	*/	
	public String getPipeName() throws NodeException {
		if (fromNode != null && toNode != null) {
			return fromNode.getName() + "-" + toNode.getName();
		} else {
			throw new NodeException("toNode or fromNode is missing");
		}
	}
	public double length() throws NodeException {
		if (fromNode != null && toNode != null) {
			return calcLength();
		} else {
			throw new NodeException("toNode or fromNode is missing");
		}		
	}
	/**
	 * 
	 * @return the length of the pipe in a straight line
	 */
	private double calcLength() {
		return Math.sqrt(
				Math.pow((fromNode.getX() - toNode.getX()),2) -
				Math.pow((fromNode.getY() - toNode.getY()),2));
	}
	
}
