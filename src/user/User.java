package user;
import java.util.ArrayList;

import Account.Account;
import university.University;


/**
 * This is the class for a User
 * 
 * @author npink001
 */
public class User extends Account {
	//an array list of schools the user has saved.
	private ArrayList<University> savedSchools;
	
	/**
	 * This is the constructor for a User
	 * 
	 * @param name
	 * @param password
	 * @param firstName
	 * @param lastName
	 * @param type
	 */
	public User(String name, String password, String firstName, String lastName, char type) {
		super(name, password, firstName, lastName, type);
		// TODO
	}

	
	/**
	 * This method adds a school to a User's saved schools
	 * 
	 * @param newSchool
	 */
	public void addSavedSchool(University newSchool) {
		this.savedSchools.add(newSchool);
	}

	public void viewSavedSchools() {
		// TODO
		
	}
	
	public void editUserInfo() {
		
		// TODO
	}
	
	public void removeSavedSchool(University school) {
		this.savedSchools.remove(school);
	}
	
	public boolean isLoggedOn() {
		// TODO
		
		return true;
		
	}
	
	public void getUserInfo() {
		// TODO
	}
	
	public void displayProfile(String userName, String Password) {
		// TODO
	}
	
	public void makeEditable() {
		// TODO
		
	}
	
	public Boolean currentlyLoggedOn() {
		
		// TODO
		return null;
		
		
	}
	
	
}
