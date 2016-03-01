package com.tt2015b036.web.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.tt2015b036.domine.entities.Usuario;

@RestController
@RequestMapping("/api")
public class PruebaController {
		
	@RequestMapping(method = RequestMethod.GET, value = "/saludo")
	public @ResponseBody Usuario categorias( 	){
		Usuario user = new Usuario(323,"JaziJaziel", "jazijaizel@gmail.com");
		return user;
	}
	
}

