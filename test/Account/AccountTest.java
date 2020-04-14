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
		Assert.assertEquals("view user info not a user", true, test.getUserName().equals("testy"));
		
		Assert.assertEquals("view user info not a user", false, test.getUserName().equals("notTesty"));
	}
	
	@Test
	public void testGetPassword() {
		Assert.assertEquals("view user info not a user", true, test.getPassword().equals("123"));
		
		Assert.assertEquals("view user info not a user", false, test.getPassword().equals("password"));
	}
	
	@Test
	public void testGetLastName() {
		Assert.assertEquals("view user info not a user", true, test.getLastName().equals("Mctester"));
		
		Assert.assertEquals("view user info not a user", false, test.getLastName().equals("lastName"));
	}
	
	@Test
	public void testGetFirstName() {
		Assert.assertEquals("view user info not a user", true, test.getFirstName().equals("test"));
		
		Assert.assertEquals("view user info not a user", false, test.getFirstName().equals("firstName"));
	}

}
