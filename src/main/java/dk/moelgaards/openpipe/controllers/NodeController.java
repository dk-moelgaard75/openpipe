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
@RequestMapping("/node")
public class NodeController {
	
	 @Autowired
	 WasteWaterNodeRepository wwnRepository;
	
	@GetMapping("/wastewaternode")
	public List<WasteWaterNodeEntity> getAllWasteWaterNodes() {
		return wwnRepository.findAll();
	}
	@PostMapping(value = "/wastewaternode")
	public ResponseEntity<String> createWasteWaterNode(@RequestBody WasteWaterNodeEntity wwndto) {
		System.out.println("/node/wastewaternode - postmapping");
		WasteWaterNodeEntity wwnm = new WasteWaterNodeEntity();
		wwnm.setName(wwndto.getName());
		wwnm.setX(wwndto.getX());
		wwnm.setY(wwndto.getY());
		wwnm.setTopLevel(wwndto.getTopLevel());
		wwnm.setBottomLevel(wwndto.getBottomLevel());
		wwnRepository.save(wwnm);
		return new ResponseEntity<>("Wastewaternode created", HttpStatus.OK);
	}
	@GetMapping("/wastewaternode/{name}")
	public WasteWaterNodeEntity getWasteWaterNode(@PathVariable String name) {
		System.out.println("/node/wastewaternode/{name} - getmapping");
		return wwnRepository.findByName(name);
	}
	/*
	@PutMapping("/wastewaternode/{name}")
	public ResponseEntity<String> replace()
	*/
	@DeleteMapping("/wastewaternode/{name}")
	public ResponseEntity<String> deleteWasteWaterNode(@PathVariable String name) {
		System.out.println("/node/wastewaternode/{name} - deletemapping");
		wwnRepository.delete(wwnRepository.findByName(name));
		return new ResponseEntity<>("Wastewaternode deleted",HttpStatus.OK);
	}
	
	/**********************************/

	@GetMapping("/waternode")
	public List<WaterNodeModel> getAllWaterNodes() {
		return new ArrayList<WaterNodeModel>();
	}
	@PostMapping(value = "/waternode")
	public ResponseEntity<String> createWaterNode(@RequestBody WaterNodeEntity wwndto) {
		WaterNodeModel wnm = new WaterNodeModel(wwndto.getName());
		wnm.setX(wwndto.getX());
		wnm.setY(wwndto.getY());
		wnm.setDepth(wwndto.getDepth());
		
		return new ResponseEntity<>("Waternode created", HttpStatus.OK);
	}
	@GetMapping("/waternode/{name}")
	public WasteWaterNodeModel geWaterNode(@PathVariable String name) {
		//TODO - to be implemented
		return new WasteWaterNodeModel("");
	}
	/*
	@PutMapping("/wastewaternode/{name}")
	public ResponseEntity<String> replace()
	*/
	@DeleteMapping("/waternode/{name}")
	public ResponseEntity<String> deleteWaterNode(@PathVariable String name) {
	    //TODO - implement delete 
		return new ResponseEntity<>("Waternode deleted",HttpStatus.OK);
	}
}
