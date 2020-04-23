/**
 * 
 */
package SystemTest;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import Account.Account;
import Account.AccountUI;
import Admin.AdminUI;
import DB.DBController;
import user.User;
import user.UserUI;

/**
 * @author dalvarez001
 *
 */
public class viewListOfUsersTest {
	DBController dataBase;
	Account account;
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		this.dataBase = new DBController("goldencircle","csci230");
		AdminUI.createController(dataBase);
		account = new Account("Bob", "Dylan","BobBeast","BobPass",'u');
		account = new Account("Bo", "Dy","BoBeast12","BobPass12",'u');
		account = new Account("B", "D","BDBeast","BobPass1223",'u');
		this.dataBase.addUser("Bob", "Dylan", "BobBeast", "BobPass", 'u');
		this.dataBase.addUser("Bo", "Dy","BoBeast12","BobPass12",'u');
		this.dataBase.addUser("B", "D","BDBeast","BobPass1223",'u');
		
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		dataBase.removeUser("BobBeast");
		dataBase.removeUser("BoBeast12");
		dataBase.removeUser("BDBeast");
		
	}

	@Test
	public void testViewListOfUsers() {
		
		Assert.assertEquals("user in the data base",true, AdminUI.allUsers().get(1).getUserName().equals("BDBeast"));
		Assert.assertEquals("user not in the data base",false, AdminUI.allUsers() == null);
		
	}

}
