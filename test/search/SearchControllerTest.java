/**
 * 
 */
package search;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import Criteria.Criteria;
import DB.DBController;

/**
 * @author giteghete001
 *
 */
public class SearchControllerTest {
	searchController controller;
	DBController dataBase;
	Criteria parameters;


	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		//creating the universities
		
		this.dataBase = new DBController("goldencircle", "cs230");
		this.controller = new searchController(this.dataBase);
		
		ArrayList<String> temp = new ArrayList<String>();
		this.parameters = new Criteria("", "NEW YORK", "URBAN", "PRIVATE",0, 0, 0.0, 0.0, 0.0, 0.0, 0, 0, 0, 0, 0.0, 0.0,0.0,0.0, 0, 0, 0.0, 0.0, 0.0, 0.0, 0,0,0,0,0,0,temp);
		
		//searchResults.add(dataBase.getUniversity("BARNARD"));
		/*
		this.searchResults.add(this.dataBase.getUniversity("COLUMBIA"));
		this.searchResults.add(this.dataBase.getUniversity("COOPER UNION"));
		this.searchResults.add(this.dataBase.getUniversity("EASTMAN SCHOOL OF MUSIC"));
		this.searchResults.add(this.dataBase.getUniversity("FORDHAM"));
		this.searchResults.add(this.dataBase.getUniversity("JUILLIARD"));
		this.searchResults.add(this.dataBase.getUniversity("NEW YORK UNIVERSITY"));
		this.searchResults.add(this.dataBase.getUniversity("POLYTECHNIC INSTITUTE OF NEWYORK"));
		this.searchResults.add(this.dataBase.getUniversity("PRATT"));
		this.searchResults.add(this.dataBase.getUniversity("ST JOHNS UNIVERSITY"));
		this.searchResults.add(this.dataBase.getUniversity("TOURO"));
		this.searchResults.add(this.dataBase.getUniversity("UNIVERSITY OF ROCHESTER"));
		
		*/
		
		
		
	}
	
	//userControllerTest, 

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		this.dataBase.removeUser("testy");
		
	
		
	}

	/*
	@Test
	public void testSearchSchool() {
		Assert.assertEquals("search results correct",true, this.controller.searchSchool(this.parameters));
		
		Assert.assertEquals("search results wrong", true, this.controller.searchSchool(this.parameters));
	}
*/
}
