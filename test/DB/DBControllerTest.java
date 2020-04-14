package DB;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import Admin.AdminUI;
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
		this.controller.addSchool(uni1);
		this.search = new searchController(this.controller);
		//this.controller.addSchool("Circle University");
		//this.controller.addSavedSchool("testy", "HARVARD");
		AdminUI.createController(controller);
		AdminUI.deactivateUser("testy");
	}

	@After
	public void tearDown() throws Exception {
		this.controller.removeSavedSchool("testy", "HARVARD");
		this.controller.removeSavedSchool("testy", "ARIZONA STATE");
		this.controller.removeUser("testy");
		this.controller.removeSchool("Circle University");
	}

	@Test
	public void TestGetAccount() {
		Assert.assertEquals("userFound" , "testy" ,this.controller.getAccount("testy").getUserName());
		
		Assert.assertEquals("user not found" , "" ,this.controller.getAccount("notTesty").getUserName());
		
		Assert.assertEquals("user not found" , "", this.controller.getAccount("").getUserName());
	
	}
	
	
	
	
	@Test
	public void TestGetUniversity() {
		Assert.assertEquals("University found", "Circle University", this.controller.getUniversity("Circle University").getName());
		
		Assert.assertEquals("University not found", null, this.controller.getUniversity("Bemid University"));
		
	}
	
	
	@Test
	public void TestAddSavedSchool() {
		this.controller.addSavedSchool("testy", "HARVARD");
		Assert.assertEquals("school saved succesful", true, this.controller.addSavedSchool("testy", "ARIZONA STATE"));
		
		Assert.assertEquals("school saved failed, school already saved", false, this.controller.addSavedSchool("testy", "HARVARD"));
		
		Assert.assertEquals("school saved failed, user doesn't exist", false, this.controller.addSavedSchool("notTester", "ARIZONA STATE"));
		
		Assert.assertEquals("school saved failed, database error", false, this.controller.addSavedSchool("testy", ""));
		
		this.controller.removeSavedSchool("testy", "HARVARD");
		this.controller.removeSavedSchool("testy", "ARIZONA STATE");
		
	}
	
	@Test
	public void TestLookUpUser() {
		Assert.assertEquals("school saved succesful", true, this.controller.lookUpUser("testy"));
		Assert.assertEquals("school saved succesful", false, this.controller.lookUpUser("notTesty"));
	}
	@Test
	public void TestEditUser() {
		Assert.assertEquals("User found", true, this.controller.editUser("test", "mcTesty", "testy", "123", 'u', 'Y'));
		Assert.assertEquals("Invalid user", true, this.controller.editUser("test", "mcTesty", "testy12", "123", 'u', 'Y'));
	}

}
