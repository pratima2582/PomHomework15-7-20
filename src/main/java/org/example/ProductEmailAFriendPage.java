package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class ProductEmailAFriendPage extends UtilClass
{
    //create friends email locator
    private By _friendEmail = By.xpath("//input[@class='friend-email']");

    //create enter massage locator in msg box
    private By _inputMassage = By.xpath("//textarea[@class='your-email']");
    //click on send email button
    private By _sendEmailButton = By.xpath("//input[@class='button-1 send-email-a-friend-button']");
    private By _emailAddress1 = By.xpath("//input[@class='your-email']");


        //created method for friends email detail
    public void enterFriendEmailDetail()
    {

       // clickable(_clickOnEmailAFriend);

        // enter friends email by reusing method = send key
        sendkeyElement(_friendEmail,"friend@gmail.com");
       // String time = "test+"+timeStamp()+"@gmail.com";
        //sendkeyElement(_emailAddress1,time);

       // add a massage using sendkey method
        sendkeyElement(_inputMassage,"I am reffering this product to you");

        //put Explisit wait
        waitUntilElementIsClickable(_sendEmailButton,400);

        //Reusable method
        clickable(_sendEmailButton);

    }
}
