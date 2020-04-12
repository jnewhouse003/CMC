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
	 * @param string5 
	 * @param p 
	 * @param o 
	 * @param n 
	 * @param m 
	 * @param h 
	 * @param l 
	 * @param g 
	 * @param f 
	 * @param k 
	 * @param j 
	 * @param e 
	 * @param d 
	 * @param i 
	 * @param string4 
	 * @param string3 
	 * @param string2 
	 * @param string 
	 * 
	 */
	
	public Criteria(String string, String string2, String string3, String string4, int i, double d, double e, int j, int k, double f, double g, int l, double h, double m, int n, int o, int p, String string5) {
		// TODO Auto-generated constructor stub
	}
	
	/**
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
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the state
	 */
	public String getState() {
		return state;
	}
	/**
	 * @param state the state to set
	 */
	public void setState(String state) {
		this.state = state;
	}
	/**
	 * @return the location
	 */
	public String getLocation() {
		return location;
	}
	/**
	 * @param location the location to set
	 */
	public void setLocation(String location) {
		this.location = location;
	}
	/**
	 * @return the control
	 */
	public String getControl() {
		return control;
	}
	/**
	 * @param control the control to set
	 */
	public void setControl(String control) {
		this.control = control;
	}
	/**
	 * @return the numStudentMin
	 */
	public int getNumStudentMin() {
		return numStudentMin;
	}
	/**
	 * @param numStudentMin the numStudentMin to set
	 */
	public void setNumStudentMin(int numStudentMin) {
		this.numStudentMin = numStudentMin;
	}
	/**
	 * @return the numStudentMax
	 */
	public int getNumStudentMax() {
		return numStudentMax;
	}
	/**
	 * @param numStudentMax the numStudentMax to set
	 */
	public void setNumStudentMax(int numStudentMax) {
		this.numStudentMax = numStudentMax;
	}
	/**
	 * @return the percentFemaleMin
	 */
	public double getPercentFemaleMin() {
		return percentFemaleMin;
	}
	/**
	 * @param percentFemaleMin the percentFemaleMin to set
	 */
	public void setPercentFemaleMin(double percentFemaleMin) {
		this.percentFemaleMin = percentFemaleMin;
	}
	/**
	 * @return the percentFemaleMax
	 */
	public double getPercentFemaleMax() {
		return percentFemaleMax;
	}
	/**
	 * @param percentFemaleMax the percentFemaleMax to set
	 */
	public void setPercentFemaleMax(double percentFemaleMax) {
		this.percentFemaleMax = percentFemaleMax;
	}
	/**
	 * @return the percentMaleMin
	 */
	public double getPercentMaleMin() {
		return percentMaleMin;
	}
	/**
	 * @param percentMaleMin the percentMaleMin to set
	 */
	public void setPercentMaleMin(double percentMaleMin) {
		this.percentMaleMin = percentMaleMin;
	}
	/**
	 * @return the percentMaleMax
	 */
	public double getPercentMaleMax() {
		return percentMaleMax;
	}
	/**
	 * @param percentMaleMax the percentMaleMax to set
	 */
	public void setPercentMaleMax(double percentMaleMax) {
		this.percentMaleMax = percentMaleMax;
	}
	/**
	 * @return the verbalSATMin
	 */
	public int getVerbalSATMin() {
		return verbalSATMin;
	}
	/**
	 * @param verbalSATMin the verbalSATMin to set
	 */
	public void setVerbalSATMin(int verbalSATMin) {
		this.verbalSATMin = verbalSATMin;
	}
	/**
	 * @return the verbalSATMax
	 */
	public int getVerbalSATMax() {
		return verbalSATMax;
	}
	/**
	 * @param verbalSATMax the verbalSATMax to set
	 */
	public void setVerbalSATMax(int verbalSATMax) {
		this.verbalSATMax = verbalSATMax;
	}
	/**
	 * @return the mathSATMin
	 */
	public int getMathSATMin() {
		return mathSATMin;
	}
	/**
	 * @param mathSATMin the mathSATMin to set
	 */
	public void setMathSATMin(int mathSATMin) {
		this.mathSATMin = mathSATMin;
	}
	/**
	 * @return the mathSATMax
	 */
	public int getMathSATMax() {
		return mathSATMax;
	}
	/**
	 * @param mathSATMax the mathSATMax to set
	 */
	public void setMathSATMax(int mathSATMax) {
		this.mathSATMax = mathSATMax;
	}
	/**
	 * @return the expensesMin
	 */
	public double getExpensesMin() {
		return expensesMin;
	}
	/**
	 * @param expensesMin the expensesMin to set
	 */
	public void setExpensesMin(double expensesMin) {
		this.expensesMin = expensesMin;
	}
	/**
	 * @return the expensesMax
	 */
	public double getExpensesMax() {
		return expensesMax;
	}
	/**
	 * @param expensesMax the expensesMax to set
	 */
	public void setExpensesMax(double expensesMax) {
		this.expensesMax = expensesMax;
	}
	/**
	 * @return the financialAidMin
	 */
	public double getFinancialAidMin() {
		return financialAidMin;
	}
	/**
	 * @param financialAidMin the financialAidMin to set
	 */
	public void setFinancialAidMin(double financialAidMin) {
		this.financialAidMin = financialAidMin;
	}
	/**
	 * @return the financialAidMax
	 */
	public double getFinancialAidMax() {
		return financialAidMax;
	}
	/**
	 * @param financialAidMax the financialAidMax to set
	 */
	public void setFinancialAidMax(double financialAidMax) {
		this.financialAidMax = financialAidMax;
	}
	/**
	 * @return the numApplicantsMin
	 */
	public int getNumApplicantsMin() {
		return numApplicantsMin;
	}
	/**
	 * @param numApplicantsMin the numApplicantsMin to set
	 */
	public void setNumApplicantsMin(int numApplicantsMin) {
		this.numApplicantsMin = numApplicantsMin;
	}
	/**
	 * @return the numApplicantsMax
	 */
	public int getNumApplicantsMax() {
		return numApplicantsMax;
	}
	/**
	 * @param numApplicantsMax the numApplicantsMax to set
	 */
	public void setNumApplicantsMax(int numApplicantsMax) {
		this.numApplicantsMax = numApplicantsMax;
	}
	/**
	 * @return the percentAdmittedMin
	 */
	public double getPercentAdmittedMin() {
		return percentAdmittedMin;
	}
	/**
	 * @param percentAdmittedMin the percentAdmittedMin to set
	 */
	public void setPercentAdmittedMin(double percentAdmittedMin) {
		this.percentAdmittedMin = percentAdmittedMin;
	}
	/**
	 * @return the percentAdmittedMax
	 */
	public double getPercentAdmittedMax() {
		return percentAdmittedMax;
	}
	/**
	 * @param percentAdmittedMax the percentAdmittedMax to set
	 */
	public void setPercentAdmittedMax(double percentAdmittedMax) {
		this.percentAdmittedMax = percentAdmittedMax;
	}
	/**
	 * @return the percentEnrolledMin
	 */
	public double getPercentEnrolledMin() {
		return percentEnrolledMin;
	}
	/**
	 * @param percentEnrolledMin the percentEnrolledMin to set
	 */
	public void setPercentEnrolledMin(double percentEnrolledMin) {
		this.percentEnrolledMin = percentEnrolledMin;
	}
	/**
	 * @return the percentEnrolledMax
	 */
	public double getPercentEnrolledMax() {
		return percentEnrolledMax;
	}
	/**
	 * @param percentEnrolledMax the percentEnrolledMax to set
	 */
	public void setPercentEnrolledMax(double percentEnrolledMax) {
		this.percentEnrolledMax = percentEnrolledMax;
	}
	/**
	 * @return the academicsScaleMin
	 */
	public int getAcademicsScaleMin() {
		return academicsScaleMin;
	}
	/**
	 * @param academicsScaleMin the academicsScaleMin to set
	 */
	public void setAcademicsScaleMin(int academicsScaleMin) {
		this.academicsScaleMin = academicsScaleMin;
	}
	/**
	 * @return the academicScaleMax
	 */
	public int getAcademicScaleMax() {
		return academicScaleMax;
	}
	/**
	 * @param academicScaleMax the academicScaleMax to set
	 */
	public void setAcademicScaleMax(int academicScaleMax) {
		this.academicScaleMax = academicScaleMax;
	}
	/**
	 * @return the socialScaleMin
	 */
	public int getSocialScaleMin() {
		return socialScaleMin;
	}
	/**
	 * @param socialScaleMin the socialScaleMin to set
	 */
	public void setSocialScaleMin(int socialScaleMin) {
		this.socialScaleMin = socialScaleMin;
	}
	/**
	 * @return the socialScaleMax
	 */
	public int getSocialScaleMax() {
		return socialScaleMax;
	}
	/**
	 * @param socialScaleMax the socialScaleMax to set
	 */
	public void setSocialScaleMax(int socialScaleMax) {
		this.socialScaleMax = socialScaleMax;
	}
	/**
	 * @return the lifeQualityScaleMin
	 */
	public int getLifeQualityScaleMin() {
		return lifeQualityScaleMin;
	}
	/**
	 * @param lifeQualityScaleMin the lifeQualityScaleMin to set
	 */
	public void setLifeQualityScaleMin(int lifeQualityScaleMin) {
		this.lifeQualityScaleMin = lifeQualityScaleMin;
	}
	/**
	 * @return the lifeQualityScaleMax
	 */
	public int getLifeQualityScaleMax() {
		return lifeQualityScaleMax;
	}
	/**
	 * @param lifeQualityScaleMax the lifeQualityScaleMax to set
	 */
	public void setLifeQualityScaleMax(int lifeQualityScaleMax) {
		this.lifeQualityScaleMax = lifeQualityScaleMax;
	}
	/**
	 * @return the emphases
	 */
	public ArrayList<String> getEmphases() {
		return emphases;
	}
	/**
	 * @param emphases the emphases to set
	 */
	public void setEmphases(ArrayList<String> emphases) {
		this.emphases = emphases;
	}

	
	

}
