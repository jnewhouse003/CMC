package SystemTest;
import java.util.ArrayList;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import Account.AccountController;
import Account.AccountUI;
import Criteria.Criteria;
import DB.DBController;
import search.searchController;
import university.University;
import user.UserUI;

public class SearchSchoolTest{

	DBController dataBase;
	searchController controller;
	ArrayList<String> wrongUserInfo = new ArrayList<String>();
	Criteria parameters;
	ArrayList<University> searchResults = new ArrayList<University>();
	AccountController accountController;
	
	@Before
	public void setUp()throws Exception {
		this.dataBase = new DBController("goldencircle","csci230");
		AccountUI.createController(this.dataBase);
		UserUI.createController(this.dataBase,AccountUI.getAccountController());
		this.accountController = AccountUI.getAccountController();
		dataBase.addUser("test", "mcTesty", "testy", "123", 'u');
		
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
		this.accountController.logOn("testy", "123");
	}

	@After
	public void tearDown() throws Exception {
		dataBase.removeUser("testy");
	}

	@Test
	public void testSearchSchool() {
		Assert.assertEquals("search school with a user that exists and logged it", true, UserUI.searchSchool("testy", parameters).equals(this.searchResults));
		
		Assert.assertEquals("search school with a user that doesn't exist", false, UserUI.searchSchool("notTester",this.parameters).equals( this.searchResults));
		
		this.accountController.logOut("testy");
		Assert.assertEquals("search school with a user that exists but not logged in", false, UserUI.searchSchool("tester",this.parameters).equals( this.searchResults));
		
		this.accountController.logOn("testy", "123");
		
		
		
	}

}
