package dk.moelgaards.openpipe.dtos;


public class WasteWaterPipeDto {

	 private String fromNode;
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
