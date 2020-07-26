package org.example;


import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

      //Inherited class
public class BrowserManager extends UtilClass
{
    public void setBrowser()
    {

        System.setProperty("webdriver.chrome.driver", "src\\test\\resourses\\BrowserDriver\\chromedriver.exe");
        driver = new ChromeDriver();     //creating chrome driver object to open google chrome browser
        driver.manage().window().maximize();   //maximizing screen
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);   //giving implicity wait
        driver.get("https://demo.nopcommerce.com/");   //open the URL
    }

    public void closeBrowser ()
    {
       // driver.close();
    }

}
