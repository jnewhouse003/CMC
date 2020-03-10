package Account;

import DB.DBController;

/**
 * This is the controller class for Accounts
 * 
 * @author npink001
 */
public class AccountController {

	public AccountController() {
		
		
	}
	
	/**
	 * This method logs an account on
	 * 
	 * @param username
	 * @param password
	 */
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
	
	/**
	 * This method logs an Account out
	 * 
	 * @param account
	 */
	public void logOut(String account) {
		DB.DBController dbController = new DB.DBController("goldencircle","csci230");
		
		if (dbController.getAccount(account) == null);
		{
			System.out.println("The user is no longer logged in");
		}
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
	
	/**
	 * This method changes the information tied to a user's Account
	 * 
	 * @param info
	 * @param newPassword
	 * @param newFirstName
	 * @param newLastName
	 */
	public void editUserInfo(Account info, String newPassword, String newFirstName, String newLastName) {
		info.setPassword(newPassword); 
		info.setFirstName(newFirstName);
		info.setLastName(newLastName);
		
	}

	/**
	 * This method adds a new User Account
	 * 
	 * @param firstName
	 * @param lastName
	 * @param userName
	 * @param password
	 * @param type
	 * @return
	 */
	public int addUser(String firstName, String lastName, String userName, String password, char type) {
		// TODO Auto-generated method stub
		DBController dbController = new DBController("goldencircle","csci230");
		return dbController.addUser(firstName, lastName, userName, password, type);
	}

}
