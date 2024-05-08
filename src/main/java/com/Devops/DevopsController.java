package com.Devops;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DevopsController {
	
	@GetMapping(value="/getMyFirstJenks")
	public String getFirst() {
		return "My First Jenkins Project";
	}
	

}
