package org.example;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest extends UtilClass{
    BrowserManager browserManager = new BrowserManager();

    @BeforeMethod   //created before method as preconditon
     public void chromeHomePage()
    {
       browserManager.setBrowser();
    }

   @AfterMethod    //created metod runs after all methods
    public  void closeTest(ITestResult result)
   {
                  if(ITestResult.FAILURE==result.getStatus())
                  {
                      takeSnapShot(result.getName()+timeStamp());
                  }

        browserManager.closeBrowser();
    }
}
