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
		public String[] viewSavedSchool(String username) {
			return dataBase.getSavedSchool(username);
			
		
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
		 * @return 
		 */
		public Boolean removeSavedSchool(User peterUser, String name) {
			
			return peterUser.removeSavedSchool(dataBase.getUniversity(name));
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
		 * pre-condition: school can not be in savedSchool list already
		 * 
		 * @param user
		 * @param school
		 * @return
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
