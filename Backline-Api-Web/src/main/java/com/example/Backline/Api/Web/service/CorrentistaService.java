package com.example.Backline.Api.Web.service;

import java.util.Date;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Backline.Api.Web.dto.NovoCorrentista;
import com.example.Backline.Api.Web.model.Conta;
import com.example.Backline.Api.Web.model.Correntista;

import com.example.Backline.Api.Web.repository.CorrentistaRepository;
@Service
public class CorrentistaService {

	@Autowired
	private CorrentistaRepository repository;
	
	@Autowired
	
	public void save (NovoCorrentista novoCorrentista) {
		Correntista correntista = new Correntista();
		correntista.setCpf(novoCorrentista.getCpf());
		correntista.setNome(novoCorrentista.getNome());
	
		Conta conta = new Conta();
		conta.setSaldo(0.0);
		conta.setNumero(new Date().getTime());
		correntista.setConta(conta);
		repository.save(correntista);
	
		}
	}
