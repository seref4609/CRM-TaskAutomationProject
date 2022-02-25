package com.crmtask.pages;

import com.crmtask.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasePage {


    public BasePage(){
        PageFactory.initElements(Driver.get(), this);
}

    @FindBy(xpath = "(//span[.='Task'])[2]")
    public WebElement tasksButton;
}
