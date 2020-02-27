package search;

import java.util.ArrayList;

import DB.DBController;
import user.Criteria;
import university.University;

/**
 * @author giteghete001
 * @param <Criteria>
 *
 */
public class searchController{
	

	public ArrayList<University> searchSchool(String state, int numStudents) {
		DBController DataBase = new DBController();
		return DataBase.findByCriteria(state, numStudents);
		
	}
	
	
	
	public void viewResults() {
		System.out.println();
	}
	
	public Criteria findByCriteria() {
		return null; 
	}
	}