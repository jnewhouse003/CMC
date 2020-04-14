package SystemTest;

import static org.junit.Assert.*;


import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import Account.AccountUI;
import Admin.AdminUI;
import DB.DBController;
import user.User;
import user.UserUI;


public class removeSavedSchoolTest {
	
	DBController dataBase;
	User test;
	
	@Before
	public void setUp() throws Exception{
		this.dataBase = new DBController("goldencircle", "csci230");
		UserUI.createController(dataBase);
		AccountUI.createController(dataBase);
		AccountUI.addUser("test", "tester", "tester", "123", 's');
		this.test = new User("test", "tester", "tester", "123", 's');
		UserUI.addSavedSchool("tester", "HARVARD");
		
	}
	
	@After
	public void tearDown() throws Exception {
		this.dataBase.removeUser("tester");
	}
	
	@Test
	public void testRemoveSavedSchools() {

		Assert.assertEquals("Removed School", true, this.dataBase.removeSavedSchool("tester", "HARVARD"));

		
		
		
	}

}
