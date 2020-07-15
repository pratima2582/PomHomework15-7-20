package org.example;

import org.testng.annotations.Test;

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
}
