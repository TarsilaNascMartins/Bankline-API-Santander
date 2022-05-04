package com.example.Backline.Api.Web.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Backline.Api.Web.model.Correntista;
import com.example.Backline.Api.Web.repository.CorrentistaRepository;

@RestController
@RequestMapping("/correntistasantander")
public class CorrentistaController {

	@Autowired
	private CorrentistaRepository repository;
	
	@GetMapping
	public List<Correntista> findAll(){
		return repository.findAll();
		
	}
	
	@PostMapping
	public void save (@RequestBody Correntista correntista) {
		
		
		
		
	}
	
	
}
