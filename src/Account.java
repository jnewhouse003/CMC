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
	
	public Account(String password, String userName) {
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

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		public void logOff(){
		//TODO	
		}
		
		public boolean logOn(String userName, String password) {
		//TODO	
		}
		
		public boolean isLoggedOn() {
		//TODO	
		}
		
		
		
		}
	}

}
