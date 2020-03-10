/**
 * 
 */
package Admin;

import java.util.ArrayList;

import DB.DBController;
import university.University;

/**
 * This is the class for an Admin Controller
 * 
 * @author jnewhouse003
 */
public class AdminController {
	DBController DataBase;
	
	/**
	 * This method returns a list of Universities from the DB
	 * 
	 * @return list of Universities from DB
	 */
	public ArrayList<University> browseSchool() {
		return DataBase.findallUniversity();
	}

	public void createDataBase(DBController dataBase) {
		// TODO Auto-generated method stub
		DataBase = dataBase;
	}

}
