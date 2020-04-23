package Account;

import DB.DBController;

import java.util.ArrayList;

import Account.Account;
import university.University;

/**
 * This is the controller class for Accounts
 * 
 * @author npink001
 */
public class AccountController {

	DBController dbController;
	private Account loggedInUser;
	
	/**
	 * This method logs an account on
	 * 
	 * @param username
	 * @param password
	 */
	public Boolean logOn(String username, String password) {
		
		
			Account hardCode = dbController.getAccount(username);
			if(hardCode.getUserName().equals("")) {
				return false;
			}
			else {
				if (hardCode.getPassword().equals(password))
				{
					this.loggedInUser = hardCode;
					return loggedInUser.setLogOnStatus(true);
				}
				else
				{
					this.loggedInUser = hardCode;
					return loggedInUser.setLogOnStatus(false);
				}
			}
		
				
			}
			
		
		
		
		
	
	
	/**
	 * This method logs an Account out
	 * 
	 * @param account
	 */
	public boolean logOut(String account) {

		
		if (dbController.getAccount(account) != null)
		{
			if(this.loggedInUser.getUserName().equals(this.dbController.getAccount(account).getUserName())) {
				if(this.getLoggedInUserStatus() == true) {
					this.loggedInUser.logOff();
					return true;
				}
				else {
					return false;
				}
			}
			else {
				
				return false;
			}
			
		}
		else {
		
		return false;
		
		}
		 
	}
	
	/**
	 * This methods should return the password assigned to Account 
	 * @return null 
	 */
	public String getPassword() {
		
		return null;
	}
	
	/**
	 * This method should return the results pulled from database 
	 * @param university
	 * @return university gotten from the database
	 */
	public University viewResults(String university) {
		
		 
		if(dbController.getUniversity(university)== null) {
			return null;
		}
		else {
			return dbController.getUniversity(university);
		}
			
			
		
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
		if(this.dbController == null) {
			
		}
		else {
			this.dbController.editUser(newFirstName, newLastName, info.getUserName(), newPassword, info.getType(), 'y');
		}
	}

	/**
	 * This method adds a new User Account
	 * 
	 * @param firstName
	 * @param lastName
	 * @param userName
	 * @param password
	 * @param type
	 * @return an integer to be used by the database
	 */
	public int addUser(String firstName, String lastName, String userName, String password, char type) {
		// TODO Auto-generated method stub
	
		return dbController.addUser(firstName, lastName, userName, password, type);
	}

	public void createController(DBController dataBase) {
		// TODO Auto-generated method stub
		this.dbController = dataBase;
	}
	
	public Account getLoggedInUser() {
		return loggedInUser;
		
	}
	
	public void setLoggedInUser(Account user) {
		this.loggedInUser = user;
	}
	
	public boolean getLoggedInUserStatus() {
		return this.loggedInUser.getLogOnStatus();
	}

}
