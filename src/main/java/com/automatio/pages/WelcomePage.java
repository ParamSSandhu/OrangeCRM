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
        return getTextFromElement("HomePage.lbl_welcomeMsg");
    }




}
