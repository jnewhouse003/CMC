package user;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


import DB.DBController;
import user.UserController;


public class UserControllerTest {
	UserController controller;
	DBController dataBase;
	
	@Before
	public void setUp() throws Exception {
		this.controller = new UserController();
		this.dataBase = new DBController("goldencircle","csci230");
		this.controller.createDataBase(dataBase);
		dataBase.addUser("test", ",Mctester", "tester", "123", 's');
		//this.controller.addSavedSchool("tester", "HARVARD");
	}
		
	@After
	public void tearDown() throws Exception {
		this.dataBase.removeSavedSchool("tester","HARVARD");
		this.dataBase.removeSavedSchool("tester","ARIZONA STATE");
		this.dataBase.removeUser("tester");
	}
		
	/*
	@Test
	public void testRemoveSavedSchools() {
		Assert.assertEquals("Removed School", true, userUI.removeSavedSchool("tester", "Harvard"));
		
	@Test
	public void testViewSavedSchools() {
		Assert.assertEquals("List shows Harvard", true, String[] savedSchools = UserUI.viewSavedSchool("tester");)
	}
	*/
	@Test 
	public void testAddSavedSchool() {
		this.dataBase.addSavedSchool("tester","HARVARD");
		Assert.assertEquals("school saved", true, this.controller.addSavedSchool("tester", "ARIZONA STATE"));
		
		Assert.assertEquals("school saved", false, this.controller.addSavedSchool("tester", "HARVARD"));
		
		Assert.assertEquals("school saved", false, this.controller.addSavedSchool("notTester", "ARIZONA STATE"));
		
		Assert.assertEquals("school saved", false, this.controller.addSavedSchool("tester", ""));
		this.dataBase.removeSavedSchool("tester","HARVARD");
		this.dataBase.removeSavedSchool("tester","ARIZONA STATE");
		
	}

}
