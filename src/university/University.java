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
	private float percentFemale; 
	private float percentMale; 
	private int verbalSAT; 
	private int mathSAT; 
	private float expenses; 
	private float financialAid; 
	private int numApplications; 
	private float percentAdmitted; 
	private float percentEnrolled;
	//what is this variables for? 
	private int academicsScale;
	//
	private int socialScale; 
	private int lifeQualityScale; 
	private int emphases; 
	
	
	
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
	public University(String name, String state, String location, String control, int numStudents, float percentFemale,
			float percentMale, int verbalSAT, int mathSAT, float expenses, float financialAid, int numApplications,
			float percentAdmitted, float percentEnrolled, int academicsScale, int socialScale, int lifeQualityScale,
			int emphases) {
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
	public float getPercentFemale() {
		return percentFemale;
	}

	/**
	 * @param percentFemale the percentFemale to set
	 */
	public void setPercentFemale(float percentFemale) {
		this.percentFemale = percentFemale;
	}

	/**
	 * @return the percentMale
	 */
	public float getPercentMale() {
		return percentMale;
	}

	/**
	 * @param percentMale the percentMale to set
	 */
	public void setPercentMale(float percentMale) {
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
	public float getExpenses() {
		return expenses;
	}

	/**
	 * @param expenses the expenses to set
	 */
	public void setExpenses(float expenses) {
		this.expenses = expenses;
	}

	/**
	 * @return the finanicalAid
	 */
	public float getFinancialAid() {
		return financialAid;
	}

	/**
	 * @param finanicalAid the finanicalAid to set
	 */
	public void setFinancialAid(float financialAid) {
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
	public float getPercentAdmitted() {
		return percentAdmitted;
	}

	/**
	 * @param percentAdmitted the percentAdmitted to set
	 */
	public void setPercentAdmitted(float percentAdmitted) {
		this.percentAdmitted = percentAdmitted;
	}

	/**
	 * @return the percentEnrolled
	 */
	public float getPercentEnrolled() {
		return percentEnrolled;
	}

	/**
	 * @param percentEnrolled the percentEnrolled to set
	 */
	public void setPercentEnrolled(float percentEnrolled) {
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
	public void setEmphases(int emphases) {
		this.emphases = emphases;
	}

}
