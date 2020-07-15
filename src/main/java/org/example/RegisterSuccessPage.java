package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;
          //inherited class
public class RegisterSuccessPage extends UtilClass
{
       //stored locators in different variables
    private By _achualText = By.xpath("//div[text()='Your registration completed']");
    private String _expectedText = "Your registration completed";
    //click on continue button
    private By _continueButton = By.xpath("//input[contains(@value,'Continue')]");


    public void regSuccessfullMsg ()
    {
        // Assert to check if Actual is = to Expected
        Assert.assertEquals(getElement(_achualText),_expectedText);

    }
    public void clickContinue () {

        // Explicit wait
        waitUntilElementIsClickable(_continueButton,200);


        clickable(_continueButton);//calling continue button to click

        //My click on button is not working so i have to use it again
       waitUntilElementIsClickable(_continueButton,200);

    }


}
