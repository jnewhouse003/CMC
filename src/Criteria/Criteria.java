/**
 * 
 */
package Criteria;

import java.util.ArrayList;

/**
 * @author giteghete001
 *
 */
public class Criteria {

	private String name;
	private String state; 
	private String location; 
	private String control; 
	private int numStudentMin; 
	private int numStudentMax; 
	private double percentFemaleMin; 
	private double percentFemaleMax; 
	private double percentMaleMin; 
	private double percentMaleMax; 
	private int verbalSATMin; 
	private int verbalSATMax; 
	private int mathSATMin; 
	private int mathSATMax; 
	private double expensesMin; 
	private double expensesMax; 
	private double financialAidMin; 
	private double financialAidMax; 
	private int numApplicantsMin; 
	private int numApplicantsMax; 
	private double percentAdmittedMin;
	private double percentAdmittedMax; 
	private double percentEnrolledMin; 
	private double percentEnrolledMax; 
	private int academicsScaleMin; 
	private int academicScaleMax; 
	private int socialScaleMin; 
	private int socialScaleMax; 
	private int lifeQualityScaleMin; 
	private int lifeQualityScaleMax;
	private ArrayList<String> emphases;  
	
	
	/**
	 * This method is a constructor for a criteria
	 * @param state
	 * @param location
	 * @param control
	 * @param numStudentMin
	 * @param numStudentMax
	 * @param percentFemaleMin
	 * @param percentFemaleMax
	 * @param percentMaleMin
	 * @param percentMaleMax
	 * @param verbalSATMin
	 * @param verbalSATMax
	 * @param mathSATMin
	 * @param mathSATMax
	 * @param expensesMin
	 * @param expensesMax
	 * @param financialAidMin
	 * @param financialAidMax
	 * @param numApplicantsMin
	 * @param numApplicantsMax
	 * @param percentAdmittedMin
	 * @param percentAdmittedMax
	 * @param percentEnrolledMin
	 * @param percentEnrolledMax
	 * @param academicsScaleMin
	 * @param academicScaleMax
	 * @param socialScaleMin
	 * @param socialScaleMax
	 * @param lifeQualityScaleMin
	 * @param lifeQualityScaleMax
	 * @param emphases
	 * @param name
	 */
	public Criteria(String name, String state, String location, String control, int numStudentMin, int numStudentMax,
			double percentFemaleMin, double percentFemaleMax, double percentMaleMin, double percentMaleMax,
			int verbalSATMin, int verbalSATMax, int mathSATMin, int mathSATMax, double expensesMin, double expensesMax,
			double financialAidMin, double financialAidMax, int numApplicantsMin, int numApplicantsMax,
			double percentAdmittedMin, double percentAdmittedMax, double percentEnrolledMin, double percentEnrolledMax,
			int academicsScaleMin, int academicScaleMax, int socialScaleMin, int socialScaleMax,
			int lifeQualityScaleMin, int lifeQualityScaleMax, ArrayList<String> emphases) {
		this.state = state;
		this.location = location;
		this.control = control;
		this.numStudentMin = numStudentMin;
		this.numStudentMax = numStudentMax;
		this.percentFemaleMin = percentFemaleMin;
		this.percentFemaleMax = percentFemaleMax;
		this.percentMaleMin = percentMaleMin;
		this.percentMaleMax = percentMaleMax;
		this.verbalSATMin = verbalSATMin;
		this.verbalSATMax = verbalSATMax;
		this.mathSATMin = mathSATMin;
		this.mathSATMax = mathSATMax;
		this.expensesMin = expensesMin;
		this.expensesMax = expensesMax;
		this.financialAidMin = financialAidMin;
		this.financialAidMax = financialAidMax;
		this.numApplicantsMin = numApplicantsMin;
		this.numApplicantsMax = numApplicantsMax;
		this.percentAdmittedMin = percentAdmittedMin;
		this.percentAdmittedMax = percentAdmittedMax;
		this.percentEnrolledMin = percentEnrolledMin;
		this.percentEnrolledMax = percentEnrolledMax;
		this.academicsScaleMin = academicsScaleMin;
		this.academicScaleMax = academicScaleMax;
		this.socialScaleMin = socialScaleMin;
		this.socialScaleMax = socialScaleMax;
		this.lifeQualityScaleMin = lifeQualityScaleMin;
		this.lifeQualityScaleMax = lifeQualityScaleMax;
		this.emphases = emphases;
		this.name = name;
	}

	
	/**
	 * This method gets the name of the criteria  
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * This method sets the Name  
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * This method gets the state to include in criteria
	 * @return the state
	 */
	public String getState() {
		return state;
	}
	/**
	 * This method can change the state in said Criteria
	 * @param state the state to set
	 */
	public void setState(String state) {
		this.state = state;
	}
	/**
	 * This method gets the location of criteria  
	 * @return the location
	 */
	public String getLocation() {
		return location;
	}
	/**
	 * This method changes the location while the criteria is being made  
	 * @param location the location to set
	 */
	public void setLocation(String location) {
		this.location = location;
	}
	/**
	 * This method gets the control of the criteria
	 * @return the control
	 */
	public String getControl() {
		return control;
	}
	/**
	 * This method sets the control of the criteria 
	 * @param control the control to set
	 */
	public void setControl(String control) {
		this.control = control;
	}
	/**
	 * This method gets the minimum number of students in criteria  
	 * @return the numStudentMin
	 */
	public int getNumStudentMin() {
		return numStudentMin;
	}
	/**
	 * This method changes the minimum number of students in criteria  
	 * @param numStudentMin the numStudentMin to set
	 */
	public void setNumStudentMin(int numStudentMin) {
		this.numStudentMin = numStudentMin;
	}
	/**
	 *  This method gets the maximum number of students in criteria
	 * @return the numStudentMax
	 */
	public int getNumStudentMax() {
		return numStudentMax;
	}
	/**
	 * This method changes the maximum number of students in criteria 
	 * @param numStudentMax the numStudentMax to set
	 */
	public void setNumStudentMax(int numStudentMax) {
		this.numStudentMax = numStudentMax;
	}
	/**
	 * This method gets the percent of minimum female students based on criteria 
	 * @return the percentFemaleMin
	 */
	public double getPercentFemaleMin() {
		return percentFemaleMin;
	}
	/**
	 * This method sets the percent of minimum female students based on criteria 
	 * @param percentFemaleMin the percentFemaleMin to set
	 */
	public void setPercentFemaleMin(double percentFemaleMin) {
		this.percentFemaleMin = percentFemaleMin;
	}
	/**
	 * This method gets the percent of maximum female students based on criteria 
	 * @return the percentFemaleMax
	 */
	public double getPercentFemaleMax() {
		return percentFemaleMax;
	}
	/**
	 * This method gets the percent of maximum female students based on criteria 
	 * @param percentFemaleMax the percentFemaleMax to set
	 */
	public void setPercentFemaleMax(double percentFemaleMax) {
		this.percentFemaleMax = percentFemaleMax;
	}
	/**
	 * This method gets the percent of minimum male students based on criteria 
	 * @return the percentMaleMin
	 */
	public double getPercentMaleMin() {
		return percentMaleMin;
	}
	/**
	 * This method gets the percent of minimum male students based on criteria 
	 * @param percentMaleMin the percentMaleMin to set
	 */
	public void setPercentMaleMin(double percentMaleMin) {
		this.percentMaleMin = percentMaleMin;
	}
	/**
	 * This method gets the percent of maximum students based on criteria 
	 * @return the percentMaleMax
	 */
	public double getPercentMaleMax() {
		return percentMaleMax;
	}
	/**
	 * This method gets the percent of maximum students based on criteria 
	 * @param percentMaleMax the percentMaleMax to set
	 */
	public void setPercentMaleMax(double percentMaleMax) {
		this.percentMaleMax = percentMaleMax;
	}
	/**
	 * This method gets the verbal SAT min of the students
	 * @return the verbalSATMin
	 */
	public int getVerbalSATMin() {
		return verbalSATMin;
	}
	/**
	 * This method sets the verbal SAT min of the students  
	 * @param verbalSATMin the verbalSATMin to set
	 */
	public void setVerbalSATMin(int verbalSATMin) {
		this.verbalSATMin = verbalSATMin;
	}
	/**
	 * This method gets the verbal SAT max of the students 
	 * @return the verbalSATMax
	 */
	public int getVerbalSATMax() {
		return verbalSATMax;
	}
	/**
	 * This method sets the verbal SAT max of the students 
	 * @param verbalSATMax the verbalSATMax to set
	 */
	public void setVerbalSATMax(int verbalSATMax) {
		this.verbalSATMax = verbalSATMax;
	}
	/**
	 * This method gets the math SAT min of the students 
	 * @return the mathSATMin
	 */
	public int getMathSATMin() {
		return mathSATMin;
	}
	/**
	 * This method sets the math SAT min of the students 
	 * @param mathSATMin the mathSATMin to set
	 */
	public void setMathSATMin(int mathSATMin) {
		this.mathSATMin = mathSATMin;
	}
	/**
	 * This method gets the math SAT max of the students  
	 * @return the mathSATMax
	 */
	public int getMathSATMax() {
		return mathSATMax;
	}
	/**
	 * This method sets the math SAT max of the students 
	 * @param mathSATMax the mathSATMax to set
	 */
	public void setMathSATMax(int mathSATMax) {
		this.mathSATMax = mathSATMax;
	}
	/**
	 * This method gets the minimum amount of expenses 
     * expenses  
	 * @return the expensesMin
	 */
	public double getExpensesMin() {
		return expensesMin;
	}
	/**
	 * This method sets the minimum amount of expenses 
	 * @param expensesMin the expensesMin to set
	 */
	public void setExpensesMin(double expensesMin) {
		this.expensesMin = expensesMin;
	}
	/**
	 * This method gets the maximum amount of expenses 
 expenses  
	 * @return the expensesMax
	 */
	public double getExpensesMax() {
		return expensesMax;
	}
	/**
	 * This method sets the maximum amount of expenses 
	 * @param expensesMax the expensesMax to set
	 */
	public void setExpensesMax(double expensesMax) {
		this.expensesMax = expensesMax;
	}
	/**This method changes minimum financialAid amount
	 * @return the financialAidMin
	 */
	public double getFinancialAidMin() {
		return financialAidMin;
	}
	/**
	 * This method changes minimum financialAid amount 
	 * @param financialAidMin the financialAidMin to set
	 */
	public void setFinancialAidMin(double financialAidMin) {
		this.financialAidMin = financialAidMin;
	}
	/**
	 * This method returns maximum financialAid amount 
	 * @return the financialAidMax
	 */
	public double getFinancialAidMax() {
		return financialAidMax;
	}
	/**
	 * This method returns maximum financialAid amount  
	 * @param financialAidMax the financialAidMax to set
	 */
	public void setFinancialAidMax(double financialAidMax) {
		this.financialAidMax = financialAidMax;
	}
	/**
	 * This method gets the number of minimum Applicants
	 * @return the numApplicantsMin
	 */
	public int getNumApplicantsMin() {
		return numApplicantsMin;
	}
	/**
	 * This method sets the number of minimum Applicants 
	 * @param numApplicantsMin the numApplicantsMin to set
	 */
	public void setNumApplicantsMin(int numApplicantsMin) {
		this.numApplicantsMin = numApplicantsMin;
	}
	/**
	 * This method gets the number of maximum Applicants 
	 * @return the numApplicantsMax
	 */
	public int getNumApplicantsMax() {
		return numApplicantsMax;
	}
	/**
	 * This method sets the number of maximum Applicants 
	 * @param numApplicantsMax the numApplicantsMax to set
	 */
	public void setNumApplicantsMax(int numApplicantsMax) {
		this.numApplicantsMax = numApplicantsMax;
	}
	/**
	 * This method gets the percent of minimum admitted students in criteria  
	 * @return the percentAdmittedMin
	 */
	public double getPercentAdmittedMin() {
		return percentAdmittedMin;
	}
	/**
	 * This method sets the percent of minimum admitted students in criteria 
	 * @param percentAdmittedMin the percentAdmittedMin to set
	 */
	public void setPercentAdmittedMin(double percentAdmittedMin) {
		this.percentAdmittedMin = percentAdmittedMin;
	}
	/**
	 * This method gets the percent of maximum admitted students in criteria 
	 * @return the percentAdmittedMax
	 */
	public double getPercentAdmittedMax() {
		return percentAdmittedMax;
	}
	/**
	 * This method sets the percent of maximum admitted students in criteria 
	 * @param percentAdmittedMax the percentAdmittedMax to set
	 */
	public void setPercentAdmittedMax(double percentAdmittedMax) {
		this.percentAdmittedMax = percentAdmittedMax;
	}
	/**
	 * This method gets the percent of minimum enrolled students  
	 * @return the percentEnrolledMin
	 */
	public double getPercentEnrolledMin() {
		return percentEnrolledMin;
	}
	/**
	 * This method sets the percent of minimum enrolled students  
	 * @param percentEnrolledMin the percentEnrolledMin to set
	 */
	public void setPercentEnrolledMin(double percentEnrolledMin) {
		this.percentEnrolledMin = percentEnrolledMin;
	}
	/**
	 * This method gets the percent of maximum students in criteria 
	 * @return the percentEnrolledMax
	 */
	public double getPercentEnrolledMax() {
		return percentEnrolledMax;
	}
	/**
	 * This method gets the percent of maximum students in criteria 
	 * @param percentEnrolledMax the percentEnrolledMax to set
	 */
	public void setPercentEnrolledMax(double percentEnrolledMax) {
		this.percentEnrolledMax = percentEnrolledMax;
	}
	/**
	 * This method gets the minimum academic scale
	 * @return the academicsScaleMin
	 */
	public int getAcademicsScaleMin() {
		return academicsScaleMin;
	}
	/**
	 * This method sets the minimum academic scale  
	 * @param academicsScaleMin the academicsScaleMin to set
	 */
	public void setAcademicsScaleMin(int academicsScaleMin) {
		this.academicsScaleMin = academicsScaleMin;
	}
	/**
	 * This method gets the maximum academic scale 
	 * @return the academicScaleMax
	 */
	public int getAcademicScaleMax() {
		return academicScaleMax;
	}
	/**
	 *  This method sets the maximum academic scale 
	 * @param academicScaleMax the academicScaleMax to set
	 */
	public void setAcademicScaleMax(int academicScaleMax) {
		this.academicScaleMax = academicScaleMax;
	}
	/**
	 * This method gets the minimum social scale  
	 * @return the socialScaleMin
	 */
	public int getSocialScaleMin() {
		return socialScaleMin;
	}
	/**
	 *  This method sets the minimum social scale 
	 * @param socialScaleMin the socialScaleMin to set
	 */
	public void setSocialScaleMin(int socialScaleMin) {
		this.socialScaleMin = socialScaleMin;
	}
	/**
	 * This method gets the maximum social scale 
	 * @return the socialScaleMax
	 */
	public int getSocialScaleMax() {
		return socialScaleMax;
	}
	/**
	 * This method sets the maximum social scale 
	 * @param socialScaleMax the socialScaleMax to set
	 */
	public void setSocialScaleMax(int socialScaleMax) {
		this.socialScaleMax = socialScaleMax;
	}
	/**
	 * This method gets the minimum life quality scale 
	 * @return the lifeQualityScaleMin
	 */
	public int getLifeQualityScaleMin() {
		return lifeQualityScaleMin;
	}
	/**
	 * This method sets the minimum life quality scale 
	 * @param lifeQualityScaleMin the lifeQualityScaleMin to set
	 */
	public void setLifeQualityScaleMin(int lifeQualityScaleMin) {
		this.lifeQualityScaleMin = lifeQualityScaleMin;
	}
	/**
	 * This method gets the maximum life quality scale 
	 * @return the lifeQualityScaleMax
	 */
	public int getLifeQualityScaleMax() {
		return lifeQualityScaleMax;
	}
	/**
	 * This method sets the maximum life quality scale  
	 * @param lifeQualityScaleMax the lifeQualityScaleMax to set
	 */
	public void setLifeQualityScaleMax(int lifeQualityScaleMax) {
		this.lifeQualityScaleMax = lifeQualityScaleMax;
	}
	/**
	 * This method gets an Array List of string emphases 
	 * @return the emphases
	 */
	public ArrayList<String> getEmphases() {
		return emphases;
	}
	/**
	 * This method sets an Array List of String empahses 
	 * @param emphases the emphases to set
	 */
	public void setEmphases(ArrayList<String> emphases) {
		this.emphases = emphases;
	}

	
	

}
