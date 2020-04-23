/**
 * 
 */
package Admin;

import java.util.ArrayList;

import Account.Account;
import DB.DBController;
import university.University;
import user.User;

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
	
	/**
	 * This method finds all users in the database
	 * @return ArrayList of all users 
	 */
	public ArrayList<Account> allUsers() {

		return dataBaseCon.findallUsers();
	}
	
	/**
	 * This method creates database 
	 * @param dataBase
	 */
	public void createDataBase(DBController dataBase) {
		// TODO Auto-generated method stub
		dataBaseCon = dataBase;
	}
	
	/**
	 * This method checks if the user is valid and then deactivates the user in the database  
	 * @param userName
	 * @return boolean 
	 */
	public boolean deactivateUser(String userName) {
		Account actor = this.dataBaseCon.getAccount(userName);
		if(actor.getUserName().equals("")) {
			return false;
		}
		else if(actor.getUserName().equals(userName)) {
			this.dataBaseCon.editUser(actor.getUserName(), actor.getFirstName(),actor.getLastName(),actor.getPassword(), actor.getType(), 'N');
			return true;
		} else {
			return false;
			
		}
	}
	
	/**
	 * This method checks if the user is valid then activates the user in the datatbase  
	 * @param userName
	 * @return boolean
	 */
	public boolean activateUser(String userName) {
		Account actor = this.dataBaseCon.getAccount(userName);
		if(actor.getUserName().equals("")) {
			return false;
		}
		else if(actor.getUserName().equals(userName)) {
			this.dataBaseCon.editUser(actor.getUserName(), actor.getFirstName(),actor.getLastName(),actor.getPassword(), actor.getType(), 'Y');
			return true;
		} else {
			return false;
		}
	}

	
	
}
