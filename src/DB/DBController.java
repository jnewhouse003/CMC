package DB;
import java.util.ArrayList;
import Account.Account;
import Criteria.Criteria;
import dblibrary.project.csci230.UniversityDBLibrary;

import university.University;


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
	  
	public void addSchool(University university) 
	{
		this.dataBase.university_addUniversity(university.getName(),university.getState(), university.getLocation(),university.getControl(), university.getNumStudents(),university.getPercentFemale(), university.getVerbalSAT(), university.getMathSAT(), university.getExpenses(), university.getFinancialAid(), university.getNumApplications(), university.getPercentAdmitted(), university.getPercentEnrolled(), university.getAcademicsScale(), university.getSocialScale(), university.getLifeQualityScale());
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
	
	
	public void addSavedSchool(String user, String university) {
		
		this.dataBase.user_saveSchool(user, university);
	}
	
	
	
	
	public void editUser(String firstName, String lastName, String userName, String password, char type, char status){
		
		
		this.dataBase.user_editUser(userName, firstName, lastName, password, type, status);
	}
	
	
	public String[] getSavedSchool(String username) {
		String[][] users;
		users = this.dataBase.user_getUsernamesWithSavedSchools();
		for(int i = 0; i< users.length; i++) {
			if(users[i][0].equals(username)) {
				return users[i];
			}
		}
		String[] empty = null;
		return empty;
		
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
			if(allSchools[i][0].equals(university)) {
				University temp = new University(allSchools[i]);
				return temp;
			}
		}
		return null;
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
		Account temp;
		for(int i = 0; i < allUsers.length; i++)
		{
			if(allUsers[i][2].equals(account)) {
				temp = new Account(allUsers[i][0], allUsers[i][1], allUsers[i][2], allUsers[i][3], allUsers[i][4].charAt(0));
				return temp;
				
			}
		}
		temp = new Account("", "", "", "", ' '); 
		return temp;
		
	}
	
	/**
	 * This method checks if a User exists
	 * 
	 * @param user
	 * @return false is User DNE; true if User exists
	 */
	
	public boolean lookUpUser(String user){
		String[][] allUsers;
		allUsers = this.dataBase.user_getUsers();
		for(int i = 0; i < allUsers.length; i++) 
		{
			if (allUsers[i][2].equals(user)) 
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
	 * this method returns a list of all users
	 * 
	 * @return users
	 */
	public ArrayList<Account> findallUsers(){
		String[][] allUsers = this.dataBase.user_getUsers();
		ArrayList<Account> users = new ArrayList();
		for(int i = 0; i < allUsers.length; i++)
		{
			Account temp = new Account(allUsers[i][0], allUsers[i][1], allUsers[i][2], allUsers[i][3], allUsers[i][4].charAt(0));
			users.add(temp);
				
			}
		return users;
		}

	
	/**
	 * This method searches the Universities based on given criteria
	 * 
	 * @param state
	 * @param numStudents
	 * @return foundSchools
	 */
	public ArrayList<University> findByCriteria(Criteria parameters) 
	{
		String[][] allSchools;

		ArrayList<University> foundSchools = new ArrayList();
		
		
		
		allSchools = this.dataBase.university_getUniversities();
		

		for(int i = 0; i < allSchools.length; i++) {
			University temp = new University(allSchools[i]);
			
			if(temp.getState().equals(parameters.getState()) || parameters.getState().equals("")) {
				if(temp.getName().equals(parameters.getName()) || parameters.getName().equals("")) {
					if(temp.getLocation().equals(parameters.getLocation()) || parameters.getLocation().equals("")) {
						if(temp.getControl().equals(parameters.getControl()) || parameters.getControl().equals("")) {
							if(temp.getNumStudents() < parameters.getNumStudentMax() && temp.getNumStudents() > parameters.getNumStudentMin() || parameters.getNumApplicantsMax() == 0){
								if(temp.getPercentFemale() > parameters.getPercentFemaleMin() && temp.getPercentFemale() < parameters.getPercentFemaleMax() || parameters.getPercentFemaleMax() == 0) {
									if(temp.getPercentMale() > parameters.getPercentMaleMin() && temp.getPercentMale() < parameters.getPercentMaleMax() || parameters.getPercentMaleMax() == 0) {
										if(temp.getVerbalSAT() > parameters.getVerbalSATMin() && temp.getVerbalSAT() < parameters.getVerbalSATMax() || parameters.getVerbalSATMax() == 0) {
											if(temp.getMathSAT() > parameters.getMathSATMin() && temp.getMathSAT() < parameters.getMathSATMax() || parameters.getMathSATMax() == 0) {
												if(temp.getExpenses() > parameters.getExpensesMin() && temp.getExpenses() < parameters.getExpensesMax() || parameters.getExpensesMax() == 0) {
													if(temp.getFinancialAid() > parameters.getFinancialAidMin() && temp.getFinancialAid() < parameters.getFinancialAidMax() || parameters.getFinancialAidMax() == 0) {
														if(temp.getNumApplications() > parameters.getNumApplicantsMin() && temp.getNumApplications() < parameters.getNumApplicantsMax() || parameters.getNumApplicantsMax() == 0) {
															if(temp.getPercentAdmitted() > parameters.getPercentAdmittedMin() && temp.getPercentAdmitted() < parameters.getPercentAdmittedMax() || parameters.getPercentAdmittedMax() == 0) {
																if(temp.getPercentEnrolled() > parameters.getPercentEnrolledMin() && temp.getPercentEnrolled() < parameters.getPercentEnrolledMax() || parameters.getPercentEnrolledMax() == 0) {
																	if(temp.getAcademicsScale() > parameters.getAcademicsScaleMin() && temp.getAcademicsScale() < parameters.getAcademicScaleMax()) {
																		if(temp.getSocialScale() > parameters.getSocialScaleMin() && temp.getSocialScale() < parameters.getSocialScaleMax()) {
																			if(temp.getLifeQualityScale() > parameters.getLifeQualityScaleMin() && temp.getLifeQualityScale() < parameters.getLifeQualityScaleMax()) {
																				for(int j = 0; j < parameters.getEmphases().size();j++) {
																					if(temp.getEmphases().equals(parameters.getEmphases().get(j))) {
																						foundSchools.add(temp);
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
										}
									}	
								}
							}
						}
					}		
				}
					
									
					
					
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
	
	public int removeUser(String userName) {
		return this.dataBase.user_deleteUser(userName);
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
