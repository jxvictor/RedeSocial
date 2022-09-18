package com.example.api.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.api.model.Postagem;
import com.example.api.repository.PostagemRepository;

@Service
public class PostagemService {
	
	@Autowired
	PostagemRepository postagemRepository;
	
	public void cadastrar(Postagem postagem) {
		postagemRepository.save(postagem);
	}

	public List<Postagem> findAll() {
		return postagemRepository.findAll();
	}
	
	public Optional<Postagem> findById(Long id){
		return postagemRepository.findById(id);
	}
}
