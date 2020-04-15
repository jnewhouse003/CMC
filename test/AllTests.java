import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import Account.AccountControllerTest;
import Account.AccountTest;
import Admin.AdminControllerTest;
import DB.DBControllerTest;
import SystemTest.DeactivateUserTest;
import SystemTest.SearchSchoolTest;
import SystemTest.activateUserTest;
import SystemTest.addSavedSchoolTest;
import SystemTest.editProfileTest;
import SystemTest.logOnTest;
import SystemTest.logOutTest;
import SystemTest.removeSavedSchoolTest;
import SystemTest.viewListOfUsersTest;
import SystemTest.viewProfileTest;
import SystemTest.viewSavedSchoolTest;
import SystemTest.viewSpecificSchoolInfoTest;
import search.SearchControllerTest;
import user.UserControllerTest;
import user.UserTest;

@RunWith(Suite.class)
@SuiteClasses({AccountControllerTest.class, AccountTest.class, DBControllerTest.class, UserControllerTest.class, UserTest.class, activateUserTest.class, addSavedSchoolTest.class, DeactivateUserTest.class, editProfileTest.class, logOnTest.class, logOutTest.class, removeSavedSchoolTest.class, SearchSchoolTest.class, SearchControllerTest.class, AdminControllerTest.class, viewListOfUsersTest.class, viewProfileTest.class, viewSavedSchoolTest.class, viewSpecificSchoolInfoTest.class })
public class AllTests {

}
