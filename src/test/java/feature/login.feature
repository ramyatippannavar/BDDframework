Feature: scenario for facebook login

Scenario Outline: validation for login feature
Given user should have un pwd
When user eneter "<Username>" and "<Password>"
Then user should login in to application
Then application should close

Examples:
|Username|Password|
|tippannavar.ramya08@gmail.com|Ramya@34|
|tippannavar.ramya09@gmail.com|Ramya@36|
|tippannavar.ramya07@gmail.com|Ramya@35|