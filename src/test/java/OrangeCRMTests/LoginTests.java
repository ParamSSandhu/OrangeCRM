package OrangeCRMTests;

import com.automatio.pages.LoginPage;
import com.automatio.pages.WelcomePage;
import com.automation.components.DataProviderArgs;
import com.automation.components.DataProviderUtils;
import com.automation.components.TestActions;
import com.automation.helpers.DataGenerator;
import com.automation.helpers.TestAsserts;
import org.testng.annotations.Test;

import java.sql.SQLOutput;

public class LoginTests extends TestActions {   //Only call the test steps in this class

    @DataProviderArgs("validateLoginFunctionality=username,password,welcomeUser")       //Get data from json file
    @Test (dataProviderClass = DataProviderUtils.class, dataProvider = "jsonDataProvider", description = "This is a test to validate login functionality")      //provide data (username/password) from json file
    public void validateLoginFunctionality(String username, String password, String welcomeUser) throws Exception{
        System.out.println(username + " " + password);
        LoginPage loginPage = new LoginPage(driver.get());
        loginPage = loginPage.enterUsername(username);
        loginPage= loginPage.enterPassword(password);
        WelcomePage welcomePage = loginPage.clickSubmit();
        String welcomeMsg = welcomePage.getWelcomeMessage();
        System.out.println(welcomeMsg);
        TestAsserts.checkIfValuesAreEqual(welcomeMsg, welcomeUser);
    }

//    @Test
//    public void validateLoginFunctionalityUsingRandomData() throws Exception{       //Generate random username and password
//        String username = DataGenerator.getUsername();
//        String password = DataGenerator.getPassword();
//        System.out.println(username + "  " + password);
//        LoginPage loginPage = new LoginPage(driver.get());
//        WelcomePage welcomePage = loginPage.enterUsername(username).enterPassword(password).clickSubmit();
//        String welcomeMsg = welcomePage.getWelcomeMessage();
//        System.out.println(welcomeMsg);
//        Thread.sleep(5000);
//        TestAsserts.checkIfValuesAreEqual(welcomeMsg, "Paramvir Sandhu");
//    }

//    @Test (invocationCount = 1)         //number of times you want the test to run
//    public void validateLoginFunctionality2() throws Exception{
//        LoginPage loginPage = new LoginPage(driver.get());
//        WelcomePage welcomePage = loginPage.enterUsername("Admin").enterPassword("admin123").clickSubmit();
//        String welcomeMsg = welcomePage.getWelcomeMessage();
//        System.out.println(welcomeMsg);
//        Thread.sleep(5000);
//    }
}
