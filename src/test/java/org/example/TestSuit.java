package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class TestSuit extends BaseTest
{
    //Created objects
    HomePage homepage = new HomePage();
    RegisterPage registerPage = new RegisterPage();
    RegisterSuccessPage registerSuccessPage = new RegisterSuccessPage();
    ComputerPage computerPage = new ComputerPage();
    DesktopPage desktopPage = new DesktopPage();
    DigitalStormPage digitalStormPage = new DigitalStormPage();
    ProductEmailAFriendPage productEmailAFriendPage= new ProductEmailAFriendPage();
    EmailSuccessfulySentPage emailSuccessfulySentPage = new EmailSuccessfulySentPage();
    BookPage bookPage = new BookPage();
    ShoppingCartAsserPage shoppingCartAsserPage = new ShoppingCartAsserPage();
    FaceBookPopupPage faceBookPopupPage = new FaceBookPopupPage();
    NewsOnlineStorePage newsOnlineStorePage = new NewsOnlineStorePage();
    IframeExample iframeExample = new IframeExample();


    @Test (priority = 1)
    public void userShouldBeAbleToRegisterSuccessfully()
    {
        //calling methods by using object
        //homepage verification
        homepage.homePageVerification();

        //calling reg clikable method
        homepage.clickOnRegistrationDetail();

        //created method for reg detail page
        registerPage.userEntersRegistrationDetail();

        //assert page for reg successful
        registerSuccessPage.regSuccessfullMsg();

        //method to click on continue
        registerSuccessPage.clickContinue();


    }
    @Test (priority = 2)
    public void userShouldBeAbleToReferProductToFriend()
    {
        homepage.homePageVerification();

        homepage.clickOnRegistrationDetail();

        registerPage.userEntersRegistrationDetail();
        registerSuccessPage.clickContinue();

            //calling method to click on computer page
        homepage.clickOnComputerButton();

            //calling method to click on Desktop button
        computerPage.clickOnDesktopButton();

        //calling method to click on Digital storm button
        desktopPage.clickDigitalStormButton();

        //calling method to click on email a friend button
        digitalStormPage.clickOnFriendEmailButton();

        //calling method for email a friend detail
        productEmailAFriendPage.enterFriendEmailDetail();

        //calling method for assert to check if the user succefully send a email to friend
        emailSuccessfulySentPage.emailSuccessfullSentAsser();
    }

    @Test
public void verifyEachProductName()
{
    // stored product list locator in product list
    List<WebElement> productList = driver.findElements(By.xpath("//div[@class='product-grid home-page-product-grid']//div[2]/h2/a"));
    System.out.println("products : " + productList.size());
    //Stored add to cart button locators in add to cart variables
    List<WebElement> addToCartButton = driver.findElements(By.xpath("//input[@value='Add to cart']"));
    System.out.println("Add to cart  count : " + addToCartButton.size());

    //
    Assert.assertEquals(addToCartButton.size(),productList.size());


        //getting all list by using for loop
    for (WebElement product : productList)
    {
        System.out.println(product.getText()); //

    }
}

public void menuListHomePage()
    {
       // List<WebElement> menuList = driver.findElements(By.ByXPath(""));


    }

        @Test (priority = 3)
        public void userShouldBeAbleToAddProducts()
        {
            //Homepage verification method
            homepage.homePageVerification();

            //calling method to click on bookpage
            homepage.clickOnBookPageButton();

            bookPage.assertBooks();

            //calling method to add books to cart
            bookPage.bookPageAddToCart();

            //Assert to check if user can see 2 books in shopping cart with massage

            shoppingCartAsserPage.bookAssert();
    }

    @Test
    public void alertWindow()
    {
        homepage.homePageVerification();
        homepage.clickOnSerchButton();   //Calling click on search button method
        homepage.searchAlertWindowAssert(); // calling Assert method

    }

@Test
    public void verifyUserShouldBeAbleToAddDetailOnFaceBookPopupWindow()
    {
        homepage.homePageVerification();
        homepage.faceBookPopupWindow();  //calling facebook clickable method

        //facebook pop window assert
        faceBookPopupPage.verifyFacebookPopUpWindowURL();
    }
@Test
    public void currencySymbolVerification()
    {
           //home page verification
        homepage.homePageVerification();
        //select currancy by dropdown method
        homepage.currancySelectionFromDropdown();

    }

    @Test
    public void verifyUserShoulBeAbleToSendComment()

    {
        // Click on detail button
        homepage.clickOnDetailButton();
        //assert to verify if the user is on new online store
        newsOnlineStorePage.newOnlineStoreAssert();

        //input online store detail
        newsOnlineStorePage.newsOnlineStoreDetailInput();

        // assert to verify the comment has been sent
        newsOnlineStorePage.newsOnlineCommentSentMsgAssert();
    }
    @Test
    public void verifyUserShouldSelectDetailsInIframe()
    {

        iframeExample.setBrowser();


        // verify if the user is on frame example page
        iframeExample.verifyUserIsOnFrameExamplePage();

        //input iframe detail
        iframeExample.frameExampleDetails();
    }


}

