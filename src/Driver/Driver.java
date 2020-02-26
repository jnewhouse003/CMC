/**
 * 
 */
package Driver;

import Account.Account;
import Account.AccountUI;
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
        
	}

}
