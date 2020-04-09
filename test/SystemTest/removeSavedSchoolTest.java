package SystemTest;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import Account.AccountUI;
import Admin.AdminUI;
import DB.DBController;
import user.UserUI;


public class removeSavedSchoolTest {
	
	DBController dataBase;
	
	@Before
	public void setUp() throws Exception{
		this.dataBase = new DBController("goldencircle", "csci230");
		UserUI.createController(dataBase);
		//dataBase.addUser("test", "tester", "tester", "123", "s");
		//dataBase.addSavedSchool(tester, Harvard)
		
	}
	
	@After
	public void tearDown() throws Exception {
		dataBase.removeUser("tester");
	}
	
	@Test
	public void testRemoveSavedSchools() {
		//Assert.assertEquals("Removed School", true, userUI.removeSavedSchool("tester", "Harvard"));
		
		
	}

}
