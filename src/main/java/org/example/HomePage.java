package org.example;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class HomePage extends UtilClass {

    //text link to verify if user is on homepage or not
    private By _verifytext = (By.xpath("//h2[text()=\"Welcome to our store\"]"));
    //Expected result
    private String _expectedText = "Welcome to our store";
    //click on register button method
    private By _registrationButton = By.xpath("//a[text()=\"Register\"]");


    //Clickon computer method
    private By _clickOnComputer = By.xpath("//a[text()=\"Computers \"]");

    //click on books option
    private By _bookButton = By.linkText("Books");
    //Search button variable locator
    private By _clickOnSearchButton = By.xpath("//input[@type='submit']");

    // Assert for search botton alert
    String expectedSearchAlert = "Please enter some search keyword";
    //String actualSearchAlert =

    private By _facebookPopup = By.xpath("//a[text()='Facebook']");

    //currency variable locators
    private By _currancySelector = By.xpath("//select[@id='customerCurrency']");

    // News Online Store locators
    private By _detailButton = By.xpath("//div[@class='news-items']//div[1]//div[3]//a");





    //text link to verify if user is on Desktop Page or not
    public void homePageVerification() {
        Assert.assertEquals(getElement(_verifytext), _expectedText, "you are not on hp");
    }

    public void clickOnRegistrationDetail() {
        clickable(_registrationButton);
        waitUntilElementIsClickable(_registrationButton, 400);
    }

    public void clickOnComputerButton() {

        clickable(_clickOnComputer);
        waitUntilElementIsClickable(_clickOnComputer, 400);
    }

    public void clickOnBookPageButton() {
        //explicit wait
        waitUntilElementIsClickable(_bookButton, 400);
        //click on book by reusable method
        clickable(_bookButton);

    }

    public void clickOnSerchButton() {
        clickable(_clickOnSearchButton);
    }

    public void searchAlertWindowAssert() {
          // Created a alert object
        Alert alert = driver.switchTo().alert();

        // Save text in actualtext variable
        String actualAlertText = alert.getText();

        //Printing out actual text
        System.out.println(actualAlertText);

        // Expected result
        String expectedAlertText = "Please enter some search keyword";

        //assert to check if user is on alert window
        Assert.assertEquals(actualAlertText, expectedAlertText, "Result not matching");

        //used inbuilt method accept
        alert.accept();
    }

    public void faceBookPopupWindow() {
          // Reusable method to click on facebook
        clickable(_facebookPopup);
    }

    public void currancySelectionFromDropdown() {
            // selecting Euro by using reusable method
        selectFromDropDownByVisibleText(_currancySelector,"Euro");

          // saved product list size in variable
        List<WebElement> productList = driver.findElements(By.xpath("//div[@class='product-grid home-page-product-grid']//div[2]/h2/a"));

            // saved prices list in variable
        List<WebElement> priceSelector = driver.findElements(By.xpath("//div[@class='item-grid']//div[@class='prices']"));

            // Assert if the price list index is same as product list index
        Assert.assertEquals(productList.size(),priceSelector.size());

             // use for loop
        for (WebElement currency : priceSelector)
        {
            System.out.println(currency.getText()); //get currancy text

        }
    }

    public void clickOnDetailButton()
    {
        //Reusable method to click on detail button
       clickable(_detailButton);

    }
}

