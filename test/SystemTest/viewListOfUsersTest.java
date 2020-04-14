/**
 * 
 */
package SystemTest;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import Account.AccountUI;
import Admin.AdminUI;
import DB.DBController;

/**
 * @author dalvarez001
 *
 */
public class viewListOfUsersTest {
	DBController dataBase;
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		this.dataBase = new DBController("goldencircle","csci230");
		AccountUI.createController(dataBase);
		dataBase.addUser("log", "out", "Mr.Logout12", "321", 'u');
		
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		//dataBase.removeUser("Mr.Logout12");
	}

	@Test
	public void test() {
		Assert.assertArrayEquals("User is in the database", AdminUI.allUsers());
	}

}
