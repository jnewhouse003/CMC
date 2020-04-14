package SystemTest;

import static org.junit.Assert.*;


import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import Account.AccountUI;
import DB.DBController;
import university.University;

public class viewSpecificSchoolInfoTest {

	University school;
	DBController db;
	
	@Before
	public void setUp() throws Exception {
		//schools = new ArrayList();
		school = AccountUI.viewResults("ARIZONA STATE");
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		Assert.assertEquals("info shown successfully", "ARIZONA STATE", school.getName());
	}

}
