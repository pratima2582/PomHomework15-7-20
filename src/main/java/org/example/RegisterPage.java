package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

         //Inheritance class
public class RegisterPage extends UtilClass
{
    // private variables to store locators
    private By _actualText = By.xpath("//h1[text()=\"Register\"]");
    private String  _expectedText = "Register";

    private By _genderButton = By.xpath("//input[@id ='gender-female']");
    private By _firstName = By.xpath("//input[@name='FirstName']");
    private By _lastName = By.xpath("//input[@name=\"LastName\"]");
    private By _dateOfBirth = By.xpath("//select[@name=\"DateOfBirthDay\"]");
    private By _monthOfBirth  = By.xpath("//select[@name=\"DateOfBirthMonth\"]");
    private By _yearOfBirth = By.xpath("//select[@name=\"DateOfBirthYear\"]");

    private By _emailAddress = By.xpath("//input[@id='Email']");
    private By _companyName = By.xpath("//input[@name='Company']");
    private By _uncheckBox = By.xpath("//input[@type=\"checkbox\"]");
    private By _password = By.xpath("//input[@id=\"Password\"]");
    private By _confPassword = By.xpath("//input[@id=\"ConfirmPassword\"]");
    private By _clickOnRegButton = By.xpath("//input[@name=\"register-button\"]");




    public void registrationPageVerification()
    {
       //waitUntilElementVisible(_actualText,20);
        Assert.assertEquals(_actualText,_expectedText,"You are not on Registration page");
    }

    public void userEntersRegistrationDetail() {
        //waitUntilElementIsClickable(_genderButton,10);
        clickable(_genderButton);

        //waitUntilElementVisible(_firstName,40);

        //reusable method to input name
    sendkeyElement(_firstName,"Pratima");

        //reusable method to input name
    sendkeyElement(_lastName,"Patel");

        //reusable method to select item from dropdown
    selectFromDropDownByIndex(_dateOfBirth,6);
    selectFromDropDownByText(_monthOfBirth,"July");
    selectFromDropDownByValue(_yearOfBirth,"2000");

    //use inbuilt timestamp method to save email
    String time = "test+"+timeStamp()+"@gmail.com";

    //reusable method to input email
    sendkeyElement(_emailAddress,time);

    //Reusable method(sendkey) to input company name
    sendkeyElement(_companyName,"ABC ltd");

    //Reusable method to click on uncheckbox
    clickable(_uncheckBox);

    //Reusable method- to input password
    sendkeyElement(_password,"abc1234");
    sendkeyElement(_confPassword,"abc1234");

    //Explicit wait
    waitUntilElementIsClickable(_clickOnRegButton,400);

    //reusable method to click on reg button
    clickable(_clickOnRegButton);

   // waitUntilElementIsClickable(_clickOnRegButton,400);

    }

}
