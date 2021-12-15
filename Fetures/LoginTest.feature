#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@Smoke_Test
Feature: Title of your feature
  I want to use this template for my feature file

  @Login_Feature
  Scenario: User Able login successfully to EAM Application
  
        Given Launch the chrome browser navigate to the NSC HomePage url click the user login button
        When  user clicks the user login button directed to the new window enters username and password.  
        Then external user should be landing homepage
        
  @Login_Feature1
  Scenario: User Able login successfully to EAM Application
  
        Given Launch the chrome browser navigate to the NSC HomePage url click the user login button
        When  user clicks the user login button directed to the new window enters username and password.  
        Then external user should be landing homepage
        