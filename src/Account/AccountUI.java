/**
 * 
 */
package Account;

import java.util.ArrayList;

import university.University;

/**
 * This is the interface for an AccountUI
 * 
 * @author dalvarez001
 */
public interface AccountUI {

	/**
	 * This method calls on the controller to set an Account to logged on 
	 * 
	 * @param username
	 * @param password
	 */
	public static void logOn(String username, String password) {

		AccountController name = new AccountController();
		name.logOn(username, password);

	}

	/**
	 * This method calls on the controller to set an Account to logged out
	 * 
	 * @param account
	 */
	public static void logOut(String account) {
		AccountController name = new AccountController();
		name.logOut(account);
	}


	public static String viewResults(String university) { 
		
			AccountController name = new AccountController();
			name.viewResults(university);
		return university;
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
		AccountController name = new AccountController();
		return name.addUser(firstName, lastName, userName, password, type);

	}

}






