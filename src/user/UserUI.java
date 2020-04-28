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
	
	/*
	 * this method calls the userController to search for a school based on criteria
	 */
	public static ArrayList<University> searchSchool(String user, Criteria parameters) {
		
		displayResults(userController.searchSchool(user, parameters));
		return userController.searchSchool(user, parameters);
	}
	
	
	/*
	 * call the user controller to view user info
	 */
	public static ArrayList<String> viewUserInfo(User userInfo) {
		
		
		return userController.viewUserInfo(userInfo);
	}
	
	/*
	 * calls account controller to edit the users info
	 */
	
	public static void editUserInfo(Account userInfo, String password, String firstName, String lastName) {
		
		
		
		info.editUserInfo(userInfo, password,firstName, lastName);
	}
	
	/*
	 * calls to the userController to remove a saved school for a user
	 */
	
	public static Boolean removeSavedSchool(String user, String name) {
		
		
		return userController.removeSavedSchool(user, name);
	}
	
	
	/*
	 * adds a school to the users saved schools
	 */
	
	public static Boolean addSavedSchool(String user, String school) {
		
		 return userController.addSavedSchool(user, school);
		
	}
	
	/*
	 * calls to user controller to get the saved schools for a user
	 */

	public static ArrayList<ArrayList<String>> viewSavedSchool(String username) {
		
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
	
	/*
	 * calls to the userController to find top five universities 
	 */

	public static ArrayList<University> findTopFive(String state, String control, int lowerExpense, int upperExpense,String emphasesOne, String emphasesTwo) {
		// TODO Auto-generated method stub

		return userController.findTopFive(state,control,lowerExpense,upperExpense,emphasesOne,emphasesTwo);
		
	}

	/*
	 * create dataBase and accountController
	 */

	public static void createController(DBController dataBase, AccountController accountController) {
		// TODO Auto-generated method stub
		userController.createDataBase(dataBase,accountController);
		info.createController(dataBase); 
		
	}
	
	/*
	 * creates database
	 */
	
	public static void createController(DBController dataBase) {
		// TODO Auto-generated method stub
		userController.createDataBase(dataBase);
		
	}


	


	
}

