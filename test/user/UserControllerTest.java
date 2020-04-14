package user;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import Account.Account;
import DB.DBController;
import user.UserController;


public class UserControllerTest {
	UserController controller;
	DBController dataBase;
	ArrayList<String> userInfo = new ArrayList();
	User test;
	ArrayList<String> wrongUserInfo = new ArrayList();
	
	@Before
	public void setUp() throws Exception {
		this.controller = new UserController();
		this.dataBase = new DBController("goldencircle","csci230");
		this.controller.createDataBase(dataBase);

		dataBase.addUser("test", ",Mctester", "tester", "123", 's');
		//this.controller.addSavedSchool("tester", "HARVARD");
		
		this.test = new User("test", "Mctester", "testy", "123", 'u');
		
		this.userInfo.add("test");
		this.userInfo.add("Mctester");
		this.userInfo.add("testy");
		this.userInfo.add("123");
		
		this.wrongUserInfo.add("notTester");
		this.wrongUserInfo.add("password");
		this.wrongUserInfo.add("antiTest");
		this.wrongUserInfo.add("antiMcTester");
		
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
	
	@Test
	public void testViewUserInfo() {
		Assert.assertEquals("View user info of a user", true, this.controller.viewUserInfo(this.test).equals( this.userInfo));
		
		Assert.assertEquals("view user info not a user", false, this.controller.viewUserInfo(this.test).equals(this.wrongUserInfo));
		
		
	}


	
	
}
