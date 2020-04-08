package SystemTest;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import Account.AccountUI;
import DB.DBController;

public class logOutTest {

	DBController dataBase;
	
	@Before
	public void setUp() throws Exception {
		this.dataBase = new DBController("goldencircle","csci230");
		AccountUI.createController(dataBase);
		dataBase.addUser("log", "out", "Mr.Logout12", "321", 'u');
		AccountUI.logOn("Mr.Logout12", "321");
	}

	@After
	public void tearDown() throws Exception {
		dataBase.getAccount("Mr.Logout12");
	}

	@Test

	public void testLogOut() {
		Assert.assertEquals("user is logged out", AccountUI.logOut("Mr.Logout12"));
		
		Assert.assertEquals("user is logged in", AccountUI.logOut("Mr.Logout12"));
	}
	
	
	}