package search;

import java.util.ArrayList;

import Criteria.Criteria;
import DB.DBController;
import university.University;

/**
 * This is the controller for searches
 * 
 * @author giteghete001
 */
public class searchController{
	

	/**
	 * This method returns a list of Universities
	 * 
	 * @param state
	 * @param numStudents
	 * @return ArrayList of Universities
	 */
	public ArrayList<University> searchSchool(String state, int numStudents) {
		DBController DataBase = new DBController("goldencircle","csci230");
		return DataBase.findByCriteria(state, numStudents);
		
	}
	
	
	public void viewResults() {
		System.out.println();
	}
	
	public Criteria findByCriteria() {
		return null; 
	}
	}