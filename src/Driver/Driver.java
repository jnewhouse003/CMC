/**
 * 
 */
package Driver;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Account.Account;
import Account.AccountUI;
import Admin.AdminUI;
import DB.DBController;
import search.searchController;
import university.University;
import user.User;
import user.UserUI;

/**
 * @author npink001
 *
 */
public class Driver implements AccountUI, UserUI, AdminUI
{

	private static String loginInfo, viewAndEditProfile, userSearchForSchools, userViewSearchResults, userFindTopFive, adminViewUniversities;
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		DBController dataBase = new DBController("goldencircle","csci230");
		UserUI.createController(dataBase);
		AccountUI.createController(dataBase);
		AdminUI.createController(dataBase);
		
		
		System.out.println("Step 1: logon");
		AccountUI.addUser("peter", "ohmann", "pohmann", "123", 'u');
		AccountUI.logOn("pohmann", "123");
		AccountUI.logOn("pohmann", "12");
		AccountUI.logOn("notPeter", "123");
		System.out.println("--------------------");
		
		Account peter = new Account("pohmann", "123", "peter", "ohmann", 'u');
		System.out.println("Step 2: viewAndEditProfile");
		UserUI.viewUserInfo(peter);
        UserUI.editUserInfo(peter, "1234", "Peter", "Ohmann");
        System.out.println("Updated User Info: ");
        UserUI.viewUserInfo(peter);
       
        System.out.println("--------------------");
        System.out.println("Step 3: Search for schools by a combination of state and number of students");
        User peterUser = new User("pohmann", "123", "Peter", "Ohmann", 'u');

        UserUI.searchSchool(peterUser, "FLORIDA", 10000);
        UserUI.searchSchool(peterUser, "Colorado", 4000);
        UserUI.searchSchool(peterUser, "California", 10000);
        UserUI.searchSchool(peterUser, "Texas",40000);
        UserUI.searchSchool(peterUser, "New York City", 8000);
        UserUI.searchSchool(peterUser, "Ohio", 15000);
        
        System.out.println("--------------------");
		System.out.println("Step 4: view results");
		University school1 = new University("Peter University", "Minnesota", "St.Joe", "Peter", 1, 0.0, 100.0, 10, 10000, 10.0, 9999.0, 1, 100.0, 100.0, 10, 10,10,"MATH");
		University school2 = new University("Golden Circle", "Minnesota", "St.Paul", "Golden Circle",1, 0.0, 100.0, 10, 10000, 10.0, 9999.0, 1, 100.0, 100.0, 10, 10,10,"MATH");
		ArrayList<University> results = new ArrayList<University>();
		results.add(school1);
		results.add(school2);
		UserUI.displayResults(results);
		
		
		System.out.println("--------------------");
		System.out.println("Step 5: browse School");
		AdminUI.browseSchool();
		
		
		System.out.println("--------------------");
		System.out.println("Step 6: find top 5");
		UserUI.findTopFive("ta", "CITY", 10000,0,"SCIENCE", "MATH");//.findTopFive("ta", "CITY", 10000,0,"SCIENCE", "MATH");
	    System.out.println("Top 5 is: ");
		UserUI.displayResults(UserUI.findTopFive("ta", "CITY", 10000,0,"SCIENCE", "MATH"));
		
		
		System.out.println("--------------------");
		System.out.println("Step 7: remove saved school");
		UserUI.removeSavedSchool(peterUser,"St.Johns");
		
		System.out.println("--------------------");
		System.out.println("Step 8: view specific school information");
		ArrayList<University> schools = new ArrayList();
		schools.add(AccountUI.viewResults("ARIZONA STATE"));
		UserUI.displayResults(schools);
		

		
		System.out.println("--------------------");
		System.out.println("Step 9: saved school");
		
		
		System.out.println("--------------------");
		System.out.println("Step 10: add saved school");
		UserUI.addSavedSchool("pohmann", "ARIZONA STATE");
		
		System.out.println("-------------------");
		System.out.println("Step 12: Logout");
		AccountUI.logOut("User is logged out");
		
		
		
		
	}

}
