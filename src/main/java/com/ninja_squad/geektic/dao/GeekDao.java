package com.ninja_squad.geektic.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.ninja_squad.geektic.entity.Geek;

@Repository
public class GeekDao {
	
		@PersistenceContext
		private EntityManager entityManager;
		

		//Recherche ALL GEEK
		public List<Geek> searchGeekAll(){
			String jpql = "select s from Geek s order by s.id"; 
			TypedQuery<Geek> query = entityManager.createQuery(jpql, Geek.class);
			List<Geek> result = query.getResultList();
			return result;
		}
		
		// Recherche Geek By ID
		public Geek findById(Long id){
			return entityManager.find(Geek.class, id);
		}
		
		// Recherche Les Geek By Interest
		public List<Geek> findByInteret(int Interet){
			String jpql = "select a from GEEK a  where a.Interet like :INTERET";
			TypedQuery<Geek> query = entityManager.createQuery(jpql, Geek.class);
			query.setParameter("INTERET",Interet);
			List<Geek> result = query.getResultList();
			return result;
			
		}
		
		public void persist(Geek geek) {
			entityManager.persist(geek);
				
		}
		
	
}
