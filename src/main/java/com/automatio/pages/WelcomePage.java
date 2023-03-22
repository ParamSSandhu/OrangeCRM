package com.automatio.pages;

import com.automation.components.BaseActions;
import org.openqa.selenium.WebDriver;

public class WelcomePage extends BaseActions {

    WebDriver driver;
    public WelcomePage(WebDriver driver){
        super(driver);  //pass driver to BaseActions
        this.driver = driver;
    }

    public String getWelcomeMessage(){
        return getTextFromElement("HomePage.lbl_Dashboard");
    }

    public LoginPage logout(){
        clickIt("HomePage.logout");
        clickIt("HomePage.logout2");
        return new LoginPage(driver);
    }
}
