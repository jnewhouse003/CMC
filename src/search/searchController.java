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
	
	DBController dataBase;
	
	public searchController(DBController controller) {
		this.dataBase = controller;
	}
	

	/**
	 * This method returns a list of Universities
	 * 
	 * @param state
	 * @param numStudents
	 * @return ArrayList of Universities
	 */
	public ArrayList<University> searchSchool(Criteria criteria) {
		
		return dataBase.findByCriteria(criteria);
		
	}
	
	
	public void viewResults() {
		System.out.println();
	}
	
	
	
	
	}