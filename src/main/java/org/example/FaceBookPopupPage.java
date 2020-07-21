package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

import java.util.Iterator;
import java.util.Set;

public class FaceBookPopupPage extends UtilClass
{
    private String expectedFaceBookUrl = "https://www.facebook.com/nopCommerce";

    //variable for createPage expected and actual
    private By _actualCreatePage = By.xpath("//button[@class='_4jy0 _4jy3 _4jy2 _51sy selected _42ft']");
    private String _expectedCreatePage = "Create a Page";



    //create a page color variable  expected and actual
  private String expectedColorValue = "rgba(66, 183, 42, 1)";
  private String actualColorValue = "rgba(66, 183, 42, 1)";


    public void verifyFacebookPopUpWindowURL ()
    {
            //created main window handelling variable
        String MainWindow=driver.getWindowHandle();

        // To handle all new opened window.
        Set<String> s1=driver.getWindowHandles();
        Iterator<String> i1=s1.iterator();

        while(i1.hasNext())  //using while loop for
        {
            String ChildWindow=i1.next();

            if(!MainWindow.equalsIgnoreCase(ChildWindow))
            {

                // Switching to Child window
                driver.switchTo().window(ChildWindow);

                //get url for facebook page
                 String facebookURL=  driver.getCurrentUrl();

                // Facebook page assert
                Assert.assertEquals(facebookURL,expectedFaceBookUrl);

                    //create a page button verification
                Assert.assertEquals(getElement(_actualCreatePage),_expectedCreatePage,"Create a page button doesnt appear");

                //checking color of text
                String getColor = driver.findElement(_actualCreatePage).getCssValue(("background-color"));
                System.out.println(getColor);

                //
                Assert.assertEquals(actualColorValue,expectedColorValue,"the color of element is not the same");
                    takeSnapShot("facebook");
                // Closing the Child Window.
                driver.close();
            }
        }
        // Switching to Parent window i.e Main Window.
        driver.switchTo().window(MainWindow);

    }

}
