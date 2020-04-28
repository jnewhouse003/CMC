/**
 * 
 */
package university;
/**
 * 
 */

import java.util.ArrayList;

/**
 * @author <Diego Alvarez>
 *
 */
public class University {
	private String name;
	private String state; 
	private String location; 
	private String control; 
	private int numStudents; 
	private double percentFemale; 
	private double percentMale; 
	private int verbalSAT; 
	private int mathSAT; 
	private double expenses; 
	private double financialAid; 
	private int numApplications; 
	private double percentAdmitted; 
	private double percentEnrolled;
	//what is this variables for? 
	private int academicsScale;
	private int socialScale; 
	private int lifeQualityScale; 
	private ArrayList<String> emphases = new ArrayList<String>(); 
	
	
	
	//private variables
	/**
	 * This method is used as the constructor for universities 
	 * @param name
	 * @param state
	 * @param location
	 * @param control
	 * @param numStudents
	 * @param percentFemale
	 * @param percentMale
	 * @param verbalSAT
	 * @param mathSAT
	 * @param expenses
	 * @param financialAid
	 * @param numApplications
	 * @param percentAdmitted
	 * @param percentEnrolled
	 * @param academicsScale
	 * @param socialScale
	 * @param lifeQualityScale
	 * @param i
	 */
	public University(String name, String state, String location, String control, int numStudents, double percentFemale,
			double percentMale, int verbalSAT, int mathSAT, double expenses, double financialAid, int numApplications,
			double percentAdmitted, double percentEnrolled, int academicsScale, int socialScale, int lifeQualityScale,
			String i) {
		super();
		this.name = name;
		this.state = state;
		this.location = location;
		this.control = control;
		this.numStudents = numStudents;
		this.percentFemale = percentFemale;
		this.percentMale = percentMale;
		this.verbalSAT = verbalSAT;
		this.mathSAT = mathSAT;
		this.expenses = expenses;
		this.financialAid = financialAid;
		this.numApplications = numApplications;
		this.percentAdmitted = percentAdmitted;
		this.percentEnrolled = percentEnrolled;
		this.academicsScale = academicsScale;
		this.socialScale = socialScale;
		this.lifeQualityScale = lifeQualityScale;
		this.emphases.add(i);
	}


	
	
	/**
	 * This method is used to set instantiate all the parameter variables used in the constructor above  
	 * @param strings
	 */
	public University(String[] strings) {
		// TODO Auto-generated constructor stub
		super();
		this.name = strings[0];
		this.state = strings[1];
		this.location = strings[2];
		this.control = strings[3];
		this.numStudents = Integer.valueOf(strings[4]);
		this.percentFemale = Double.valueOf(strings[5]);
		this.percentMale = 100 - this.percentFemale;
		this.verbalSAT = Integer.valueOf(strings[6]);
		this.mathSAT = Integer.valueOf(strings[7]);
		this.expenses = Double.valueOf(strings[8]);
		this.financialAid = Double.valueOf(strings[9]);
		this.numApplications = Integer.valueOf(strings[10]);
		this.percentAdmitted = Double.valueOf(strings[11]);
		this.percentEnrolled = Double.valueOf(strings[12]);
		this.academicsScale = Integer.valueOf(strings[13]);
		this.socialScale = Integer.valueOf(strings[14]);
		this.lifeQualityScale = Integer.valueOf(strings[15]);
		
	}





	/**
	 * This method gets the name of the school 
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 *  This method sets the name of the school
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * This method gets the State of the school  
	 * @return the state
	 */
	public String getState() {
		return state;
	}

	/**
	 * This method sets the state for the school  
	 * @param state the state to set
	 */
	public void setState(String state) {
		this.state = state;
	}

	/**
	 * This method gets the location for the school  
	 * @return the location
	 */
	public String getLocation() {
		return location;
	}

	/**
	 *  This method sets the location for the school 
	 * @param location the location to set
	 */
	public void setLocation(String location) {
		this.location = location;
	}

	/**
	 * This method gets the control of the school  
	 * @return the control
	 */
	public String getControl() {
		return control;
	}

	/**
	 * This method sets the control of the school
	 * @param control the control to set
	 */
	public void setControl(String control) {
		this.control = control;
	}

	/**
	 *This method gets the number of students in the school
	 * @return the numStudents
	 */
	public int getNumStudents() {
		return numStudents;
	}

	/**
	 * This method sets the number of students in the school 
	 * @param numStudents the numStudents to set
	 */
	public void setNumStudents(int numStudents) {
		this.numStudents = numStudents;
	}

	/**
	 * This method gets the double percent of female in the school  
	 * @return the percentFemale
	 */
	public double getPercentFemale() {
		return percentFemale;
	}

