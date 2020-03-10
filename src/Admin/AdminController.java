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
	DBController DataBase;
	
	public ArrayList<University> browseSchool() {
		return DataBase.findallUniversity();

		
	}

	public void createDataBase(DBController dataBase) {
		// TODO Auto-generated method stub
		DataBase = dataBase;
	}

}
