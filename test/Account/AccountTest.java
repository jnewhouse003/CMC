package Account;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class AccountTest {
	Account test;

	@Before
	public void setUp() throws Exception {
		this.test = new Account("test", "Mctester", "testy", "123", 'u');
	}

	@After
	public void tearDown() throws Exception {
	}


	@Test
	public void testGetUserName() {
		Assert.assertEquals("get username of a account", true, test.getUserName().equals("testy"));
		
		Assert.assertEquals("get username but doesn't equal what expected", false, test.getUserName().equals("notTesty"));
	}
	
	@Test
	public void testGetPassword() {
		Assert.assertEquals("get password of account", true, test.getPassword().equals("123"));
		
		Assert.assertEquals("get password of account bit not what expected", false, test.getPassword().equals("password"));
	}
	
	@Test
	public void testGetLastName() {
		Assert.assertEquals("get last name of account", true, test.getLastName().equals("Mctester"));
		
		Assert.assertEquals("get last name of account but not what expected", false, test.getLastName().equals("lastName"));
	}
	
	@Test
	public void testGetFirstName() {
		Assert.assertEquals("get account first name", true, test.getFirstName().equals("test"));
		
		Assert.assertEquals("get account first name but not what expected", false, test.getFirstName().equals("firstName"));
	}
	
	@Test
	public void testIsLoggedOn() {
		Assert.assertEquals("get account log on status when logged in", true, test.getLogOnStatus());
		this.test.setLogOnStatus(false);
		Assert.assertEquals("get account log on status when logged off", false, test.getLogOnStatus());
	}

}
