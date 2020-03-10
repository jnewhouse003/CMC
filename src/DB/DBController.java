package DB;
import java.util.ArrayList;
import Account.Account;

import dblibrary.project.csci230.UniversityDBLibrary;

import Admin.AdminController;

import university.University;
import user.Criteria;
import user.User;


/**
 * This is the controller for the Database
 * 
 * @author jlaux001
 */
public class DBController 
{
	private UniversityDBLibrary dataBase;
	
	/**
	 * This is the constructor for the DBController
	 * 
	 * @param username
	 * @param password
	 */
	public DBController(String username, String password){
	   this.dataBase = new UniversityDBLibrary(username,password);
	  }
	  
	public void addSchool(String university) 
	{
		
	}
	
	/**
	 * This method adds a User to the DB
	 * 
	 * @param firstName
	 * @param lastName
	 * @param userName
	 * @param password
	 * @param type
	 * @return an integer to be used by the database
	 */
	public int addUser(String firstName, String lastName, String userName, String password, char type ) {
		
		return this.dataBase.user_addUser(firstName, lastName, userName, password, type);
	}
	
	
	public void editSchool()
	{
		
	}
	
	/**
	 * This method gets a University based on its String name
	 * 
	 * @param university
	 * @return University temp
	 */
	public University getUniversity(String university) 
	{
		String[][] allSchools;
		allSchools = this.dataBase.university_getUniversities();
		for(int i = 0; i < allSchools.length; i++) {
			if(allSchools[i][0] == university) {
				University temp = new University(allSchools[i]);
				return temp;
			}
		}
	}
	
	
	/**
	 * This method gets an Account based on its String name
	 * 
	 * @param account
	 * @return Account temp
	 */
	public Account getAccount(String account) 
	{
		String[][] allUsers = this.dataBase.user_getUsers();
		for(int i = 0; i < allUsers.length; i++)
		{
			if(allUsers[i][2] == account) {
				Account temp = new Account(allUsers[i][0], allUsers[i][1], allUsers[i][2], allUsers[i][3], allUsers[i][4].charAt(0));
				return temp;
				
			}
		}
		return null;
	}
	
	/**
	 * This method checks if a User exists
	 * 
	 * @param user
	 * @return false is User DNE; true if User exists
	 */
	public boolean lookUpUser(String user) 
	{
		String[][] allUsers = this.dataBase.user_getUsers();
			for(int i = 0; i < allUsers.length; i++)
			{
				if (allUsers[i][2] == user) 
				{
					return true;
				}
				else 
				{
					return false;
				}
			}
			return false;
	
	}

	/**
	 * This method returns a list of all Universities
	 * 
	 * @return schools
	 */
	public ArrayList<University> findallUniversity()
	{
		
		String[][] allSchools = this.dataBase.university_getUniversities();
		ArrayList<University> schools = new ArrayList();
		for(int i = 0; i < allSchools.length; i++) {
			University temp = new University(allSchools[i]);
			schools.add(temp);
		}
		
		return schools;
	}
	
	/**
	 * This method searches the Universities based on given criteria
	 * 
	 * @param state
	 * @param numStudents
	 * @return foundSchools
	 */
	public ArrayList<University> findByCriteria(String state, int numStudents) 
	{
		String[][] allSchools;

		ArrayList<University> foundSchools = new ArrayList();
		
		allSchools = this.dataBase.university_getUniversities();
		

		for(int i = 0; i < allSchools.length; i++) {
			if(allSchools[i][1] == state && Integer.valueOf(allSchools[i][4]) == numStudents) 
			{
					University tempUniversity = new University(allSchools[i]);
					foundSchools.add(tempUniversity);
					
			}
		}
		
		return foundSchools;
		
	}

	/**
	 * This method returns the top 5 schools based on given criteria
	 * 
	 * @param state
	 * @param control
	 * @param lowerExpense
	 * @param upperExpense
	 * @param emphasesOne
	 * @param emphasesTwo
	 * @return foundSchools
	 */
	public ArrayList<University> findTopFive(String state, String control, int lowerExpense, int upperExpense,
			String emphasesOne, String emphasesTwo) {
		// TODO Auto-generated method stub
		
		
		String[][] allSchools;
		ArrayList<University> foundSchools = new ArrayList();
		ArrayList<University> schools = new ArrayList();
		
		
		allSchools = this.dataBase.university_getUniversities();

		

		
		ArrayList<Integer> difference = new ArrayList<Integer>();
		
		for(int i = 0; i < allSchools.length; i++) {
			University tempSchool = new University(allSchools[i]);
			schools.add(tempSchool);
		}
		
		
		for(int i = 0; i < allSchools.length; i++) {
			int temp = 0; 
			University tempUniversity = new University(allSchools[i]);
			if(tempUniversity.getState().contains(state)) {
				temp += 1;
			}
			if(tempUniversity.getControl().contains(control)) {
					temp += 1;
				}
			if(tempUniversity.getExpenses() > lowerExpense) {
				if(upperExpense != 0) {
					if(tempUniversity.getExpenses() < upperExpense) {
						temp += 1;	
					}
				}
			}
			if(tempUniversity.getEmphases().equals(emphasesOne) || tempUniversity.getEmphases().equals(emphasesTwo)) {
				temp += 1;
			}
			difference.add(temp);
		}
		
		
		
		for (int i = 0; i < 5; i++) {
			int index = 0;
			for(int j = 0; j < difference.size(); j++ ) {
				if(difference.get(j) > difference.get(index)){
					index = j;
				}
				
			}
			
			foundSchools.add(schools.get(index));
			schools.remove(index);
			difference.remove(index);
			
			
		}

					
		return foundSchools;
		
	}


	
	/*
	
	public void persist(user) 
	{
		
	}
	public void presist(admin) 
	{
		
	}
	public void persist(univeristy) 
	{
	
	}
	public ArrayList<University> findallUniversity()
	{
		
	}
	public void displaySchool(University) 

		
	}
	public ArrayList<University> getSavedSchools() 
	{
		
	}
	*/
}
