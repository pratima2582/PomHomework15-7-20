package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class ComputerPage extends UtilClass
{

    //text link to verify if user is on computer page or not
    private By _actualComputerPage = (By.xpath("//h1[text()='Computers']"));
    //expected result locator
    private String _expectedComputerPage = "Computers";

        // stored locator for desktop button
    private By _clickOnDesktopButton = By.xpath("//div[@class='page-body']//div[1]//div[1]//div[1]//div[1]//a[text()=' Desktops ']");




    public void clickOnDesktopButton ()
    {
        // assert to verify if user is on computer page
        Assert.assertEquals(getElement(_actualComputerPage), _expectedComputerPage,"You are not on computer page ");

        //put explicit wait
        waitUntilElementIsClickable(_clickOnDesktopButton,4000);

        //click on desktop button to go to desktop page
        clickable(_clickOnDesktopButton);


    }



}


