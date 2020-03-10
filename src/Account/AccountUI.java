/**
 * 
 */
package Account;

import java.util.ArrayList;

import DB.DBController;
import university.University;

/**
 * This is the interface for an AccountUI
 * 
 * @author dalvarez001
 */
public interface AccountUI {
	
	AccountController name = new AccountController();

	/**
	 * This method calls on the controller to set an Account to logged on 
	 * 
	 * @param username
	 * @param password
	 */
	public static void logOn(String username, String password) {

		
		name.logOn(username, password);

	}

	/**
	 * This method calls on the controller to set an Account to logged out
	 * 
	 * @param account
	 */
	public static void logOut(String account) {
	
		name.logOut(account);
	}

	/**
	 * This method calls on the controller to get a University
	 * 
	 * @param university
	 * @return university
	 */
	public static University viewResults(String university) { 
	
			
			return name.viewResults(university);
		
	}

	/**
	 * This method calls on the controller to add a User Account
	 * 
	 * @param firstName
	 * @param lastName
	 * @param userName
	 * @param password
	 * @param type
	 * @return an integer to be used by the database
	 */
	public static int addUser(String firstName, String lastName, String userName, String password, char type) {
		// TODO Auto-generated method stub
		
		return name.addUser(firstName, lastName, userName, password, type);

	}

	public static void createController(DBController dataBase) {
		// TODO Auto-generated method stub
		name.createController(dataBase);
	}

}






