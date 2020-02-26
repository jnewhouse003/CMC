/**
 * 
 */
package Account;

/**
 * @author npink001
 *
 */
public class AccountController {

	public AccountController() {
		
		
	}
	
	public void logOn(String username, String password) {
		DB.DBController dbController = new DB.DBController();
		if (dbController.lookUpUser(username) == true)
		{
			Account hardCode = dbController.getAccount(username);
			if (hardCode.getPassword() == password)
			{
				System.out.println("Peter is logged in!");
			}
			else
			{
				System.out.println("Password invalid");
			}
			
			
		}
		else
		{
			System.out.println("User invalid");
		}
		
	}
	
	public void logOut() {
		
	}
	
	public String getPassword() {
		
		return null;
	}
	
	public void viewResults(String universityName) {
		
	}

}
