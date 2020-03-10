/**
 * 
 */
package Admin;

import java.util.ArrayList;

import DB.DBController;
import university.University;

/**
 * @author jnewhouse003
 *
 */
public class AdminController {
	
	public ArrayList<University> browseSchool() {
		DBController DataBase = new DBController("goldencircle","csci230");
		return DataBase.findallUniversity();
		
	}

}
