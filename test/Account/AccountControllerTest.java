package Account;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import DB.DBController;

public class AccountControllerTest {
	AccountController controller;

	@Before
	public void setUp() throws Exception {
		this.controller = new AccountController();
		DBController dataBase = new DBController("goldencircle","csci230");
		controller.createController(dataBase);
		dataBase.addUser("test", "mcTesty", "testy", "123", 'u');
	}

	@After
	public void tearDown() throws Exception {
		//delete user
		
	}

	@Test
	public void TestLogOn() {
		Assert.assertTrue("login succesful", this.controller.logOn("testy","123") == true);
		
		Assert.assertTrue("login failed (wrong username)",this.controller.logOn("mctester", "123") == false);
		
		Assert.assertTrue("login failed (wrong password)", this.controller.logOn("testy", "password")== false);
	}

}


