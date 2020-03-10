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
	private String firstName; 
	private String lastName;
	private boolean userLogOn;
	private boolean adminLogOn;
	
	public Account(String userName, String password, String firstName, String lastName) {
		super();
		this.setFirstName(firstName); 
		this.setLastName(lastName); 
		this.password = password;
		this.userName = userName;
		this.userLogOn = true;
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
		 * @return the firstName
		 */
		public String getFirstName() {
			return firstName;
		}

		/**
		 * @param firstName the firstName to set
		 */
		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}

		/**
		 * @return the lastName
		 */
		public String getLastName() {
			return lastName;
		}

		/**
		 * @param lastName the lastName to set
		 */
		public void setLastName(String lastName) {
			this.lastName = lastName;
		}
		
		
		
		}
	

