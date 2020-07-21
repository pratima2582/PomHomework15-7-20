package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class NewsOnlineStorePage extends UtilClass
{
    // Created variables to store locators
    private By _actualNewOnlineStoreText = By.xpath("//h1[text()='New online store is open!']");
    private String _expectedNewOnlineStoreText = "New online store is open!";
    private By _titleTextInput = By.xpath("//input[@class='enter-comment-title']");
    private By _commentTextInput = By.xpath("//textarea[@class='enter-comment-text']");
    private By _clickOnNewCommentButton = By.xpath("//input[@name='add-comment']");
    private By _actualNewsCommentAssert = By.xpath("//div[text()='News comment is successfully added.']");
    private String _expectedNewsCommentAssert = "News comment is successfully added.";

    public void newOnlineStoreAssert()
    {
        // Use assert method
        Assert.assertEquals(getElement(_actualNewOnlineStoreText), _expectedNewOnlineStoreText,"you are not on news Online page");

    }
    public void newsOnlineStoreDetailInput()
    {       //explicit wait
        waitUntilElementVisible(_titleTextInput,50);

          //reusable method sendkey to send text
        sendkeyElement(_titleTextInput,"xyz");

        //Reusable method to send text for comment
        sendkeyElement(_commentTextInput,"Have a lovely day ");

        //Reusable method to click on comment button
        clickable(_clickOnNewCommentButton);
    }

    public void newsOnlineCommentSentMsgAssert()
    {
          // assert to check if the comment has been sent or not
        Assert.assertEquals(getElement(_actualNewsCommentAssert),_expectedNewsCommentAssert,"Wrong massage");
    }


}
