package com.crmtask.pages;

import com.crmtask.utilities.ConfigurationReader;
import com.crmtask.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage() {
        PageFactory.initElements(Driver.get(), this);
    }




    @FindBy(name = "USER_LOGIN")
    public WebElement userName;

    @FindBy(name = "USER_PASSWORD")
    public WebElement passWord;

    @FindBy(xpath = "//input[@type='submit']")
    public WebElement submitButton;





    public void login() {

        String username = ConfigurationReader.get("username");
        String password = ConfigurationReader.get("password");

        userName.sendKeys(username);
        passWord.sendKeys(password);
        submitButton.click();

    }


}
