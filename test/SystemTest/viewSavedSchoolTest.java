/**
 * 
 */
package SystemTest;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import DB.DBController;
import user.User;
import user.UserUI;

/**
 * @author jnewhouse003
 *
 */
public class viewSavedSchoolTest {
	DBController dataBase;
	User test;
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		this.dataBase = new DBController("goldencircle","csci230");
		UserUI.createController(this.dataBase);
		this.dataBase.addUser("test", "mcTesty", "testy", "123", 'u');
		this.test = new User("test","mcTesty", "testy", "123",'u');
		UserUI.addSavedSchool("testy", "HARVARD");
		
		
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		this.dataBase.removeUser("testy");
	}

	@Test
	public void testViewSavedSchool() {
		Assert.assertEquals("view saved school of a user that exists", true ,UserUI.viewSavedSchool("testy")[1].equals("HARVARD")); 
		
		UserUI.removeSavedSchool(this.test, "HARVARD");
		
		Assert.assertEquals("view saved school of a user that exists", true ,UserUI.viewSavedSchool("notTesty") == null);
	}

}
