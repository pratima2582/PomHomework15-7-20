package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class BookPage extends UtilClass
{
    //Assert to check if user is on Book page or not
    private By _actualBookPage = (By.xpath("//h1[text()='Books']"));

    //expected result
    private String  _expectedBookPage = "Books";


    //click on firstprizepies add to cart button locator
    private By _firstprizeAddToCartButton = By.xpath("//input[contains(@onclick,'38/1/1')]");


    //click on pride and prejudice add to cart button locator
    private By _prideAndPrejudiceAddToCartButton = By.xpath("//input[contains(@onclick,'39/1/1')]");

    //click on green bar cross button
    private By _crossBarButton = By.xpath("//span[@title='Close']");

    // click on shopping cart button
    private By _shoppingCartButton = By.xpath("//span[@class='cart-label']");

    public void assertBooks()
    {
        //assert to check if the user is on book page
        Assert.assertEquals(getElement(_actualBookPage), _expectedBookPage);

    }



    public void bookPageAddToCart ()
    {
        waitUntilElementIsClickable(_firstprizeAddToCartButton,250);
        //reusable method use to click on element
        clickable(_firstprizeAddToCartButton);

        //Put explicit wait
        waitUntilElementIsClickable(_prideAndPrejudiceAddToCartButton, 400);

        //clicking on prize book button by using reusable method
        clickable(_prideAndPrejudiceAddToCartButton);

        waitUntilElementIsClickable(_crossBarButton,250);
        //clicking on green cross button by using reusable method
        clickable(_crossBarButton);

        // Put Explicit wait
        waitUntilElementIsClickable(_shoppingCartButton, 200);

        //clicking on Shopping cart button by using reusable method
        clickable(_shoppingCartButton);

    }




}




