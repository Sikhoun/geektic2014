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
		public Geek findById(long i){
			return entityManager.find(Geek.class, i);
		}
		
		// Recherche Les Geek By InterestSex
		public List<Geek> findByInteretSex(Long idInteret, String sexe){
			String jpql = "select distinct g from Geek g left join fetch g.interets i where g.sexe = :sexe and i.id = :idInteret";
			TypedQuery<Geek> query = entityManager.createQuery(jpql, Geek.class);
			query.setParameter("idInteret",idInteret);
			query.setParameter("sexe",sexe);
			List<Geek> result = query.getResultList();
			return result;
			
		}
		
		
		// Recherche Les Geek By sexe
		public List<Geek> findBySex(String Sexe){
			String jpql = "select a from Geek a  where a.sexe like :SEXE";
			TypedQuery<Geek> query = entityManager.createQuery(jpql, Geek.class);
			query.setParameter("SEXE",Sexe);
			List<Geek> result = query.getResultList();
			return result;
		}
		
		
		
		public void persist(Geek geek) {
			entityManager.persist(geek);
				
		}
		
	
}
