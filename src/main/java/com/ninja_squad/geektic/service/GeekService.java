package com.ninja_squad.geektic.service;
import static org.springframework.web.bind.annotation.RequestMethod.GET;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ninja_squad.geektic.dao.GeekDao;
import com.ninja_squad.geektic.entity.Geek;

@RestController
@Transactional
@RequestMapping("/api/geek")
public class GeekService {
	
	@Autowired
	private GeekDao geekDao;
	 
	 
	  	@RequestMapping(method = GET)
	    public List<Geek> showGeek() {
	  		List<Geek> geek = geekDao.searchGeekAll();
			return geek;
	    }

	  	@RequestMapping(value="/{sexe}", method = RequestMethod.GET)
	  	public List<Geek> showGeekSexe(@PathVariable("sexe") String sexe) {
	  		List<Geek> geek = geekDao.findBySex(sexe);
	  		return geek;
	  	}
	  	

		public GeekService() {
			
		}
		  
		
		
}


