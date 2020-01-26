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
	@GetMapping("/wastewaterpipe")
	public List<WasteWaterPipeEntity> getAllWasteWaterPipes() {
		return wwnRepository.findAll();
	}

}
