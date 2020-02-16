package dk.moelgaards.openpipe.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NetworkController {
	
	@ResponseBody
	@RequestMapping(value = "/network", method = RequestMethod.GET,
					produces = { "application/json", "application/xml" })
	public String getNetwork(@RequestParam String type,
							@RequestParam(required = false) String pipeId) {
	    StringBuilder html = new StringBuilder();
	    html.append("type:" + type + "<br/>");
	    if (pipeId != null)
	    {
	    	html.append("pipeId:" + pipeId + "<br/>");
	    }
		return html.toString();
	}
	
	
}
