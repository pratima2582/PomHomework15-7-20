package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

             // Inheritance class
public class DigitalStormPage extends UtilClass {

        //Stored variables for locators
    private By _actualDigitalStormText = (By.xpath("//h1[text()='Digital Storm VANQUISH 3 Custom Performance PC']"));
    private String  _expectedDigitalStormText = "Digital Storm VANQUISH 3 Custom Performance PC";

    private By _clickOnEmailAFriendButton = By.xpath("//input[@value='Email a friend']");

            //
    public void clickOnFriendEmailButton()
    {
        //Assert to check if the user is on Digital page
        Assert.assertEquals(getElement(_actualDigitalStormText),_expectedDigitalStormText);

           // put Explicit wait
        waitUntilElementIsClickable(_clickOnEmailAFriendButton,400);

         // reusable method from utilclass
        clickable(_clickOnEmailAFriendButton);
    }
}
