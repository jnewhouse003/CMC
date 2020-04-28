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
	 * This method is used to run the driver for each use case 
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		
		DBController dataBase = new DBController("goldencircle","csci230");
		
		AccountUI.createController(dataBase);
		AdminUI.createController(dataBase);
		UserUI.createController(dataBase,AccountUI.getAccountController());
		String[][] e = dataBase.getAllEmphases();
		for (int i = 0; i < e.length; i++) {
			//System.out.println(e[i][0] + "    " + e[i][1]);
		}
		
		
		ArrayList<University> sresults = new ArrayList<University>();
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

		Account test = new Account("test", "mctester", "testy", "123", 'u', 'Y');
		System.out.println("Step 2: view Profile");
		//UserUI.viewUserInfo(test);
		
		System.out.println("Step 3: Edit Profile");
        UserUI.editUserInfo(test, "1234", "Test", "Mctest");
        System.out.println("Updated User Info: ");
        //UserUI.viewUserInfo(test);
       
        System.out.println("--------------------");
        System.out.println("Step 4: Search for schools by a combination of state and number of students");
        User peterUser = new User("peter", "ohmann", "pohmann", "123", 'u', 'y');
        AccountUI.addUser("peter", "Ohmann", "pohmann", "123", 'u');
        AccountUI.logOn("pohmann", "123");
        ArrayList<String> temp = new ArrayList<String>();
        Criteria parameters = new Criteria("", "NEW YORK", "URBAN", "PRIVATE",0, 0, 0.0,0.0,0.0, 0.0, 0, 0, 0, 0, 0.0, 0.0,0.0,0.0, 0, 0, 0.0, 0.0, 0.0, 0.0, 0,0,0,0,0,0,temp);
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
		UserUI.removeSavedSchool("pohmann","St.Johns");
		
		System.out.println("--------------------");
		System.out.println("Step 9: View specific school information");
		ArrayList<University> schools = new ArrayList<University>();
		schools.add(AccountUI.viewResults("ARIZONA STATE"));
		UserUI.displayResults(schools);
		
		
		System.out.println("--------------------");
		System.out.println("Step 10: Add saved school");
		UserUI.addSavedSchool("pohmann", "ARIZONA STATE");
		UserUI.addSavedSchool("pohmann", "BARNARD");
		
		System.out.println("--------------------");
		System.out.println("Step 11: view Saved school");
		ArrayList<ArrayList<String>> savedSchools = UserUI.viewSavedSchool("pohmann");
		for(int j = 0; j < savedSchools.size();j++) {
		for(int i = 0; i < 3; i++) {
			System.out.println(savedSchools.get(j).get(i));
		}
		}
		
		System.out.println("-------------------");
		System.out.println("Step 12:/Add User");
		AccountUI.addUser("Diego", "A", "dalv1212", "3232", 'a');
		AccountUI.addUser("Jerome", "B", "jnew1212", "32321", 'a');
		AccountUI.addUser("Nick", "C", "npink1212", "32322", 'a');
		AccountUI.addUser("GiGi", "D", "gfit1212", "32323", 'a');
		AccountUI.addUser("Joe", "E", "jlaux1212", "32324", 'a');
		
		System.out.println("-------------------");
		System.out.println("Step 12:/Activate User");	
		AdminUI.activateUser("npink1212");
		
		
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
		AdminUI.deactivateUser("npink");
		
		System.out.println("-------------------");
		System.out.println("Step 15:/Activate User");	
		AdminUI.activateUser("npink1212");
		
		System.out.println("-------------------");
		System.out.println("Step 16: View list users (admin)");
		AdminUI.allUsers();

	
		
		
	}

}
