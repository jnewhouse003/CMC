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
 * This is the Controller class for Users
 * 
 * @author giteghete001
 */
public class UserController {
	private Object savedSchools;
	DBController dataBase;
	searchController search = new searchController();
	

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
		public void removeSavedSchool(User user, String name) {
			
			user.removeSavedSchool(dataBase.getUniversity(name));
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
		 * This method returns Universities if the user is logged on
		 * 
		 * @param user
		 * @param state
		 * @param numStudents
		 * @return ArrayList of Universities
		 */
		public ArrayList<University> searchSchool(User user, String state, int numStudents){
			if(user.isLoggedOn()) {
				
				return search.searchSchool(state, numStudents);
				
			}
			return null;
			
			
		}
		
		/**
		 * This method returns a list of the top 5 schools based on given criteria
		 * 
		 * @param state
		 * @param control
		 * @param lowerExpense
		 * @param upperExpense
		 * @param emphasesOne
		 * @param emphasesTwo
		 * @return a list of the top five shools
		 */
		public ArrayList<University> findTopFive(String state, String control, int lowerExpense, int upperExpense,String emphasesOne, String emphasesTwo){
		
			
			return dataBase.findTopFive(state,control,lowerExpense,upperExpense,emphasesOne, emphasesTwo);
			
			
		}
	/**
	 * @param school2 
	 * 
	 */

		public void addSavedSchool(String user, String school) {
			// TODO Auto-generated method stub
			
			dataBase.addSavedSchool(user,school);
			
		}

	public void createDataBase(DB.DBController dataBase) {
		// TODO Auto-generated method stub
		this.dataBase = dataBase;
		
	}


}
