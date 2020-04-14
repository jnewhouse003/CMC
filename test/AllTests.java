import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import Account.AccountControllerTest;
import Account.AccountTest;
import DB.DBControllerTest;
import SystemTest.addSavedSchoolTest;
import SystemTest.editProfileTest;
import SystemTest.logOnTest;
import SystemTest.logOutTest;
import SystemTest.removeSavedSchoolTest;
import SystemTest.searchSchoolTest;
import search.SearchControllerTest;
import user.UserControllerTest;
import user.UserTest;

@RunWith(Suite.class)
@SuiteClasses({AccountControllerTest.class, AccountTest.class, DBControllerTest.class, UserControllerTest.class, UserTest.class, addSavedSchoolTest.class, editProfileTest.class, logOnTest.class, logOutTest.class, removeSavedSchoolTest.class, searchSchoolTest.class })
public class AllTests {

}
