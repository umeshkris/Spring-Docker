package com.docker.io;

import java.util.Date;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DockerController {
	
	
	
	@GetMapping("/test")
	public String testApi(){
		
		
		return new Date().toLocaleString().toString();
		
	}

}
