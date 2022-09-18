package com.example.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.api.model.Postagem;

public interface PostagemRepository extends JpaRepository<Postagem, Long>{

}
