import java.util.ArrayList;

public class User extends Account {
	public User(String name, String password) {
		super(name, password);
		// TODO Auto-generated constructor stub
	}

	private ArrayList<University> savedSchools;
	
	public void addSavedSchool(University newSchool) {
		this.savedSchools.add(newSchool);
	}

	public void viewSavedSchools() {
		// TODO
		
	}
	
	public void editUserInfo() {
		
		// TODO
	}
	
	public void removeSavedSchool(University school) {
		this.savedSchools.remove(school);
	}
	
	public Boolean isLoggedOn() {
		// TODO
		
		return null;
		
	}
	
	public void getUserInfo() {
		// TODO
	}
	
	public void displayProfile(String userName, String Password) {
		// TODO
	}
	
	public void makeEditable() {
		// TODO
		
	}
	
	public Boolean currentlyLoggedOn() {
		
		// TODO
		return null;
		
		
	}
}
