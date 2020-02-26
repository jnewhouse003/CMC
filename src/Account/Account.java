package Account;
/**
 * 
 */

/**
 * @author jlipetzky001
 *
 */
public class Account {
	private String password;
	private String userName;
	private boolean userLogOn;
	private boolean adminLogOn;
	
	public Account(String userName, String password) {
		super();
		this.password = password;
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public boolean isUserLogOn() {
		return userLogOn;
	}

	public void setUserLogOn(boolean userLogOn) {
		this.userLogOn = userLogOn;
	}

	public boolean isAdminLogOn() {
		return adminLogOn;
	}

	public void setAdminLogOn(boolean adminLogOn) {
		this.adminLogOn = adminLogOn;
	}

		public void logOff(){
		//TODO	
		}
		
		public boolean logOn(String userName, String password) {
		
			return true;
		}
		
		public boolean isLoggedOn() {
		
			return true;
		}
		
		
		
		}
	

