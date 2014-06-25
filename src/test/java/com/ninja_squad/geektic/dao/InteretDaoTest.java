package com.ninja_squad.geektic.dao;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import java.util.List;




import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.ninja_squad.dbsetup.DbSetup;
import com.ninja_squad.dbsetup.Operations;
import com.ninja_squad.dbsetup.operation.Operation;
import com.ninja_squad.geektic.entity.Interet;

public class InteretDaoTest extends BaseDaoTest {

	  @Autowired
	     private InteretDao interetDaoTest;

	  @Before
	     public void populateDatabase() {
	         Operation operation = Operations.sequenceOf(); // TODO define your operations here.
	         DbSetup dbSetup = new DbSetup(destination, operation);
	         dbSetup.launch();
	     }
	  
	     @Test
	     public void testFindById() {
	         Interet interet = interetDaoTest.findById(3L);
	         assertEquals(3L, interet.getId(), 0);
	         assertNotEquals(2L,interet.getId(),0);
	        
	     }
	     

	     @Test
	     public void testFindAllInteret() {
	         List<Interet> interet = interetDaoTest.findAllInteret();
	         assertEquals(6, interet.size());   
	     }
	  
	    

	     /*@Test
	     public void findAllInteretByGeek() {
	         List<Interet> Interet = interetDaoTest.findAllInteretByGeek(4L);
	         assertEquals(3, Interet.size());
	       
	     }  */  
	     
	
}
