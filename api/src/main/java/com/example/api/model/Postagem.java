package com.example.api.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "postagem")
public class Postagem implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -4235868489274346240L;
	
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	@Column()
	@ApiModelProperty(value = "Identificador único para a Postagem")
	private long id;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "id_Usuario", nullable = false)
	@JsonProperty(access = Access.WRITE_ONLY)
	private Usuario usuario;
	
	@Column(name = "titulo", nullable = false)
	@ApiModelProperty(value = "Título da postagem")
	private String titulo;
	
	@Column(name = "texto", nullable = false)
	@ApiModelProperty(value = "Texto da postagem")
	private String texto;
}
