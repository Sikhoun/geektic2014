package com.ninja_squad.geektic.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.ninja_squad.geektic.entity.Interet;


@Repository
public class InteretDao {
	@PersistenceContext
	private EntityManager entityManager;		
	public List<Interet>findAllInteret()
	{
		String jpql = "select s from Interet s order by id"; 
		TypedQuery<Interet> query = entityManager.createQuery(jpql, Interet.class);
		List<Interet> result = query.getResultList();
		return result;
		
	}
	
	
}
