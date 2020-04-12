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
import User.UserController;
import DB.DBController;
import user.UserUI;


/**
 * @author jlaux001
 *
 */
public class addSavedSchoolTest {
DBController dataBase;
	
	@Before
	public void setUp() throws Exception{
		this.dataBase = new DBController("goldencircle", "csci230";)
		UserUI.createController(dataBase);
		dataBase.addUser("John", "Smith", "jsmith001", "password", 'u');
		
	}
	
	@After
	public void tearDown() throws Exception {
		dataBase.removeUser("jsmith001");
		dataBase.removeSavedSchool(dataBase.getUniversity("ARIZONA STATE"));
	}
	
	@Test
	public void testAddSavedSchools() {
		
		Assert.assertEquals("School is added to save schools", true, UserUI.addSavedSchool("jsmith001", "ARIZONA STATE"));
		Assert.assertEquals("School is not added to save schools (Wrong User)", false, UserUI.addSavedSchool("Kevin", "ARIZONA STATE"));
		Assert.assertEquals("School is not added to save schools (Wrong University)", false, UserUI.addSavedSchool("jsmith001", "STATE"));
		
	}


}
