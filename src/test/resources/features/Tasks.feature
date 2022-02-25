
Feature:User should be able to assign tasks under Quick Navigate Menu


  Background:
    Given the user should be able to login
    And User click on the "TASK" button under Quick Navigate Menu

  @US016TC-01             @wip
  Scenario: User click on the "High Priority" checkbox to set the current task to a top priority task.
    When User click on the "High Priority" checkbox
    Then Verify that user should be able to click on "High Priority" fire icon

  @US016TC-02            @wip
  Scenario: User should be able to click on Visual Editor and see the editor text bar displays on top of the message box.
    Given User click on Visual Editor
    When Verify that the editor text bar displays on top of the message box.

  @US016TC-03            @wip
  Scenario: User can add a checklist item by clicking on the add button or checkmark.

    Given User should be able to click on the "Checklist" button
    When User can add following "checklistItem" on Things to do
    And User can add a checklist item by clicking on the checkmark.
    And Verify that user can add a checklist item by clicking on the add button or checkmark.

  @US016TC-04           @wip
  Scenario:User can add separator lines between checklist items.
    Given User should be able to click on the "Checklist" button
    When User  click on the "separator" button
    And Verify that  separator line display on the checklist items

  @US016TC-05          @wip
  Scenario: User can delete a checklist item
    Given User should be able to click on the "Checklist" button
    When  User can add checklistItem on Things to do
    When User can add a checklist item by clicking on the checkmark.
    And User can click the delete mark
    And Verify that the system should delete  the checklist item

  @US016TC-06          @wip
  Scenario: User can add Deadline, Time Planning by using date pickers
    Given User  click the "Time planning" button
    When User  click the deadlinebox
    And  User  select date by using date pickers
    When  User click  the StarttaskBox
    And User click the dateStart
    And User seleckt start
    When User click  the Finish  box
    And User click the dateFinish



  @US016TC-07          @wip
  Scenario: User should be able to send tasks
    Given User enter  a title on Things to do message box
    When click to send button
    And User  click  VIEW TASK
    And Verify that message display on pagetitle

  @US016TC-08          @wip
  Scenario: User should not be able to add a new task if the input field is blank
    Given User clean the input field
    When click to send button
    And Verify that system display The task name is not specified message


  @US016TC-09          @wip
  Scenario: User should be able to enter a text into the input field.
    Given User enter  a title on Things to do message box
    When click to send button
    And Verify that Task has been created

  @US016TC-10          @wip
  Scenario:  User should not be able to enter a overdue date
    Given User enter  a title on Things to do message box
    When User  click the deadlinebox
    And  User  select overdue date by using date pickers
    And  User click  overdateSelect
    When click to send button
    And User  click  VIEW TASK
    And Verify that system date Task is overdue! message





































