/**
 * 
 */
package Driver;

import Account.AccountUI;

/**
 * @author npink001
 *
 */
public class Driver implements AccountUI
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
	}

}
