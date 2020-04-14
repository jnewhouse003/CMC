package Account;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import DB.DBController;
import user.User;
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
	
	@Test
	public void TestLogOut() {
		this.controller.logOn("MrLogout12", "321");
		
		Assert.assertEquals("User is Logged out",true, this.controller.logOut("Mr.Logout12") == true);
		
		
		Assert.assertEquals("User is currently logged in", false, this.controller.logOut("Mr.Logout12") );
		
	}
	
	

}


