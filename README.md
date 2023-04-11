# Demo Automation Framework
***
This is a demo framework project structure, designed to replicate 
how I would create an enterprise level automation framework. 
In this project you will find the basic building blocks of my framework design.
***


### Dependencies used:


 - [Selenium](https://github.com/SeleniumHQ?q=&type=all&language=&sort=)
    - [selenium-java](https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java)
 - [webdrivermanager](https://github.com/bonigarcia/webdrivermanager)
 -  [testNG](https://testng.org/doc/)
 -  [javafaker](https://github.com/DiUS/java-faker)
 -  [fastexcel-reader](https://github.com/dhatim/fastexcel)

Occasionally lombok is also required due to discrepancy issues. - [lombok](https://github.com/projectlombok/lombok)
***

### Framework Structure:
 
> | -ProjectRootDirectory  
> &nbsp;  &nbsp;  &nbsp; | -src    
> &nbsp;  &nbsp;  &nbsp; &nbsp;  &nbsp;  &nbsp; | -test  
> &nbsp;  &nbsp;  &nbsp; &nbsp;  &nbsp;  &nbsp; &nbsp; &nbsp; | -java  
> &nbsp;  &nbsp;  &nbsp; &nbsp;  &nbsp;  &nbsp; &nbsp;  &nbsp;  &nbsp; &nbsp; | -core &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;# This package contains the core functionality of the framework  
> &nbsp;  &nbsp;  &nbsp; &nbsp;  &nbsp;  &nbsp; &nbsp;  &nbsp;  &nbsp; &nbsp; | -pages&nbsp; &nbsp; &nbsp; &nbsp; &nbsp;# This package makes use of the Page Object Model and stores all the Page object Classes   
> &nbsp;  &nbsp;  &nbsp; &nbsp;  &nbsp;  &nbsp; &nbsp;  &nbsp;  &nbsp; &nbsp; | -tests&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;# This package hosts all the test classes which contain test cases  
> | -.gitignore  
> | -pom.xml &nbsp; &nbsp;  &nbsp; &nbsp;  &nbsp;  &nbsp; &nbsp;  &nbsp;  &nbsp; &nbsp; &nbsp; &nbsp;  # Project object model file for maven project configuration  
> | -README.md &nbsp; &nbsp;  &nbsp;  &nbsp; &nbsp;  &nbsp;  &nbsp; &nbsp; &nbsp; # This is the file you are viewing    
> | -testmanagement.xml &nbsp;&nbsp;  &nbsp;#  This file configures test case management  