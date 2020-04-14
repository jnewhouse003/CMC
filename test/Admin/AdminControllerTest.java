package Admin;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import DB.DBController;

public class AdminControllerTest {
	DBController dataBase;
	@Before
	public void setUp() throws Exception {
		this.dataBase = new DBController("goldencircle","csci230");
		AdminUI.createController(dataBase);
		this.dataBase.addUser("rice", "m", "mrice001", "password1", 'u');
		AdminUI.deactivateUser("mrice001");
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testActivateUser() {
		Assert.assertEquals("no username", true, this.dataBase.("")
	}

}
