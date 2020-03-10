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
		DBController dataBase = new DBController();
		return dataBase.findallUniversity();
		
	}

}
