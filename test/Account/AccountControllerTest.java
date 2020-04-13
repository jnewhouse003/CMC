package Account;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import DB.DBController;
import Account.AccountController;

public class AccountControllerTest {
	AccountController controller;
	DBController dataBase;

	@Before
	public void setUp() throws Exception {
		this.controller = new AccountController();
		this.dataBase = new DBController("goldencircle","csci230");
		controller.createController(dataBase);
		//for the login test
		dataBase.addUser("test", "mcTesty", "testy", "123", 'u');
		//for the logout test
		dataBase.addUser("log", "out", "Mr.Logout12", "321", 'u');
		controller.logOn("Mr.Logout12", "321");
		
	}

	@After
	public void tearDown() throws Exception {
		this.dataBase.removeUser("testy");
		this.dataBase.removeUser("Mr.Logout12");
		
		
	}

	@Test
	public void TestLogOn() {
		Assert.assertEquals("login failed no username", false, this.controller.logOn("","123"));
		
		Assert.assertEquals("login failed wrong password", false, this.controller.logOn("testy","password"));
		
		Assert.assertEquals("login succesful", true, this.controller.logOn("testy","123"));		
		
	}
	
	public void TestLogOut() {
		
		Assert.assertTrue("User is Logged out", this.controller.logOut("Mr.Logout12") == true);
		
		Assert.assertTrue("User is currently logged in", this.controller.logOut("Mr.Logout12") == false);
		
	}

}


