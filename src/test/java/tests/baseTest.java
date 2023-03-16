package tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import pages.LoginPageEx;

abstract public class baseTest {

    // we can create all out Page Objects here to avoid
    // code repetition in out test cases.
    LoginPageEx loginPageEx = new LoginPageEx();


    @BeforeMethod
    public void beforeMethod(){
        /**
         * Here we can invoke any needed methods that should be called
         * before the testcase  runs typically open browser
         */
    }


    @AfterMethod
    public void afterMethod(){
        /**
         * Here we invoke any needed methods to run after the test case
         * runs typically close browser
         */
    }
}
