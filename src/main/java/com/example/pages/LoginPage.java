
package com.example.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    WebDriver driver;
    // Locators
    By userName =By.name("username");
    By userPassword =By.name("password");
    By loginButtonClick = By.xpath("//button[@type='submit']");
     // Constructor

    public LoginPage(WebDriver driver) {  
        this.driver = driver;
    }
    // Enter Username

    public void EnterUserName(String name) {
        driver.findElement(userName).sendKeys(name);
    }

    // Enter Password
    public void EnterPassword(String Pass) {
        driver.findElement(userPassword).sendKeys(Pass);
    }
    public void clickLogin()
    {
        driver.findElement(loginButtonClick).click();
    }
    //completeLogin
    public void FinalLogin(String name ,String Pass )
    {
        EnterUserName("Admin");
        EnterPassword("admin123");
        clickLogin();
    }
}
