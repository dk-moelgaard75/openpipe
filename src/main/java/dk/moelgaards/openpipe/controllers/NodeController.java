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
	 @Autowired
	 WaterNodeRepository wnRepository;
	
	@GetMapping("/wastewaternode")
	public List<WasteWaterNodeModel> getAllWasteWaterNodes() {
		return wwnRepository.findAll();
	}
	@PostMapping(value = "/wastewaternode")
	public ResponseEntity<String> createWasteWaterNode(@RequestBody WasteWaterNodeEntity wwndto) {
		System.out.println("/node/wastewaternode - postmapping");
		WasteWaterNodeModel wwnm = new WasteWaterNodeModel(wwndto.getName());
		wwnm.setX(wwndto.getX());
		wwnm.setY(wwndto.getY());
		wwnm.setTopLevel(wwndto.getTopLevel());
		wwnm.setBottomLevel(wwndto.getBottomLevel());
		wwnRepository.save(wwnm);
		return new ResponseEntity<>("Wastewaternode created", HttpStatus.OK);
	}
	@GetMapping("/wastewaternode/{name}")
	public WasteWaterNodeModel getWasteWaterNode(@PathVariable String name) {
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
		WasteWaterNodeModel wwne = wwnRepository.findByName(name); 
		if (wwne != null)
		{
			wwnRepository.delete(wwne);
			return new ResponseEntity<>("Wastewaternode deleted",HttpStatus.OK);
		}
		return new ResponseEntity<>("Wastewaternode wasn´t found",HttpStatus.NOT_FOUND);
	}
	
	/**********************************/

	@GetMapping("/waternode")
	public List<WaterNodeModel> getAllWaterNodes() {
		System.out.println("/node/waternode/{name} - getmapping");
		return wnRepository.findAll();
	}
	@PostMapping(value = "/waternode")
	public ResponseEntity<String> createWaterNode(@RequestBody WaterNodeEntity wndto) {
		System.out.println("/node/waternode/{name} - postmapping");
		WaterNodeModel wne = new WaterNodeModel(wndto.getName());
		wne.setX(wndto.getX());
		wne.setY(wndto.getY());
		wne.setDepth(wndto.getDepth());
		wnRepository.save(wne);
		return new ResponseEntity<>("Waternode created", HttpStatus.OK);
	}
	@GetMapping("/waternode/{name}")
	public WaterNodeModel geWaterNode(@PathVariable String name) {
		System.out.println("/node/wastewaternode/{name} - getmapping");
		return wnRepository.findByName(name);
	}
	/*
	@PutMapping("/wastewaternode/{name}")
	public ResponseEntity<String> replace()
	*/
	@DeleteMapping("/waternode/{name}")
	public ResponseEntity<String> deleteWaterNode(@PathVariable String name) {
		WaterNodeModel wne = wnRepository.findByName(name); 
		if (wne != null)
		{
			wnRepository.delete(wne);
			return new ResponseEntity<>("Waternode deleted",HttpStatus.OK);
		}
		return new ResponseEntity<>("Waternode wasn´t found",HttpStatus.NOT_FOUND);
	}
}
