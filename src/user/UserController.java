/**
 * 
 */
package user;

import java.util.ArrayList;

import Account.Account;
import DB.DBController;
import search.searchController;
import university.University;

/**
 * @author giteghete001
 *
 */
public class UserController {
	private Object savedSchools;
	private Object DBController;
	

	//private DBContoller dbController; 
		/**
		 * 
		 */
		public UserController() {
			// TODO Auto-generated constructor stub
		}

		/**
		 * pre-condition: school can not be in savedSchool list already
		 * 
		 * @param univ
		 * @return
		 */
		public void addSavedSchools(University univ) {
			if(univ.length() != 0) {
			for(University univ1 : savedSchools){
		
			ArrayList<University> savedSchools = new ArrayList<University>();
			this.savedSchools.add(((Object) this.DBController).getUniversity(univ1)); 
			}
			}
			else
			{
				System.out.print("Error, the university you are trying to add is already your saved schools list. Try entering another school. ");
			}
			}
		/**
		 * 
		 * @param university
		 * @return 
		 */
		public String findUniversity(String university) {
			return null; 
		}
		
		/**
		 * 
		 * @param University
		 * @return
		 */
		public University searchSchool(Criteria criteria) {
			return this.searchSchool(criteria);
		}
		
		/**
		 * 
		 * @param savedSchools 
		 */
		public void viewSavedSchool() {
			System.out.println(savedSchools); 
		
		}
		
		/**
		 * @param info 
		 * 
		 */
	
		
		/**public void viewUserInfo(Account user) {
			System.out.println("User: " + user.getUserName()); 
			
			System.out.println("Password: " + user.getPassword()); 
		}
		*/
		
		private void setUserInfo(Object info) {
			// TODO Auto-generated method stub
			
		}

		/**
		 * 
		 * @param school
		 */
		public void removeSavedSchool(University school) {
			this.addSavedSchools.remove(String school);
		}
		
		/**
		 * 
		 */
		public void logOut() {
			Object user;
			if(((Object) user).isLoggedOn() == false) {
			System.out.println("User is now logged out"); 
			}
			
		}
		
		/**
		 * 
		 * @param info
		 */
		public void manageProfile(String info) {
			//Method implementation 
		}
		
		public ArrayList<University> searchSchool(User user, String state, int numStudents){
			if(user.isLoggedOn()) {
				searchController search = new searchController();
				return search.searchSchool(state, numStudents);
				
			}
			
			
		}
	/**
	 * 
	 */


}
