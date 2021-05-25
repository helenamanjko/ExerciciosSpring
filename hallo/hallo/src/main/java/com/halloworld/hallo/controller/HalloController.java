package com.halloworld.hallo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hallo")
public class HalloController {
	
	@GetMapping
	public String hallo(){
		return "Hello World!"
				+ "\nMeus objetivos de aprendizagem para essa semana são: "
				+ "compreender melhor as ferramentas como o Spring, o Postman e "
				+ "conseguir desenvolver melhor o projeto integrador.";		
		
		
	}

}
