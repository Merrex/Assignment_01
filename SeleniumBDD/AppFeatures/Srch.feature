#Author: kumarmayur96@gmail.com
#NOTE**
#*
#*
#Run using only feature file.
#JUNIT runner class is showing some errors though theoretically correct.
#*********


Feature: Google Search

Scenario: Search invalid entry or null in search bar
    Given Google home page is open
    When Type "" in Search bar
    And Click on Search
    Then Search result page is not visible

  Scenario: Search valid entry in search bar
    Given Google home page is open
    When Type "ASDFG" in Search bar
    And Click on Search
    Then Search result page is visible
   
Scenario: Search valid entry in search bar
    Given Google home page is open
    When Type "56738" in Search bar
    And Click on Search
    Then Search result page is visible
    
    Scenario: Search valid entry in search bar
    Given Google home page is open
    When Type "ASD12#$%" in Search bar
    And Click on Search
    Then Search result page is visible
    
    Scenario: Search valid entry in search bar
    Given Google home page is open
    When Type "AND tEST" in Search bar
    And Click on Search
    Then Search result page is visible