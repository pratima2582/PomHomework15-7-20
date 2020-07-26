package org.example;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.testng.annotations.BeforeMethod;

public class Hooks extends UtilClass {
    BrowserManager browserManager = new BrowserManager();

    @Before
    public void openBrowser()
    {
        browserManager.setBrowser();
    }

    @After
    public void closeBrowser()
    {
        browserManager.closeBrowser();
    }

}
