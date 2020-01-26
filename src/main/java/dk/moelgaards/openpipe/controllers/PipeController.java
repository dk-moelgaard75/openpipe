package dk.moelgaards.openpipe.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;

import dk.moelgaards.openpipe.models.*;
import dk.moelgaards.openpipe.entities.*;
import dk.moelgaards.openpipe.repository.*;

@RestController
@RequestMapping("/pipe")
public class PipeController {
	
	 @Autowired
	 WasteWaterPipeRepository wwpRepository;
	 @Autowired
	 WaterPipeRepository wpRepository;

	@GetMapping("/wastewaterpipe")
	public List<WasteWaterPipeEntity> getAllWasteWaterPipes() {
		return wwpRepository.findAll();
	}

	@PostMapping(value = "/wastewaterpipe")
	public ResponseEntity<String> createWasteWaterpipe(@RequestBody WasteWaterPipeEntity wwpe) {
		System.out.println("/pipe/wastewaterpipe - postmapping");
		WasteWaterPipeEntity curWwpe = new WasteWaterPipeEntity();
		curWwpe.setFromNode(wwpe.getFromNode());
		curWwpe.setToNode(wwpe.getToNode());
		wwpRepository.save(curWwpe);
		return new ResponseEntity<>("Wastewaterpipe created", HttpStatus.OK);
	}
	@GetMapping("/wastewaterpipe/{fromnode}/{tonode}")
	public WasteWaterPipeEntity getWasteWaterPipe(@PathVariable String fromNode, @PathVariable String toNode) {
		System.out.println("/pipe/wastewaterpipe/{fromnode}/{tonode} - getmapping");
		return wwpRepository.findByNodes(fromNode, toNode);
	}
	@DeleteMapping("/wastewaterpipe/{fromnode}/{tonode}")
	public ResponseEntity<String> deleteWasteWaterPipe(@PathVariable String fromNode, @PathVariable String toNode) {
		System.out.println("/pipe/wastewaternode/{fromnode}/{tonode} - deletemapping");
		WasteWaterPipeEntity wwpe = wwpRepository.findByNodes(fromNode, toNode);
		if (wwpe != null)
		{
			wwpRepository.delete(wwpe);
			return new ResponseEntity<>("Wastewaterpipe deleted", HttpStatus.OK);
		}
		return new ResponseEntity<>("Wastewaterpipe wasn´t  found", HttpStatus.NOT_FOUND);
	}

	/*********************************************************/
	
	@GetMapping("/waterpipe")
	public List<WaterPipeEntity> getAllWaterPipes() {
		return wpRepository.findAll();
	}

	@PostMapping(value = "/waterpipe")
	public ResponseEntity<String> createWaterpipe(@RequestBody WaterPipeEntity wpe) {
		System.out.println("/pipe/waterpipe - postmapping");
		WaterPipeEntity curWpe = new WaterPipeEntity();
		curWpe.setFromNode(wpe.getFromNode());
		curWpe.setToNode(wpe.getToNode());
		wpRepository.save(curWpe);
		return new ResponseEntity<>("Waterpipe created", HttpStatus.OK);
	}
	@GetMapping("/waterpipe/{fromnode}/{tonode}")
	public WaterPipeEntity getWaterPipe(@PathVariable String fromnode, @PathVariable String tonode) {
		System.out.println("/pipe/waterpipe/{fromnode}/{tonode} - getmapping");
		return wpRepository.findByNodes(fromnode, tonode);
	}
	@DeleteMapping("/waterpipe/{fromnode}/{tonode}")
	public ResponseEntity<String> deleteWaterPipe(@PathVariable String fromNode, @PathVariable String toNode) {
		System.out.println("/pipe/wastewaternode/{fromnode}/{tonode} - deletemapping");
		WaterPipeEntity wpe = wpRepository.findByNodes(fromNode, toNode);
		if (wpe != null)
		{
			wpRepository.delete(wpe);
			return new ResponseEntity<>("Waterpipe deleted", HttpStatus.OK);
		}
		return new ResponseEntity<>("Waterpipe wasn´t  found", HttpStatus.NOT_FOUND);
	}


}
