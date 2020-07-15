package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePage extends UtilClass
{

      //text link to verify if user is on homepage or not
       private By  _verifytext= (By.xpath("//h2[text()=\"Welcome to our store\"]"));
       //Expected result
       private String  _expectedText = "Welcome to our store";
       //click on register button method
       private By _registrationButton = By.xpath("//a[text()=\"Register\"]");


       //Clickon computer method
   private By _clickOnComputer = By.xpath("//a[text()=\"Computers \"]");

    //click on books option
    private By _bookButton = By.linkText("Books");


    //text link to verify if user is on Desktop Page or not
    public void homePageVerification()
    {
       Assert.assertEquals(getElement(_verifytext),_expectedText,"you are not on hp");
    }

    public void clickOnRegistrationDetail()
    {
        clickable(_registrationButton);
        waitUntilElementIsClickable(_registrationButton,400);
    }

    public void clickOnComputerButton()
    {

        clickable(_clickOnComputer);
        waitUntilElementIsClickable(_clickOnComputer,400);
    }
    public void clickOnBookPageButton()
    {
        waitUntilElementIsClickable(_bookButton,400);
        clickable(_bookButton);

    }


}

