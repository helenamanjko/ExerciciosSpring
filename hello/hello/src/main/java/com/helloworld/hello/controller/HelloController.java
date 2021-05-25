package com.helloworld.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {
		
		@GetMapping
		public String hello(){
			return "Hello World!"
					+ "\nAs habilidades e mentalidades que utilizei para realizar essa tarefa foram: "
					+ "atenção aos detalhes, orientação ao futuro, responsalibidade pessoal, mentalidade de"
					+ " crescimento e persistência!";
		} 
}
