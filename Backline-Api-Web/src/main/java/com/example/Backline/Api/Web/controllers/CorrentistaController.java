package com.example.Backline.Api.Web.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Backline.Api.Web.dto.NovoCorrentista;
import com.example.Backline.Api.Web.model.Correntista;
import com.example.Backline.Api.Web.repository.CorrentistaRepository;
import com.example.Backline.Api.Web.service.CorrentistaService;


@RestController
@RequestMapping("/correntistas")
public class CorrentistaController {

	@Autowired
	private CorrentistaRepository repository;
	
	@Autowired
	private CorrentistaService service;
	
	@GetMapping
	public List<Correntista> findAll(){
		return repository.findAll();
		
	}
	
	@PostMapping
	public void save (@RequestBody NovoCorrentista correntista) {
		service.save(correntista);
		
		
		
	}
	
	
}
