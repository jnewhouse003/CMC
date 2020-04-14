package Admin;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import DB.DBController;

public class AdminControllerTest {
	DBController dataBase;
	AdminController val;
	@Before
	public void setUp() throws Exception {
		this.dataBase = new DBController("goldencircle","csci230");
		this.val = new AdminController();
		this.val.createDataBase(this.dataBase);
		this.dataBase.addUser("rice", "m", "mrice001", "password1", 'u');
		AdminUI.createController(this.dataBase);
		AdminUI.deactivateUser("mrice001");
		
		
		
	}

	@After
	public void tearDown() throws Exception {
		this.dataBase.removeUser("mrice001");
	}

	@Test
	public void testActivateUser() {
		Assert.assertEquals("username invalid", false, val.activateUser("mrice001"));
		Assert.assertEquals("username valid", true, val.activateUser(""));
	}
	
	@Test
	public void testDeactivateUser() {
		Assert.assertEquals("Username is invalid", false, val.deactivateUser("mrice001"));
		Assert.assertEquals("Username is valid", true, val.deactivateUser(""));
	}

}
