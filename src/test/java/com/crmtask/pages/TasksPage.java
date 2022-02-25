package com.crmtask.pages;

import com.crmtask.utilities.Driver;
import io.cucumber.java.bs.I;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;


public class TasksPage {

    public TasksPage() {

        PageFactory.initElements(Driver.get(), this);
    }


    @FindBy(id = "tasks-task-priority-cb")
    public WebElement highPriorityBtn;

    @FindBy(id = "lhe_button_editor_task-form-lifefeed_task_form")
    public WebElement visualEditorA;


    @FindBy(id = "bx-html-editor-tlbr-lifefeed_task_form")
    public WebElement VisualEditorScreen;

    @FindBy(xpath = "(//*[@placeholder='Things to do'])[1]")
    public WebElement ThingsToDdo1;

    @FindBy(xpath = "(//*[@placeholder='Things to do'])[2]")
    public WebElement CheckThingsToDdo2;

    @FindBy(xpath = "//span[.='Checklist']")
    public WebElement CheckListButt;

    @FindBy(xpath = "//*[@class='js-id-checklist-is-form-submit block-edit tasks-btn-apply task-field-title-ok']")
    public WebElement CheckItemList;

    @FindBy(xpath = "//span[@class='js-id-checklist-is-i-title ']")
    public List<WebElement> AllCheckList;

    @FindBy(className = "js-id-checklist-is-form-title task-checklist-field-add")
    public WebElement addItem;

    @FindBy(partialLinkText = "Item 1 ")
    public WebElement ItemText;


    @FindBy(xpath = "//input[@class='js-id-checklist-is-i-toggle task-checklist-field-checkbox']")
    public WebElement chkBtn;

    @FindBy(xpath = "//*[@class='js-id-checklist-is-add-separator task-dashed-link-inner']")
    public WebElement separator;

    @FindBy(className = "js-id-checklist-is-i-drag-handle task-field-divider separator")
    public WebElement separatorLine;
    @FindBy(xpath = "(//*[@class='js-id-checklist-is-i-delete task-field-title-del tasks-btn-delete'])[1]")
    public WebElement deleteSign;

//**********************************************

    @FindBy(xpath = "//*[.='Time planning'] ")
    public WebElement timePlanningButt;

    @FindBy(xpath = "(//*[@class='task-options-inp'])[1]")
    public WebElement deadlineBox;

    @FindBy(xpath = "//a[@data-date='1645574400000']")
    public WebElement deadlineInput;

    @FindBy(xpath = "//span[.='Select']")
    public WebElement selectDate;

    @FindBy(xpath = "(//*[@class='task-options-inp'])[2]")
    public WebElement deadlineBoxStart;

    @FindBy(xpath = "(//a[@class='bx-calendar-cell'])[19]")
    public WebElement selectDateStart;


    @FindBy(xpath = "(//*[@class='task-options-inp'])[4]")
    public WebElement deadlineboxFinish;

    @FindBy(xpath = "(//a[@class='bx-calendar-cell'])[10]")
    public WebElement selectDateFinish;


    @FindBy(xpath = "(//*[@class='bx-calendar-button-text'])[1]")

    public WebElement selectFinish;

    //************************SEND

    @FindBy(xpath = "(//*[@placeholder='Things to do'])[1]")
    public WebElement CheckThingsToDdo1;

    @FindBy(id = "blog-submit-button-save")
    public WebElement sendButt;

    @FindBy(xpath = "//span[.='View task']")
    public WebElement viewtaskclick;

    /////span[@id='pagetitle']
    // @FindBy(xpath = "//*[@class='pagetitle-item']")
    //@FindBy(xpath = "/html/body/div[1]/div/div/div[2]/span/text()")

    @FindBy(xpath = "//span[@id='pagetitle']")
    public WebElement sendPageTitle;

    @FindBy(xpath = "//*[@class='feed-create-task-popup-title']")
    public WebElement taskMesajCreated;

    //********************blank tasl send


    @FindBy(xpath = "//div[.='The task name is not specified.']")
    public WebElement errorSendText;

    //************** overdue


    // @FindBy(xpath = "//span[@class='task-detail-sidebar-item-delay-message-text']")
//css=.task-detail-sidebar-item-delay-message
    @FindBy(css = ".task-detail-sidebar-item-delay-message")
    public WebElement taskOverdue;
    ////*[@id="task-detail-deadline"]


    @FindBy(xpath = "(//*[@class='bx-calendar-cell'])[11]")
    public WebElement overdueDeadlineInput;


    @FindBy(xpath = "(//*[@class='bx-calendar-button-text'])[1]")
    public WebElement overdateSelect;





//***********Iframe- message get Text

    @FindBy(id = "feed-add-post-form-tab-tasks")
    public WebElement taskTab;

    @FindBy(xpath = "//body[@contenteditable='true']")
    public WebElement iframeForm;

    @FindBy(id = "blog-submit-button-save")
    public WebElement sendButton;

    @FindBy(xpath = "//*[@class='popup-window-button']")
    public WebElement viewTaskButton;

    @FindBy(xpath = "//*[@class='pagetitle-item']")
    public WebElement pagetitle;


    @FindBy(xpath = "//*[@class='task-detail-sidebar-item-delay-message-text']")
    public WebElement taskOverdueDate;
}





















