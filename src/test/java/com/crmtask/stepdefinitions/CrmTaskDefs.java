package com.crmtask.stepdefinitions;

import com.crmtask.pages.BasePage;
import com.crmtask.pages.TasksPage;
import com.crmtask.pages.LoginPage;
import com.crmtask.utilities.BrowserUtils;
import com.crmtask.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.bouncycastle.crypto.tls.SRTPProtectionProfile;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class CrmTaskDefs {

    LoginPage loginPage = new LoginPage();
    TasksPage tasksPage = new TasksPage();

    @Given("the user should be able to login")
    public void the_user_should_be_able_to_login() {

        BrowserUtils.waitFor(2);
        loginPage.login();


    }

    @Given("User click on the {string} button under Quick Navigate Menu")
    public void user_click_on_the_button_under_Quick_Navigate_Menu(String task) {
        BasePage basePage = new BasePage();
        basePage.tasksButton.click();
        BrowserUtils.waitFor(2);

    }

    @When("User click on the {string} checkbox")
    public void user_click_on_the_checkbox(String string) {
        tasksPage.highPriorityBtn.click();
        BrowserUtils.waitFor(2);

    }

    @Then("Verify that user should be able to click on {string} fire icon")
    public void verify_that_user_should_be_able_to_click_on_fire_icon(String HighBut) {
        System.out.println("HighBut = " + tasksPage.highPriorityBtn.isSelected());
        Assert.assertTrue(tasksPage.highPriorityBtn.isSelected());
        BrowserUtils.waitFor(2);

    }


    @Given("User click on Visual Editor")
    public void userClickOnVisualEditor() {
        BrowserUtils.waitFor(2);
        tasksPage.visualEditorA.click();

    }

    @When("Verify that the editor text bar displays on top of the message box.")
    public void verifyThatTheEditorTextBarDisplaysOnTopOfTheMessageBox() {
        System.out.println("userClickOnVisualEditor =" + tasksPage.VisualEditorScreen.isDisplayed());
        Assert.assertTrue(tasksPage.VisualEditorScreen.isDisplayed());

    }

    @Given("User should be able to click on the {string} button")
    public void user_should_be_able_to_click_on_the_button(String string) {
        BrowserUtils.waitFor(2);
        tasksPage.CheckListButt.click();


    }

    @When("User can add following {string} on Things to do")
    public void user_can_add_following_on_Things_to_do(String listItem) {
        tasksPage.CheckThingsToDdo2.clear();

        tasksPage.CheckThingsToDdo2.sendKeys("listItem");
        BrowserUtils.waitFor(2);
        System.out.println("listItem = " + listItem);
    }

    @When("User can add a checklist item by clicking on the checkmark.")
    public void user_can_add_a_checklist_item_by_clicking_on_the_checkmark() {
        tasksPage.CheckItemList.click();

    }

    @When("Verify that user can add a checklist item by clicking on the add button or checkmark.")
    public void verify_that_user_can_add_a_checklist_item_by_clicking_on_the_add_button_or_checkmark() {
        BrowserUtils.waitFor(2);
        tasksPage.chkBtn.click();
        BrowserUtils.waitFor(2);
        Assert.assertTrue(tasksPage.chkBtn.isSelected());

        // String itemTextText = basePage.ItemText.getText(); not work?
        // System.out.println("itemTextText = " + itemTextText);

    }

    @Given("User  click on the {string} button")
    public void user_click_on_the_button(String string) {
        tasksPage.separator.click();
        BrowserUtils.waitFor(2);


    }

    @Given("Verify that  separator line display on the checklist items")
    public void verify_that_separator_line_display_on_the_checklist_items() {
        BrowserUtils.waitFor(5);
      //  Assert.assertTrue(tasksPage.separatorLine.isDisplayed());

    }

    @Given("User can add checklistItem on Things to do")
    public void user_can_add_checklistItem_on_Things_to_do() {
        tasksPage.CheckThingsToDdo2.clear();
        tasksPage.CheckThingsToDdo2.sendKeys("Item delete");

        BrowserUtils.waitFor(2);

    }

    @When("User can click the delete mark")
    public void user_can_click_the_delete_mark() throws InterruptedException {
        Actions actions = new Actions(Driver.get());
        Thread.sleep(2000);
        actions.moveToElement(tasksPage.deleteSign).perform();
        tasksPage.deleteSign.click();


    }


    @When("Verify that the system should delete  the checklist item")
    public void verify_that_the_system_should_delete_the_checklist_item() {
        BrowserUtils.waitFor(2);
        //Assert.assertFalse(basePage.deleteSign.isDisplayed()); no work HOW?
    }


    @Given("User  click the {string} button")
    public void user_click_the_button(String string) {
        tasksPage.timePlanningButt.click();

    }

    @When("User  click the deadlinebox")
    public void user_click_the_deadlinebox() {
        tasksPage.deadlineBox.click();


    }

    @When("User  select date by using date pickers")
    public void user_select_date_by_using_date_pickers() {
        tasksPage.deadlineInput.click();
        BrowserUtils.waitFor(2);
        tasksPage.selectDate.click();

    }

    @When("User click  the StarttaskBox")
    public void user_click_the_StarttaskBox() {
        tasksPage.deadlineBoxStart.click();
    }

    @When("User click the dateStart")
    public void user_click_the_dateStart() {
        tasksPage.selectDateStart.click();

    }

    @When("User seleckt start")
    public void user_seleckt_start() {
        tasksPage.selectDate.click();

    }

    @When("User click  the Finish  box")
    public void user_click_the_Finish_box() {
        tasksPage.deadlineboxFinish.click();

    }

    @When("User click the dateFinish")
    public void user_click_the_dateFinish() {
        tasksPage.selectDateFinish.click();
        BrowserUtils.waitFor(2);
        tasksPage.selectFinish.click();
    }


    ////  Iframe message get


    @Given("User enter  a title on Things to do message box")
    public void user_enter_a_title_on_Things_to_do_message_box() throws InterruptedException {
        BrowserUtils.waitFor(2);
        Driver.get().switchTo().frame(0);

        String EnterMessageText = "SEND_ITEM_CASE";
        tasksPage.iframeForm.sendKeys(EnterMessageText);
        Thread.sleep(3000);
        Driver.get().switchTo().parentFrame();

    }


    @When("click to send button")
    public void click_to_send_button() {
        BrowserUtils.waitFor(3);
        tasksPage.sendButt.click();

    }

    @When("User  click  VIEW TASK")
    public void user_click_VIEW_TASK() {
        tasksPage.viewtaskclick.click();
        BrowserUtils.waitFor(2);
    }

    @When("Verify that message display on pagetitle")
    public void verify_that_message_display_on_pagetitle() throws InterruptedException {
        BrowserUtils.waitFor(5);
        Driver.get().switchTo().frame(1);

        Thread.sleep(3000);
        String expectedSendText = "SEND_ITEM_CASE";
        String actualSendText = tasksPage.pagetitle.getText();
        System.out.println("actualSendText = " + actualSendText);

        Assert.assertEquals(expectedSendText, actualSendText);


    }

    @And("Verify that Task has been created")
    public void verifyThatTaskHasBeenCreated() {
        BrowserUtils.waitFor(5);
        String expectedtaskCreated="Task has been created";
        String actualtaskCreatedText=tasksPage.taskMesajCreated.getText();

        System.out.println("actualtaskCreatedText = " + actualtaskCreatedText);
        BrowserUtils.waitFor(2);
        Assert.assertEquals(actualtaskCreatedText,expectedtaskCreated);


//IFRAMEEEEEEEEEEEEE


    }

    @When("User clean the input field")
    public void user_clean_the_input_field() {

        tasksPage.CheckThingsToDdo1.clear();
    }

    @When("Verify that system display The task name is not specified message")
    public void verify_that_system_display_The_task_name_is_not_specified_message() {
        String actualMessage = tasksPage.errorSendText.getText();
        String expectSendMessage = "The task name is not specified.";
        System.out.println("actualTitle = " + actualMessage);
        Assert.assertEquals(actualMessage, expectSendMessage);


    }

    @When("User  select overdue date by using date pickers")
    public void user_select_overdue_date_by_using_date_pickers() {
        tasksPage.overdueDeadlineInput.click();

    }

    @When("User click  overdateSelect")
    public void user_click_overdateSelect() {
        tasksPage.overdateSelect.click();
    }

    @When("Verify that system display Task is overdue! message")
    public void verify_that_system_display_Task_is_overdue_message() {
        BrowserUtils.waitFor(5);
        String ActualOverdueText = tasksPage.taskOverdue.getText();
        System.out.println("ActualOverdueText = " + ActualOverdueText);


    }

    @When("Verify that system date Task is overdue! message")
    public void verify_that_system_date_Task_is_overdue_message() throws InterruptedException {
       BrowserUtils.waitFor(5);

       Driver.get().switchTo().frame(1);
        String expectedOverdueText="Task is overdue!";
        Thread.sleep(3000);
    String ActualOverdueText = tasksPage.taskOverdueDate.getText();
       System.out.println("ActualOverdueText = " + ActualOverdueText);
       Assert.assertEquals(expectedOverdueText,ActualOverdueText);



    }




    }





