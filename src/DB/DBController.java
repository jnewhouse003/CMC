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
		
		
		
		ArrayList<University> allSchools = new ArrayList();
		ArrayList<University> foundSchools = new ArrayList();
		
		for(int i = 0; i < allSchools.size(); i++) {
			if(allSchools.get(i).getState().equals(state)) {
				if(allSchools.get(i).getNumStudents() == numStudents) {
					foundSchools.add(allSchools.get(i));
					
				}
			}
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
