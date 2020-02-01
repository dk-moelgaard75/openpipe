package dk.moelgaards.openpipe.models;
import dk.moelgaards.openpipe.exceptions.NodeException;

public abstract class PipeModel {

	private NodeModel fromNode;
	
	public NodeModel getFromNode() {
		return fromNode;
	}

	public void setFromNode(NodeModel fromNode) {
		this.fromNode = fromNode;
	}
	
	private NodeModel toNode;

	public NodeModel getToNode() {
		return toNode;
	}

	public void setToNode(NodeModel toNode) {
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
	
	private double calcLength() {
		return Math.sqrt(
				Math.pow((fromNode.getX() - toNode.getX()),2) -
				Math.pow((fromNode.getY() - toNode.getY()),2));
	}
	
}
