package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class DesktopPage extends UtilClass // Inheritance
{

    private By _actualDesktopPage = (By.xpath("//a[text()='Build your own computer']"));
    private String  _expectedDesktopPage = "Build your own computer";
    private By _digitalButton = By.xpath("//div[@class='product-grid']/div/div[2]/div[1]/div[2]/h2");



            //created click digital storm button method
    public void clickDigitalStormButton ()
    {
        //Assert to check if user is on desktop page or not
        Assert.assertEquals(getElement(_actualDesktopPage),_expectedDesktopPage);
            //put Explicit wait
        waitUntilElementIsClickable(_digitalButton,4000);

        //reusable method
        clickable(_digitalButton);

    }
}

