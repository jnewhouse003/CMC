package User;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import Account.AccountController;
import DB.DBController;
import User.UserController;
import user.UserUI;

public class UserControllerTest {
	UserController controller;
	DBController dataBase;
	
	@Before
	public void setUp() throws Exception {
		this.controller = new UserController();
		this.dataBase = new DBController("goldencircle","csci230");
		this.controller.createController(dataBase);
		dataBase.addUser("test", "tester", "tester", "123", 's');
		dataBase.addSavedSchool("tester", "Harvard");
		
	@After
	public void tearDown() throws Exception {
		this.dataBase.removeUser("tester");
		
		
	@Test
	public void testRemoveSavedSchools() {
		Assert.assertEquals("Removed School", true, userUI.removeSavedSchool("tester", "Harvard"));
		
	@Test
	public void testViewSavedSchools() {
		Assert.assertEquals("List shows Harvard", true, String[] savedSchools = UserUI.viewSavedSchool("tester");)
	}
	
	@Test 
	public void testAddSavedSchool() {
		
	}

}
