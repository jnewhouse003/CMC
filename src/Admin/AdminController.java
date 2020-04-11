/**
 * 
 */
package Admin;

import java.util.ArrayList;

import Account.Account;
import DB.DBController;
import university.University;

/**
 * This is the class for an Admin Controller
 * 
 * @author jnewhouse003
 */
public class AdminController {
	DBController dataBaseCon;
	
	/**
	 * This method returns a list of Universities from the DB
	 * 
	 * @return list of Universities from DB
	 */
	public ArrayList<University> browseSchool() {
		return dataBaseCon.findallUniversity();
	}
	

	public ArrayList<Account> allUsers() {
		
		return dataBaseCon.findallUsers();
	}
	

	public void createDataBase(DBController dataBase) {
		// TODO Auto-generated method stub
		dataBaseCon = dataBase;
	}
	
	public int deactivateUser(String userName) {
		return dataBaseCon.removeUser(userName);
		
	}

}