	/**
	 * This method sets the double percent of female in the school  
	 * @param percentFemale the percentFemale to set
	 */
	public void setPercentFemale(double percentFemale) {
		this.percentFemale = percentFemale;
	}

	/**
	 * This method gets the double percent of male in the school  
	 * @return the percentMale
	 */
	public double getPercentMale() {
		return percentMale;
	}

	/**
	 * This method sets the double percent of male in the school  
	 * @param percentMale the percentMale to set
	 */
	public void setPercentMale(double percentMale) {
		this.percentMale = percentMale;
	}

	/**
	 * This method gets the verbal score of the students SAT 
	 * @return the verbalSAT
	 */
	public int getVerbalSAT() {
		return verbalSAT;
	}

	/**
	 * This method sets the verbal SAT scores 
	 * @param verbalSAT the verbalSAT to set
	 */
	public void setVerbalSAT(int verbalSAT) {
		this.verbalSAT = verbalSAT;
	}

	/**
	 * This method gets the math SAT scores  
	 * @return the mathSAT
	 */
	public int getMathSAT() {
		return mathSAT;
	}

	/**
	 * This method sets the math SAT scores 
	 * @param mathSAT the mathSAT to set
	 */
	public void setMathSAT(int mathSAT) {
		this.mathSAT = mathSAT;
	}

	/**
	 * This method gets expenses
	 * @return the expenses
	 */
	public double getExpenses() {
		return expenses;
	}

	/**
	 * This method sets the expenses
	 * @param expenses the expenses to set
	 */
	public void setExpenses(double expenses) {
		this.expenses = expenses;
	}

	/**
	 *  This method gets the financialAid 
	 * @return the finanicalAid
	 */
	public double getFinancialAid() {
		return financialAid;
	}

	/**
	 * This method sets the financial Aid
	 * @param finanicalAid the finanicalAid to set
	 */
	public void setFinancialAid(double financialAid) {
		this.financialAid = financialAid;
	}

	/**
	 * This method gets the number of Applications
	 * @return the numApplications
	 */
	public int getNumApplications() {
		return numApplications;
	}

	/**
	 * This method sets the number of applications  
	 * @param numApplications the numApplications to set
	 */
	public void setNumApplications(int numApplications) {
		this.numApplications = numApplications;
	}

	/**This method gets the double percent of the admitted students  
	 * 
	 * @return the percentAdmitted
	 */
	public double getPercentAdmitted() {
		return percentAdmitted;
	}

	/**
	 * This method sets the double of the percent admitted  
	 * @param percentAdmitted the percentAdmitted to set
	 */
	public void setPercentAdmitted(double percentAdmitted) {
		this.percentAdmitted = percentAdmitted;
	}

	/**
	 * This method gets the percent of enrolled students  
	 * @return the percentEnrolled
	 */
	public double getPercentEnrolled() {
		return percentEnrolled;
	}

	/**
	 * This method sets the double of the percent of students enrolled  
	 * @param percentEnrolled the percentEnrolled to set
	 */
	public void setPercentEnrolled(double percentEnrolled) {
		this.percentEnrolled = percentEnrolled;
	}

	/**
	 * This method gets the academic scale
	 * @return the academicsScale
	 */
	public int getAcademicsScale() {
		return academicsScale;
	}

	/**
	 * This method sets the academic scale 
	 * @param academicsScale the academicsScale to set
	 */
	public void setAcademicsScale(int academicsScale) {
		this.academicsScale = academicsScale;
	}

	/**
	 * This method gets the social scale of the school 
	 * @return the socialScale
	 */
	public int getSocialScale() {
		return socialScale;
	}

	/**
	 * This method set the social scale 
	 * @param socialScale the socialScale to set
	 */
	public void setSocialScale(int socialScale) {
		this.socialScale = socialScale;
	}

	/**
	 * This method gets the quality life scale 
	 * @return the lifeQualityScale
	 */
	public int getLifeQualityScale() {
		return lifeQualityScale;
	}

	/**
	 * This method sets the life quality scale 
	 * @param lifeQualityScale the lifeQualityScale to set
	 */
	public void setLifeQualityScale(int lifeQualityScale) {
		this.lifeQualityScale = lifeQualityScale;
	}

	/**
	 * This method is used to get the emphases 
	 * @return the emphases
	 */
	public ArrayList<String> getEmphases() {
		return emphases;
	}

	/**
	 * This method is used to set the emphases 
	 * @param emphases the emphases to set
	 */
	public void addEmphases(String emphases) {
		this.emphases.add(emphases);
	}
	
	/**
	 * This method is used to check if a university is valid given the name 
	 */
	public boolean equals(Object c) {
		if(this.getName().equals( ((University) c).getName())) {
			return true;
		}
		else {
			return false;
		}

		
	}

}
