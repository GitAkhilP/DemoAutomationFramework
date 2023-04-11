package pages;

import org.openqa.selenium.By;

public class LoginPageEx extends BasePageEx{

    // ------------- Fields ----------------//
    /**
     * In this section the locators of web elements will be placed.
     * Selenium has support for CSS selector as well as Xpath.
     * For example the elements for the Username and password input.
     */
    private By someName; // todo code for the locator

    // ------------- Mehtods ---------------//
    /**
     * In this section there will be a relevant set of methods which will be unique and useful to the
     * Login webpage. For example there might be a login method.
     */
    public void usrLogin(String usrname, String pass){
        System.out.println(usrname + pass +"!");
        // todo
    }


    // -------- Helper Methods ------------//
    /**
     * Here typically will go the getters, and setters of all the private fields,
     * as well as any other methods which will be used only by this class, or in this package
     * For example
     */
    private By getSomeName(){
        return this.someName;
    }
}
