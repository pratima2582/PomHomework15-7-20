package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class IframeExample extends UtilClass
{
    //stored locators in different variables
    private By _iFrameActualText =By.xpath("//span[text()='Not a Friendly Topic']");
    private String _iFrameExpectedText = "Not a Friendly Topic";
    private By _topicText = By.xpath("//input[@type='text']");
    private By _checkBox = By.xpath("//input[@type='checkbox']");
    private By _animalDropDownSelection = By.xpath("//select[@class='col-lg-3']");
    //method overriding
    public void setBrowser()
    {
        driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
    }

        public void verifyUserIsOnFrameExamplePage()
        {

            //assert if the user is on frame page
            Assert.assertEquals(getElement(_iFrameActualText), _iFrameExpectedText, "Page not found");
        }
        public void frameExampleDetails()
        {
        // Switching to frame 1 to input text in topic
        driver.switchTo().frame("frame1");
        sendkeyElement(_topicText,"jfws");

        // Swiching to frame 3 from frame 1 to click on checkbox
        driver.switchTo().frame("frame3");
        clickable(_checkBox);

        //Switching back to main frame
        driver.switchTo().defaultContent();

        //Switching to frame 3 to get avatar from dropdown
        driver.switchTo().frame("frame2");
        selectFromDropDownByValue(_animalDropDownSelection,"avatar");

       // Switching to default Frame
        driver.switchTo().defaultContent();

    }
}
