package SystemTest;
import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import Account.AccountUI;
import Criteria.Criteria;
import DB.DBController;
import search.searchController;

public class SearchSchoolTest{

	DBController database;
	searchController controller;
	ArrayList<String> emphases;
	
	@Before
	public void setUp()throws Exception {
		this.database = new DBController("goldencircle","csci230");
		AccountUI.createController(database);
		database.addUser("test", "mcTesty", "testy", "123", 'u');
		
	}

	@After
	public void tearDown() throws Exception {
		database.removeUser("testy");
	}

	@Test
	public void testSearchSchool() {
		Assert.assertTrue("Circle University was found", this.controller.searchSchool("Golden Circle", "Minnesota", "UN", "control", 53, 500,
				23.5, 67.0, 50.0, 30.0, 60.0, 1000, 2000, 500, 2000, 50.0, 90.0, 200.0, 1000.0, 35, 65, 40.0, 60.0, 70.0, 100.0, 67, 200, 75, 98,30, 70, "Biology")== 1);
		
		Assert.assertTrue("University Not Found", this.controller.searcSchool("Hawaii", 300)== false);
		
	}

}
