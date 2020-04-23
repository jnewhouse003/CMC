/**
 * 
 */
package SystemTest;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import Account.AccountUI;
import Admin.AdminUI;
import DB.DBController;
import junit.framework.Assert;

/**
 * @author giteghete001
 *
 */
public class DeactivateUserTest {
	DBController database;
	

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		this.database = new DBController("goldencircle", "csci230");
		AdminUI.createController(database);
		database.addUser("rice", "m", "mrice001", "password1", 'u');
		AdminUI.activateUser("mrice001");
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		this.database.removeUser("mrice001");
	}

	@SuppressWarnings("deprecation")
	@Test
	public void test() {
		Assert.assertEquals("User has been deactivated",true, AdminUI.deactivateUser("mrice001"));
		Assert.assertEquals("User not dactivated", true, AdminUI.activateUser("mrice001"));
	}

}
