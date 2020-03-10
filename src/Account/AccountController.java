/**
 * 
 */
package Account;

import DB.DBController;

/**
 * @author npink001
 *
 */
public class AccountController {

	public AccountController() {
		
		
	}
	
	public void logOn(String username, String password) {
		DBController dbController = new DBController("goldencircle","csci230");
		if (dbController.lookUpUser(username) == true)
		{
			Account hardCode = dbController.getAccount(username);
			if (hardCode.getPassword() == password)
			{
				System.out.println("Peter is logged in!");
			}
			else
			{
				System.out.println("Password invalid");
			}
			
			
		}
		else
		{
			System.out.println("User invalid");
		}
		
	}
	
	public void logOut() {
		
	}
	
	public String getPassword() {
		
		return null;
	}
	
	public void viewResults(String universityName) {
		
	}
	
	
	public void viewUserInfo(Account user) {
		System.out.println("User: " + user.getUserName()); 
		
		System.out.println("Password: " + user.getPassword()); 
		
		System.out.println("First Name: " + user.getFirstName()); 
		
		System.out.println("Last Name: " + user.getLastName()); 
	}
	
	public void editUserInfo(Account info, String newPassword, String newFirstName, String newLastName) {
		info.setPassword(newPassword); 
		info.setFirstName(newFirstName);
		info.setLastName(newLastName);
		
	}

	public int addUser(String firstName, String lastName, String userName, String password, char type) {
		// TODO Auto-generated method stub
		DBController dbController = new DBController("goldencircle","csci230");
		return dbController.addUser(firstName, lastName, userName, password, type);
	}

}
