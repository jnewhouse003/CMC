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
public class activateUserTest {
	DBController dataBase;
	
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		this.dataBase = new DBController("goldencircle","csci230");
		AccountUI.createController(dataBase);
		dataBase.addUser("rice", "m", "mrice001", "password1", 'u');
		AdminUI.deactivateUser("mrice001");
		
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		this.dataBase.removeUser("mrice001");
		
	}

	@Test
	public void test() {
		
		Assert.assertEquals("User has been activated", AccountUI.addUser("act", "t", "activate12", "322", 'a'));
		
	}

}
