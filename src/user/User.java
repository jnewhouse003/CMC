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
	public User(String firstName, String lastName, String name, String password, char type) {
		super(firstName, lastName, name, password, type);
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

	/*
	 * removes saved school from user
	 */
	
	public Boolean removeSavedSchool(University school) {
		if(savedSchools != null) {
			this.savedSchools.remove(school);
			return true;
		}
		return false;
	}
	
	/*
	 *returns if user is logged on
	 */
	
	public boolean isLoggedOn() {
		// TODO
		
		return true;
		
	}
	
	
	
	public Boolean currentlyLoggedOn() {
		
		// TODO
		return null;
		
		
	}
	
	/*
	 * gets the userName for the user
	 */
	public String getUserName() {
		return super.getUserName();
	}
	
	/*
	 * gets the password for the user
	 */
	public String getPassword() {
		return super.getPassword();
	}
	
	
	/*
	 * gets the lastName for the user
	 */
	public String getLastName() {
		return super.getLastName();
	}
	
	
	/*
	 * gets the firstName for the user
	 */
	public String getFirstName() {
		return super.getFirstName();
	}
	
	
	
}
