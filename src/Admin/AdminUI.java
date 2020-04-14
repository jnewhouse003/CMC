package Admin;

import java.util.ArrayList;

import Account.Account;
import DB.DBController;
import university.University;

/**
 * This is the interface for the AdminUI
 * 
 * @author jlaux001
 */
public interface AdminUI {
	
	AdminController controller = new AdminController();
	
	
	
	public static void addSchool(String university) {
		
	}
	public static void editSchool() {
		
	}
	public static void logout() {
		
	}
	public static boolean deactivateUser(String userName) {
		return controller.deactivateUser(userName);
	}
	
	public static boolean activateUser(String userName) {
		return controller.activateUser(userName);
	}
	
	/**
	 * This method calls on the AdminController to show a list of Universities
	 */
	public static void browseSchool() {
		
		displayResults(controller.browseSchool());
	}
	
	public static void allUsers() {
		displayUsers(controller.allUsers());
	}
	
	
	
	
	
	public static void displayUsers(ArrayList<Account> users) {
	
		System.out.println("   ");
		if(users.size() > 0) {
			for(int a = 0; a < users.size(); a++) {
				System.out.println("USER:" + users.get(a).getUserName());
				
			}
		}
	}
	
	/**
	 * This method prints out the information tied to each University
	 * 
	 * @param results
	 */
	public static void displayResults(ArrayList<University> results) {
		if(results.size() > 0) {
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
	}
	public static void createController(DBController dataBase) {
		// TODO Auto-generated method stub
		controller.createDataBase(dataBase);
		
	}
	

}
