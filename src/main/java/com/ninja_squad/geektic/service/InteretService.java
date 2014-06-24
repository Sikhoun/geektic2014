package com.ninja_squad.geektic.service;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ninja_squad.geektic.dao.InteretDao;
import com.ninja_squad.geektic.entity.Interet;

@RestController
@Transactional
@RequestMapping("/api/interet")
public class InteretService {
	
		@Autowired
		private InteretDao interetDao;
		 
		 
		  	@RequestMapping(method = GET)
		    public List<Interet> showGeekByInterest() {
		  		List<Interet> Interet = interetDao.findAllInteret();
				return Interet;
		    }
}
