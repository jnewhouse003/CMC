package DB;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import search.searchController;
import university.University;

public class DBControllerTest {
	DBController controller;
	searchController search;
	

	@Before
	public void setUp() throws Exception {
		this.controller = new DBController("goldencircle","csci230");
		this.controller.addUser("test", "mcTesty", "testy", "123", 'u');
		
		//Search Schools by state and number of students 
		University uni1 = new University("Circle University", "Minnesota", "location1", "control", 53, 40.5, 50.5, 1000, 2000, 2000.00, 1500.00, 100, 30.00, 50.00, 98, 23, 80, "majors");
		
		this.search = new searchController();
		this.controller = new DBController("goldencircle", "cs230");
		//this.controller.addSchool("Circle University");
	}

	@After
	public void tearDown() throws Exception {
		this.controller.removeUser("testy");
	}

	@Test
	public void TestGetAccount() {
		Assert.assertEquals("userFound" , "testy" ,this.controller.getAccount("testy").getUserName());
		
		Assert.assertEquals("user not found" , "" ,this.controller.getAccount("notTesty").getUserName());
		
		Assert.assertEquals("user not found" , "", this.controller.getAccount("").getUserName());
	
	}
	//GiGi
	
	@Test
	public void TestGetUniversity() {
		Assert.assertEquals("University found", "Circle University", this.controller.getUniversity("Circle University"));
		
		Assert.assertEquals("University not found", "Bemid University", this.controller.getUniversity("Bemid University"));
		
	}
}
