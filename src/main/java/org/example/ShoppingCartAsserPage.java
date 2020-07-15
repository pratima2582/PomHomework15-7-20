package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class ShoppingCartAsserPage extends  UtilClass
{

    //created actual result locator
    private By _actualFirstPriceBookText = (By.xpath("//tbody/tr[1]/td[4]/a"));

    //Created Expected result locator
    private String  _expectedFirstPriceText = "First Prize pies";

    private By _actualPrideAndPrejudiceBookText = (By.xpath("//tbody/tr[2]/td[4]/a"));
    private String  _expectedPriceAndPrejudiceText = "Pride and Prejudice";




    public void bookAssert()
    {
        //Assert to check if the user can see 2 books on shopping cart
        Assert.assertEquals(getElement(_actualFirstPriceBookText),_expectedFirstPriceText);
        Assert.assertEquals(getElement(_actualPrideAndPrejudiceBookText),_expectedPriceAndPrejudiceText);
    }




}
