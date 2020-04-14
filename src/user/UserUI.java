package user;
import java.util.ArrayList;

import Account.Account;
import Account.AccountController;
import Criteria.Criteria;
import DB.DBController;
import university.University;

public interface UserUI {
	
	UserController userController = new UserController();
	AccountController info = new AccountController();

	/**
	
	
	public static void findUniverstiy(String name) {

		
	}
	*/
	
	public static ArrayList<University> searchSchool(String user, Criteria parameters) {
		
		displayResults(userController.searchSchool(user, parameters));
		return userController.searchSchool(user, parameters);
	}
	
	
	
	public static ArrayList<String> viewUserInfo(User userInfo) {
		
		
		return userController.viewUserInfo(userInfo);
	}
	
	public static void editUserInfo(Account userInfo, String password, String firstName, String lastName) {
		
		
		
		info.editUserInfo(userInfo, password,firstName, lastName);
	}
	
	public static Boolean removeSavedSchool(User peterUser, String name) {
		
		
		return userController.removeSavedSchool(peterUser, name);
	}
	
	
	public static Boolean addSavedSchool(String user, String school) {
		
		 return userController.addSavedSchool(user, school);
		
	}

	public static String[] viewSavedSchool(String username) {
		
		return userController.viewSavedSchool(username);
	}
	
	
	/**
	public void logout() {
		
	}
	
	public void manageProfile(String name) {
		
	}
	*/
	public static void displayResults(ArrayList<University> results) {
		if(results != null) {
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
		else {
			System.out.println("NO SCHOOLS");
		}
	}
	


	public static ArrayList<University> findTopFive(String state, String control, int lowerExpense, int upperExpense,String emphasesOne, String emphasesTwo) {
		// TODO Auto-generated method stub

		return userController.findTopFive(state,control,lowerExpense,upperExpense,emphasesOne,emphasesTwo);
		
	}


	public static void createController(DBController dataBase, AccountController accountController) {
		// TODO Auto-generated method stub
		userController.createDataBase(dataBase,accountController);
		info.createController(dataBase); 
		
	}
	
	public static void createController(DBController dataBase) {
		// TODO Auto-generated method stub
		userController.createDataBase(dataBase);
		
	}


	


	
}

