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
	

	public ArrayList<Account> allUsers() {
		
		return dataBaseCon.findallUsers();
	}
	

	public void createDataBase(DBController dataBase) {
		// TODO Auto-generated method stub
		dataBaseCon = dataBase;
	}
	
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
