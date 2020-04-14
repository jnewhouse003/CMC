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
		AccountUI.createController(database);
		database.addUser("rice", "m", "mrice001", "password1", "u");
		AdminUI.activateUser("mrice001");
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		
	}

}
