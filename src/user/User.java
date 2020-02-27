package user;
import java.util.ArrayList;

import Account.Account;
import university.University;

public class User extends Account {
	public User(String name, String password, String firstName, String lastName) {
		super(name, password, firstName, lastName);
		// TODO Auto-generated constructor stub
	}

	private ArrayList<University> savedSchools;
	
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
