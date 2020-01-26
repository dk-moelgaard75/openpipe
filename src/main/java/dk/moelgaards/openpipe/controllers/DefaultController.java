package dk.moelgaards.openpipe.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DefaultController {
	@RequestMapping("/")
	public String welcome() {
		System.out.println("DefaultController (welcome) accessed");
		return "HelloWorld";
	}
	/*
	@RequestMapping("/error")
	public String error() {
		System.out.println("DefaultController (error) accessed");
		return "An error occured";
	}
	*/

}
