package DB;
import java.util.ArrayList;

import Account.Account;
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
	
	/*
	public Criteria findByCriteria(arrayList<> ) 
	{
		
	}
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
