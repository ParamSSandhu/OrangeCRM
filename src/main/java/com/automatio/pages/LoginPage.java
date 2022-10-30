package com.automatio.pages;
import com.automation.components.BaseActions;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BaseActions {        //Page Object Model

    WebDriver driver;
    public LoginPage(WebDriver driver){
        super(driver);  //pass driver to BaseActions
        this.driver = driver;
    }
    public LoginPage enterUsername(String username){
        typeInto("LoginPage.tbx_Username",username);
        return this;
    }
    public LoginPage enterPassword(String password){
        typeInto("LoginPage.tbx_Password",password);
        return this;
    }
    public WelcomePage clickSubmit(){
        clickIt("LoginPage.btn_Submit");
        return new WelcomePage(driver);
    }
}
