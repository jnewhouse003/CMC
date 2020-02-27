package DB;
import java.util.ArrayList;

import Account.Account;
import university.University;
import user.Criteria;

/**
 * @author jlaux001
 * @param <account>
 * @param <criteria>
 *
 */
public class DBController 
{
	public void addSchool(String university) 
	{
		
	}
	public void editSchool()
	{
		
	}
	public void getUniversity(String university) 
	{
		
	}
	public Account getAccount(String account) 
	{
		Account peter = new Account("pohmann", "123", "peter", "ohmann"); 
		return peter;
	}
	public boolean lookUpUser(String user) 
	{
		if (user == "pohmann") 
		{
			return true;
		}
		else 
		{
			return false;
		}
	
	}
	public ArrayList<University> findallUniversity()
	{
		return null;
		
	}
	public ArrayList<University> findByCriteria(String state, int numStudents) 
	{
		
		private University School1 ("School 4", "New York", "", "", 70, 56.0,44.1, 3240, 2331, 78.5, 23.1, 1230, 45.5, 80.0, 30, 40, 50,"");
		private University School2 ("School 2", "Minnesota", "", "", 60, 36.0,45.1, 5200, 7321, 71.5, 25.1, 1430, 95.5, 60.0, 20, 60, 40,"");
		private University School3 ("School 3", "Arkansas", "", "", 80, 76.0,34.1, 3240, 3918, 78.5, 23.1, 1230, 45.5, 80.0, 50, 40, 30,"");
		private University School4 ("School 4", "Kansas", "", "", 40, 36.0,84.1, 3260, 9031, 78.5, 23.1, 1230, 45.5, 70.0, 90, 20, 20,"");
		private University School5 ("School 5", "Maine", "", "", 30, 66.0,54.1, 1840, 1671, 78.5, 23.1, 1230, 45.5, 60.0, 40, 50, 10,"");
		private University School6 ("School 6", "Texas", "", "", 50, 86.0,24.1, 1540, 2451, 78.5, 23.1, 1230, 45.5, 50.0, 10, 70, 60,"");
		
		
		
	
	
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
