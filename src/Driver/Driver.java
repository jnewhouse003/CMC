/**
 * 
 */
package Driver;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Account.Account;
import Account.AccountUI;
import search.searchController;
import university.University;
import user.UserUI;

/**
 * @author npink001
 *
 */
public class Driver implements AccountUI, UserUI
{

	private static String loginInfo, viewAndEditProfile, userSearchForSchools, userViewSearchResults, userFindTopFive, adminViewUniversities;
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Step 1: logon");
		AccountUI.logOn("pohmann", "123");
		AccountUI.logOn("pohmann", "12");
		AccountUI.logOn("notPeter", "123");
		System.out.println("--------------------");
		
		Account peter = new Account("pohmann", "123", "peter", "ohmann");
		System.out.println("Step 2: viewAndEditProfile");
		UserUI.viewUserInfo(peter);
        UserUI.editUserInfo(peter, "1234", "Peter", "Ohmann");
        System.out.println("Updated User Info: ");
        UserUI.viewUserInfo(peter);
       
        System.out.println("--------------------");
        System.out.println("Step 3: Search for schools by a combination of state and number of students");
        searchController.searchSchool("Minnesota", "Students: 20,000");
        searchController.searchSchool("Minnesota", "Students: 4,000");
        searchController.searchSchool("California", "Students: 30,000");
        //Scanner scan = new Scanner(System.in);
        //String s = scan.next();
        //String i = scan.nextLine();
        
        
        
      
        
        
        
        
      
        
        System.out.println("--------------------");
		System.out.println("Step 4: view results");
		University school1 = new University("Peter University", "Minnesota", "St.Joe", "Peter", 1, 0, 100, 10, 10000, 10, 9999, 1, 100, 100, 10, 10,10,10);
		University school2 = new University("Golden Circle", "Minnesota", "St.Paul", "Golden Circle", 6, 1/6, 5/6, 100, 100, 0, 0, 10000, 6/10000, 100, 10, 10,10,10);
		ArrayList<University> results = new ArrayList<University>();
		results.add(school1);
		results.add(school2);
		UserUI.displayResults(results);
		
	}

}
