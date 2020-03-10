/**
 * 
 */
package Account;

import java.util.ArrayList;

import university.University;

/**
 * @author dalvarez001
 *
 */
public interface AccountUI {
	 
	
	public static void logOn(String username, String password) {
		
		AccountController name = new AccountController();
		name.logOn(username, password);
		
		
	}
	
	public static void logOut(String account) {
			AccountController name = new AccountController();
			name.logOut(account);
	}

	public static void viewResults() { 
		
	}

	public static int addUser(String firstName, String lastName, String userName, String password, char type) {
		// TODO Auto-generated method stub
		AccountController name = new AccountController();
		return name.addUser(firstName, lastName, userName, password, type);
		
	}
	
	
	
	
	
	
}
