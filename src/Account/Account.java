package Account;
/**
 * 
 */

/**
 * This is a class for Accounts
 * 
 * @author jlipetzky001
 */
public class Account {
	private String password;
	private String userName;
	private String firstName; 
	private String lastName;
	private boolean userLogOn;
	private boolean adminLogOn;
	private char type;
	
	/**
	 * This method is the constructor for an Account
	 * 
	 * @param userName
	 * @param password
	 * @param firstName
	 * @param lastName
	 */
	public Account(String userName, String password, String firstName, String lastName,char type) {
		super();
		this.setFirstName(firstName); 
		this.setLastName(lastName); 
		this.password = password;
		this.userName = userName;
		this.userLogOn = true;
		this.type = type;
	}

	/**
	 * This method returns the password tied to an Account
	 * 
	 * @return password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * This method changes the password tied to an account
	 * 
	 * @param password
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * This method returns the user name tied to an Account
	 * 
	 * @return userName
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * This method changes the user name tied to an account
	 * 
	 * @param userName
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}

	/**
	 * This method checks if the user is logged on. If so, it returns true
	 * 
	 * @return userLogOn
	 */
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

		public boolean logOff(String account){
			return true;
		}
		
		public boolean logOn(String userName, String password) {
		
			return true;
		}
		
		public boolean isLoggedOn() {
		
			return true;
		}

		/**
		 * This method returns the first name tied to an account
		 * 
		 * @return firstName
		 */
		public String getFirstName() {
			return firstName;
		}

		/**
		 * This method changes the first name tied to an Account
		 * 
		 * @param firstName
		 */
		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}

		/**
		 * This method returns the last name tied to an Account
		 * 
		 * @return lastName
		 */
		public String getLastName() {
			return lastName;
		}

		/**
		 * This method changes the last name tied to an Account
		 * 
		 * @param lastName
		 */
		public void setLastName(String lastName) {
			this.lastName = lastName;
		}
		
		
		
		}
	

