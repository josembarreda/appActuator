package com.nttdata.bootcamp.Controllers;

import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Endpoint(id="pruebas")
public class Controller {
	
	@GetMapping("/saludar")
	public String getSaludo() {
		return "bienvenido";
	}


}
