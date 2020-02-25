/**
 * 
 */
package user;

import java.util.ArrayList;

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
		public void editUserInfo(Object info) {
			this.setUserInfo(info); 
		}
		
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
	/**
	 * 
	 */


}
