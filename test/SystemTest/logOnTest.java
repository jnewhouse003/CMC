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

public class logOnTest {

	DBController dataBase;
	
	@Before
	public void setUp() throws Exception {
		this.dataBase = new DBController("goldencircle","csci230");
		AccountUI.createController(dataBase);
		dataBase.addUser("test", "mcTesty", "testy", "123", 'u');
	}

	@After
	public void tearDown() throws Exception {
		dataBase.removeUser("testy");
	}

	@Test
	public void testLogOn() {
		Assert.assertEquals("successful log on", true, AccountUI.logOn("testy", "123"));
		
		Assert.assertEquals("failed log on (wrong password)", false, AccountUI.logOn("testy", "password"));
		
		Assert.assertEquals("failed log on (wrong username)",false, AccountUI.logOn("mcTester", "123"));
		
		
		}
	
	
	}


