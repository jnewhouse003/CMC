package user;
import java.util.ArrayList;

import Account.Account;
import Account.AccountController;

public interface UserUI {

	/**
	public void addSavedSchool(University school) {
		
		
	}
	
	public void findUniverstiy(String name) {
		
		
	}
	
	public University searchSchool(Criteria searchPara) {
		return null;
		
		
	}
	*/
	
	public static void viewUserInfo(Account userInfo) {
		AccountController info = new AccountController();
		
		info.viewUserInfo(userInfo);
	}
	
	public static void editUserInfo(Account userInfo, String password, String firstName, String lastName) {
		
		AccountController info = new AccountController();
		
		info.editUserInfo(userInfo, password,firstName, lastName);
	}
	/**
	public void viewSavedSchool() {
		
		
	}
	
	public void removeSavedSchool(University school) {
		
		
	}
	
	public void logout() {
		
	}
	
	public void manageProfile(String name) {
		
	}
	
	public ArrayList<University> displayResults(ArrayList<University> results) {
		return results;
		
	
	}
	*/
}
