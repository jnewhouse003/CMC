package SystemTest;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import Account.Account;
import Account.AccountUI;
import DB.DBController;
import user.UserUI;

public class viewProfileTest {
	DBController database;
	Account account;
	@Before
	public void setUp() throws Exception {
		this.database = new DBController("goldencircle","csci230");
		AccountUI.createController(database);
		account = new Account("Bob", "Dylan","BobBeast","BobPass",'u');
		this.database.addUser("Bob", "Dylan", "BobBeast", "BobPass", 'u');
		UserUI.createController(this.database,AccountUI.getAccountController());
	}

	@After
	public void tearDown() throws Exception {
		database.removeUser("BobBeast");
	}

	@Test
	public void testViewProfile() {
		Assert.assertEquals("first name matches", "Bob", this.account.getFirstName());
		Assert.assertEquals("last name matches", "Dylan", this.account.getLastName());
		Assert.assertEquals("username matches", "BobBeast", this.account.getUserName());
		Assert.assertEquals("password matches", "BobPass", this.account.getPassword());
		Assert.assertEquals("type matches", 'u', this.account.getType());
		
		
	}

}
