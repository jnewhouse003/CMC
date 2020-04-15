package user;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import Account.AccountController;
import Criteria.Criteria;
import DB.DBController;
import university.University;
import user.UserController;


public class UserControllerTest {
	UserController controller;
	DBController dataBase;
	ArrayList<String> userInfo = new ArrayList<String>();
	User test;
	ArrayList<String> wrongUserInfo = new ArrayList<String>();
	Criteria parameters;
	ArrayList<University> searchResults = new ArrayList<University>();
	AccountController accountController;
	
	@Before
	public void setUp() throws Exception {
		this.controller = new UserController();
		this.dataBase = new DBController("goldencircle","csci230");
		this.accountController = new AccountController();
		this.accountController.createController(this.dataBase);
		this.controller.createDataBase(dataBase, this.accountController);

		dataBase.addUser("test", ",Mctester", "tester", "123", 'u');
		this.controller.addSavedSchool("tester", "HARVARD");
		
		//view user info
		this.test = new User("test", "Mctester", "testy", "123", 'u');
		
		this.userInfo.add("test");
		this.userInfo.add("Mctester");
		this.userInfo.add("testy");
		this.userInfo.add("123");
		
		this.wrongUserInfo.add("notTester");
		this.wrongUserInfo.add("password");
		this.wrongUserInfo.add("antiTest");
		this.wrongUserInfo.add("antiMcTester");
		
		//searchSchool
		
		this.accountController.logOn("tester", "123");
		ArrayList<String> temp = new ArrayList<String>();
		this.parameters = new Criteria("", "NEW YORK", "URBAN", "PRIVATE",0, 0, 0.0, 0.0, 0.0, 0.0, 0, 0, 0, 0, 0.0, 0.0,0.0,0.0, 0, 0, 0.0, 0.0, 0.0, 0.0, 0,0,0,0,0,0,temp);
	
		this.searchResults.add(dataBase.getUniversity("BARNARD"));
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
		

		
		
	}
		
	@After
	public void tearDown() throws Exception {
		this.dataBase.removeSavedSchool("tester","HARVARD");
		this.dataBase.removeSavedSchool("tester","ARIZONA STATE");
		this.dataBase.removeUser("tester");
		
		for(int i = 0; i < this.searchResults.size(); i++) {
			this.searchResults.remove(i);
		}
	}
	@Test
	public void testViewSavedSchools() {
		//Assert.assertEquals("List shows Harvard", true, this.dataBase.getSavedSchool("tester"));
		Assert.assertEquals("List shows Harvard", "HARVARD", this.controller.viewSavedSchool("tester")[1]);
	}

	@Test
	public void testRemoveSavedSchools() {
		Assert.assertEquals("Removed School", true, this.dataBase.removeSavedSchool("tester", "HARVARD"));
	}
		

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
	
	
	@Test
	public void testSearchSchool() {
		Assert.assertEquals("search school with a user that exists and logged it", true, this.controller.searchSchool("tester",this.parameters).equals(this.searchResults));
		
		Assert.assertEquals("search school with a user that doesn't exist", false, this.controller.searchSchool("notTester",this.parameters).equals( this.searchResults));
		
		this.accountController.logOut("tester");
		Assert.assertEquals("search school with a user that exists but not logged in", false, this.controller.searchSchool("tester",this.parameters).equals( this.searchResults));
		
		this.accountController.logOn("tester", "123");
		
	}



	
	
}
