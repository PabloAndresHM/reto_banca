#Autor: Pablo Andres Hernandez Morales
#language:en
@stories
Feature: Create a user in Utest.com
  As User
  I want to Create a new account in Utest
@scenario1
  Scenario Outline:Create a new profile complying all the requirements
    Given that user wants create a new profile on Utest
    When user complete all the require steps
      |name|last_name|email|birth_day|birth_month|birth_year|language|city|postal|country|password|
      |<name>|<last_name>|<email>|<birth_day>|<birth_month>|<birth_year>|<language>|<city>|<postal>|<country>|<password>|
    Then the profile is create successful
    Examples:
      |name|last_name|email|birth_day|birth_month|birth_year|language|city|postal|country|password|
      |Pablo|Hernandez|phernandezm@choucairtesting.com|17|May|1992 |Spanish |Medellin|050016|Colombia|F911sJl71<lWpy9({|

