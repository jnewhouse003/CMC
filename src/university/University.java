/**
 * 
 */
package university;
/**
 * 
 */

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
	private String emphases; 
	
	
	
	//private variables
	/**
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
	 * @param emphases
	 */
	public University(String name, String state, String location, String control, int numStudents, double percentFemale,
			double percentMale, int verbalSAT, int mathSAT, double expenses, double financialAid, int numApplications,
			double percentAdmitted, double percentEnrolled, int academicsScale, int socialScale, int lifeQualityScale,
			String emphases) {
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
		this.emphases = emphases;
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
	 * @return the numStudents
	 */
	public int getNumStudents() {
		return numStudents;
	}

	/**
	 * @param numStudents the numStudents to set
	 */
	public void setNumStudents(int numStudents) {
		this.numStudents = numStudents;
	}

	/**
	 * @return the percentFemale
	 */
	public double getPercentFemale() {
		return percentFemale;
	}

	/**
	 * @param percentFemale the percentFemale to set
	 */
	public void setPercentFemale(double percentFemale) {
		this.percentFemale = percentFemale;
	}

	/**
	 * @return the percentMale
	 */
	public double getPercentMale() {
		return percentMale;
	}

	/**
	 * @param percentMale the percentMale to set
	 */
	public void setPercentMale(double percentMale) {
		this.percentMale = percentMale;
	}

	/**
	 * @return the verbalSAT
	 */
	public int getVerbalSAT() {
		return verbalSAT;
	}

	/**
	 * @param verbalSAT the verbalSAT to set
	 */
	public void setVerbalSAT(int verbalSAT) {
		this.verbalSAT = verbalSAT;
	}

	/**
	 * @return the mathSAT
	 */
	public int getMathSAT() {
		return mathSAT;
	}

	/**
	 * @param mathSAT the mathSAT to set
	 */
	public void setMathSAT(int mathSAT) {
		this.mathSAT = mathSAT;
	}

	/**
	 * @return the expenses
	 */
	public double getExpenses() {
		return expenses;
	}

	/**
	 * @param expenses the expenses to set
	 */
	public void setExpenses(double expenses) {
		this.expenses = expenses;
	}

	/**
	 * @return the finanicalAid
	 */
	public double getFinancialAid() {
		return financialAid;
	}

	/**
	 * @param finanicalAid the finanicalAid to set
	 */
	public void setFinancialAid(double financialAid) {
		this.financialAid = financialAid;
	}

	/**
	 * @return the numApplications
	 */
	public int getNumApplications() {
		return numApplications;
	}

	/**
	 * @param numApplications the numApplications to set
	 */
	public void setNumApplications(int numApplications) {
		this.numApplications = numApplications;
	}

	/**
	 * @return the percentAdmitted
	 */
	public double getPercentAdmitted() {
		return percentAdmitted;
	}

	/**
	 * @param percentAdmitted the percentAdmitted to set
	 */
	public void setPercentAdmitted(double percentAdmitted) {
		this.percentAdmitted = percentAdmitted;
	}

	/**
	 * @return the percentEnrolled
	 */
	public double getPercentEnrolled() {
		return percentEnrolled;
	}

	/**
	 * @param percentEnrolled the percentEnrolled to set
	 */
	public void setPercentEnrolled(double percentEnrolled) {
		this.percentEnrolled = percentEnrolled;
	}

	/**
	 * @return the academicsScale
	 */
	public int getAcademicsScale() {
		return academicsScale;
	}

	/**
	 * @param academicsScale the academicsScale to set
	 */
	public void setAcademicsScale(int academicsScale) {
		this.academicsScale = academicsScale;
	}

	/**
	 * @return the socialScale
	 */
	public int getSocialScale() {
		return socialScale;
	}

	/**
	 * @param socialScale the socialScale to set
	 */
	public void setSocialScale(int socialScale) {
		this.socialScale = socialScale;
	}

	/**
	 * @return the lifeQualityScale
	 */
	public int getLifeQualityScale() {
		return lifeQualityScale;
	}

	/**
	 * @param lifeQualityScale the lifeQualityScale to set
	 */
	public void setLifeQualityScale(int lifeQualityScale) {
		this.lifeQualityScale = lifeQualityScale;
	}

	/**
	 * @return the emphases
	 */
	public int getEmphases() {
		return emphases;
	}

	/**
	 * @param emphases the emphases to set
	 */
	public void setEmphases(String emphases) {
		this.emphases = emphases;
	}

}
