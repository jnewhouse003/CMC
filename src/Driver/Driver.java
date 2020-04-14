package Driver;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Account.Account;
import Account.AccountUI;
import Admin.AdminUI;
import Criteria.Criteria;
import DB.DBController;
import search.searchController;
import university.University;
import user.User;
import user.UserUI;

/**
 * This is the class for the driver
 * 
 * @author GoldenCircle
 */
public class Driver implements AccountUI, UserUI, AdminUI
{

	private static String loginInfo, viewAndEditProfile, userSearchForSchools, userViewSearchResults, userFindTopFive, adminViewUniversities;
	
	
	/**
	 * This method runs the driver
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		
		DBController dataBase = new DBController("goldencircle","csci230");
		
		AccountUI.createController(dataBase);
		AdminUI.createController(dataBase);
		UserUI.createController(dataBase,AccountUI.getAccountController());
		
		
		ArrayList<University> sresults = new ArrayList();
		sresults.add(dataBase.getUniversity("BARNARD"));
		UserUI.displayResults(sresults);
		
		System.out.println("Step 1: logon");
		AccountUI.addUser("test", "mcTesty", "testy", "123", 'u');
		if(AccountUI.logOn("testy", "123") == true) {
			System.out.println("login was succesful");
		}
		else {
			System.out.println("login failed");
		}
		if(AccountUI.logOn("testy", "12") == true) {
			System.out.println("login was succesful");
		}
		else {
			System.out.println("login failed");
		}
		if(AccountUI.logOn("mcTester", "123") == true) {
			System.out.println("login was succesful");
		}
		else {
			System.out.println("login failed");
		}
		
		System.out.println("--------------------");
		
<<<<<<< HEAD
		Account test = new Account("test", "mctester", "testy", "123", 'u');
		System.out.println("Step 2: view Profile");
		UserUI.viewUserInfo(test);
=======
		User test = new User("testy", "mctester", "testy", "123", 'u');
		System.out.println("Step 2: viewAndEditProfile");
		ArrayList<String> info = UserUI.viewUserInfo(test);
		for(int i = 0;i < info.size(); i++) {
			System.out.println(info.get(i));
		}
>>>>>>> 58043dbfafd23e9f8d4e7102aed83f16cf05d268
		
		System.out.println("Step 3: Edit Profile");
        UserUI.editUserInfo(test, "1234", "Test", "Mctest");
        System.out.println("Updated User Info: ");
        UserUI.viewUserInfo(test);
       
        System.out.println("--------------------");
        System.out.println("Step 4: Search for schools by a combination of state and number of students");
        User peterUser = new User("peter", "ohmann", "pohmann", "123", 'u');
        AccountUI.addUser("peter", "Ohmann", "pohmann", "123", 'u');
        ArrayList<String> temp = new ArrayList();
        Criteria parameters = new Criteria("", "NEW YORK", "URBAN", "PRIVATE",0, 0, 0.0, 0.0, 0.0, 0.0, 0, 0, 0, 0, 0.0, 0.0,0.0,0.0, 0, 0, 0.0, 0.0, 0.0, 0.0, 0,0,0,0,0,0,temp);
        UserUI.searchSchool("pohmann", parameters);
        //UserUI.searchSchool(peterUser, parameters);
        //UserUI.searchSchool(peterUser, parameters);
        //UserUI.searchSchool(peterUser, parameters);
        //UserUI.searchSchool(peterUser, parameters);
        //UserUI.searchSchool(peterUser, parameters);
        
        System.out.println("--------------------");
		System.out.println("Step 5: View results");
		University school1 = new University("Peter University", "Minnesota", "St.Joe", "Peter", 1, 0.0, 100.0, 10, 10000, 10.0, 9999.0, 1, 100.0, 100.0, 10, 10,10,"MATH");
		University school2 = new University("Golden Circle", "Minnesota", "St.Paul", "Golden Circle",1, 0.0, 100.0, 10, 10000, 10.0, 9999.0, 1, 100.0, 100.0, 10, 10,10,"MATH");
		ArrayList<University> results = new ArrayList<University>();
		results.add(school1);
		results.add(school2);
		UserUI.displayResults(results);
		
		
		System.out.println("--------------------");
		System.out.println("Step 6: Browse School");
		//AdminUI.browseSchool();
		
		
		System.out.println("--------------------");
		System.out.println("Step 7: Find top 5");
		UserUI.findTopFive("ta", "CITY", 10000,0,"SCIENCE", "MATH");//.findTopFive("ta", "CITY", 10000,0,"SCIENCE", "MATH");
	    System.out.println("Top 5 is: ");
		UserUI.displayResults(UserUI.findTopFive("ta", "CITY", 10000,0,"SCIENCE", "MATH"));
		
		
		System.out.println("--------------------");
		System.out.println("Step 8: Remove saved school");
		UserUI.removeSavedSchool(peterUser,"St.Johns");
		
		System.out.println("--------------------");
		System.out.println("Step 9: View specific school information");
		ArrayList<University> schools = new ArrayList();
		schools.add(AccountUI.viewResults("ARIZONA STATE"));
		UserUI.displayResults(schools);
		
		
		System.out.println("--------------------");
		System.out.println("Step 10: Add saved school");
		UserUI.addSavedSchool("pohmann", "ARIZONA STATE");
		
		System.out.println("--------------------");
		System.out.println("Step 11: view Saved school");
		String[] savedSchools = UserUI.viewSavedSchool("pohmann");
		for(int i = 0; i< savedSchools.length; i++) {
			System.out.println(savedSchools[i]);
		}
		
		System.out.println("-------------------");
		System.out.println("Step 12: Activate/Add User");
		AccountUI.addUser("Diego", "A", "dalv1212", "3232", 'a');
		AccountUI.addUser("Jerome", "B", "jnew1212", "32321", 'a');
		AccountUI.addUser("Nick", "C", "npink1212", "32322", 'a');
		AccountUI.addUser("GiGi", "D", "gfit1212", "32323", 'a');
		AccountUI.addUser("Joe", "E", "jlaux1212", "32324", 'a');
		
		System.out.println("-------------------");
		System.out.println("Step 13: Logout");
		if (AccountUI.logOut("dalv1212") == true)
		{
			System.out.println("Logged Out");
		}
		else
		{
			System.out.println("Logged Out Failed");
		}
		
		System.out.println("-------------------");
		System.out.println("Step 14: Deactivate user (admin)");
		AdminUI.deactivateUser("dalv1212");
		
		System.out.println("-------------------");
		System.out.println("Step 15: View list users (admin)");
		AdminUI.allUsers();
		AdminUI.deactivateUser("testy");
		AdminUI.deactivateUser("tester");
		AdminUI.allUsers();
		
		
		
		
		
		
	}

}
