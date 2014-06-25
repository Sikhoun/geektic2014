package com.ninja_squad.geektic.entity;


import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "GEEK")
public class Geek {
	
	@Id
	private Long id;

	@Column(name = "Nom")
	private String nom;
	
	@Column(name = "Prenom")
	private String prenom;
	
	@Column(name = "Sexe")
	private String sexe;
	
	@Column(name = "Age")
	private int age;
	
	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(name = "GEEKINTERET", joinColumns = @JoinColumn(name = "ID_GEEK"), inverseJoinColumns = @JoinColumn(name = "ID_INTERET"))
	private  Set<Interet> interets;
	




	public Set<Interet> getInterets() {
		return interets;
	}

	public void setInterets(Set<Interet> interets) {
		this.interets = interets;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getSexe() {
		return sexe;
	}

	public void setSexe(String sexe) {
		this.sexe = sexe;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

}
