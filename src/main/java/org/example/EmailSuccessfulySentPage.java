package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;
                  // inheritance class
public class EmailSuccessfulySentPage extends UtilClass
{
      //Stored locators in difeerent variable
    private By _actualEmailSuccessfulText = (By.xpath("//h1[text()='Email a friend']"));
    private String  _expectedEmailSuccessfulText = "Email a friend";




    public void emailSuccessfullSentAsser()
    {
        //Assert to check if the user is on Digital page
        Assert.assertEquals(getElement(_actualEmailSuccessfulText),_expectedEmailSuccessfulText);
    }
}
