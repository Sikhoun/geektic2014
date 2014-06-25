package com.ninja_squad.geektic.dao;

import static org.junit.Assert.*;
import java.util.List;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import com.ninja_squad.dbsetup.DbSetup;
import com.ninja_squad.dbsetup.Operations;
import com.ninja_squad.dbsetup.operation.Operation;
import com.ninja_squad.geektic.entity.Geek;

public class GeekDaoTest extends BaseDaoTest {

	     
	     @Autowired
	     private GeekDao geekDaoTest;
	     
	     @Before
	     public void populateDatabase() {
	         Operation operation = Operations.sequenceOf(); // TODO define your operations here.
	         DbSetup dbSetup = new DbSetup(destination, operation);
	         dbSetup.launch();
	     }

	     @Test
	     public void testFindById() {
	         Geek geek = geekDaoTest.findById(4L);
	         assertEquals(4L, geek.getId(), 0);
	         assertNotEquals(3L,geek.getId(),0);    
	     }
	     

	     @Test
	     public void testFindAllGeek() {
	    	   List<Geek> geeks = geekDaoTest.searchGeekAll();
		         assertEquals(4, geeks.size());  
	     }
	  
	    

	     @Test
	     public void testFindBySex() {
	    	 List<Geek> geeksWomen = geekDaoTest.findBySex("FEMME");
	         assertEquals(1, geeksWomen.size());
	         List<Geek> geeksMen = geekDaoTest.findBySex("HOMME");
	         assertEquals(3, geeksMen.size());
	     }    
	     
	     
	    
	          
	     
	 }

