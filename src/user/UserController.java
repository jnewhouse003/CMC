/**
 * 
 */
package user;

import java.util.ArrayList;

import Account.Account;
import Account.AccountController;
import Criteria.Criteria;
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
	searchController search;
	AccountController accountController;
	

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
		 * This method returns Universities if the user is logged on
		 * 
		 * @param user
		 * @param criteria
		 * @return ArrayList of Universities
		 */
		public ArrayList<University> searchSchool(String user, Criteria criteria) {
			ArrayList<University> schools = new ArrayList();
			if(this.dataBase.lookUpUser(user) == true) {
				
				if(this.accountController.getLoggedInUserStatus() == true) {
					schools = this.search.searchSchool(criteria);
					
					return schools;
				}
				else {
					return schools;
				}
			}
			else {
			
				return schools;
			}
			
			
		}
		
		/**
		 * gets saved schools for a user and returns them
		 * @param savedSchools 
		 */
		public String[] viewSavedSchool(String username) {
			return dataBase.getSavedSchool(username);
			
		
		}
		
		
		
		
		

		/**
		 * removes saved school for a user 
		 * @param school
		 * @return 
		 */
		public Boolean removeSavedSchool(User user, String name) {
			
			return user.removeSavedSchool(dataBase.getUniversity(name));
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
		
		public ArrayList<Account> allUsers(Account user){
			return null;
			
		}

		
		/**
		 * pre-condition: school can not be in savedSchool list already
		 * 
		 * @param user
		 * @param school
		 * @return
		 */
		public Boolean addSavedSchool(String user, String school) {
			// TODO Auto-generated method stub
			
			return dataBase.addSavedSchool(user,school);
		
			
		}
		
		/*
		 * creates dataBase and accountController
		 */

	public void createDataBase(DB.DBController dataBase, AccountController accountController) {
		// TODO Auto-generated method stub
		this.dataBase = dataBase;
		this.search = new searchController(dataBase);
		this.accountController = accountController;
	}


	/*
	 * gets user info
	 */
	
	public ArrayList<String> viewUserInfo(User user) {
		ArrayList<String> info = new ArrayList();
		
		info.add(user.getFirstName());
		info.add(user.getLastName());
		info.add(user.getUserName());
		info.add(user.getPassword());
		
		return info;
		
	}

	/*
	 * creates dataBase
	 */

	public void createDataBase(DBController dataBase2) {
		// TODO Auto-generated method stub
		this.dataBase = dataBase2;
		this.search = new searchController(dataBase2);
	}


}
