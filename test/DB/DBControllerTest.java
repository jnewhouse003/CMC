package DB;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class DBControllerTest {
	DBController controller;

	@Before
	public void setUp() throws Exception {
		this.controller = new DBController("goldencircle","csci230");
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void TestGetAccount() {
		Assert.assertEquals("userFound" , "testy" ,this.controller.getAccount("testy").getUserName());
		
		Assert.assertEquals("user not found" , "" ,this.controller.getAccount("notTesty").getUserName());
	
	}

}
