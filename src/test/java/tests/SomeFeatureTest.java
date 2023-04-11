package tests;

import org.testng.annotations.Test;
import pages.LoginPageEx;

public class SomeFeatureTest extends baseTest {

    @Test
    public void demoTestCase(){
        /**
         * Using TestNG we can create test cases just like this
         */
        LoginPageEx login = new LoginPageEx();
        login.usrLogin("Hello", "World");
    }

    @Test(groups = "test")
    public void anotherTestCase(){
        // We can also use testNG annotations to group
        // test cases like this, but there is a better way..
        // see testmanagement.xml.

        loginPageEx.usrLogin("Hello", "World");
    }

}
