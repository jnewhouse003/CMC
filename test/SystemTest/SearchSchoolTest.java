package SystemTest;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import Account.AccountUI;
import DB.DBController;

public class searchSchoolTest {

	DBController database;
	searchController controller;
	
	@Before
	public void setUp() throws Exception {
		this.dataBase = new DBController("goldencircle","csci230");
		AccountUI.createController(dataBase);
		dataBase.addUser("test", "mcTesty", "testy", "123", 'u');
		
	}

	@After
	public void tearDown() throws Exception {
		database.removeUser("testy");
	}

	@Test
	public void testSearchSchool() {
		
		Assert.assertTrue("Circle University was found", this.controller.searchSchool("Minnesota", 53)== true);
		
		Asser.assertTrue("University Not Found", this.controller.searcSchool("Hawaii", 300)== false);
		
	}

}
