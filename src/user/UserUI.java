package user;
import java.util.ArrayList;

import Account.Account;
import Account.AccountController;
import university.University;

public interface UserUI {

	/**
	public void addSavedSchool(University school) {
		
		
	}
	
	public void findUniverstiy(String name) {
		
		
	}
	*/
	public static void searchSchool(User user, String state, int numStudents) {
		UserController userController = new UserController();
		userController.searchSchool(user, state, numStudents);
	}
	
	
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
	*/
	public static void displayResults(ArrayList<University> results) {
		for (int i = 0; i < results.size(); i++) {
			System.out.println("University name: " + results.get(i).getName()); 
			System.out.println("State: " + results.get(i).getState());
			System.out.println("location: " + results.get(i).getLocation());
			System.out.println("control: " + results.get(i).getControl());
			System.out.println("Number of Students:" + results.get(i).getNumStudents());
			System.out.println("percentage Female: " + results.get(i).getPercentFemale());
			System.out.println("percentage Male: " + results.get(i).getPercentMale());
			System.out.println("Verbal SAT: " + results.get(i).getVerbalSAT()); 
			System.out.println("Math SAT: " + results.get(i).getMathSAT());
			System.out.println("expenses: " + results.get(i).getExpenses());
			System.out.println("control: " + results.get(i).getControl());
			System.out.println("financial Aid:" + results.get(i).getFinancialAid());
			System.out.println("Number of Applications: " + results.get(i).getNumApplications());
			System.out.println("Percent Admitted " + results.get(i).getPercentAdmitted());
			System.out.println("Percent Enrolled: " + results.get(i).getPercentEnrolled()); 
			System.out.println("Academics Scale: " + results.get(i).getAcademicsScale());
			System.out.println("Social Scale: " + results.get(i).getSocialScale());
			System.out.println("Life Quality Scale: " + results.get(i).getLifeQualityScale());
			System.out.println("Emphases:" + results.get(i).getEmphases());
			System.out.println("");
		
		}
		
	}
	


	public static ArrayList<University> findTopFive(String state, String control, int lowerExpense, int upperExpense,String emphasesOne, String emphasesTwo)) {
		// TODO Auto-generated method stub
		UserController userController = new UserController();
		return userController.findTopFive(state,control,lowerExpense,upperExpense,emphasesOne,emphasesTwo);
		
	}
	
}

