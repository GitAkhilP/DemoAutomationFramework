package pages;

abstract public class BasePageEx {

    /**
     * This class is abstract strictly because we do not want to instantiate it
     * In this class all repeating code can be dumped.
     * For example any repeating web elements shared across multiple pages
     * or any method that needs to be used by all the pages.
     *
     * We can also create abstract methods that behave slightly different
     * depending on the particular page. an isDisplayed maybe might be abstract and have
     * different implementations depending on the page object calling it.
     */
}
