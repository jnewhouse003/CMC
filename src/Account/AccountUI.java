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
	
	public static void logOut() {
		
	}

	public static void viewResults() { 
		
	}
	
	
	
	
}
