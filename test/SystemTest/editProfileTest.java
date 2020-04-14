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

public class editProfileTest {

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
		//database.removeUser("BobBeast");
	}

	@Test
	public void testEditUserInfo() {
		
		
		Assert.assertEquals("user info changed in account", "Bob", this.account.getFirstName());
		
		UserUI.editUserInfo(this.account, "BobBetterPass", "Bobby", "Dill");
		
		Assert.assertEquals("info changed in database", "Bobby", this.database.getAccount("BobBeast").getFirstName());
		
		
		
	}

}
