package com.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DashboardPage {
    WebDriver driver;
    
    By dashboardHeader=By.xpath("//h6[text()='Dashboard']");


    //Constructor
    public DashboardPage(WebDriver driver){
        this.driver=driver;
    }
    
    public boolean isDashboardHeaderDisplayed()
{
    return driver.findElement(dashboardHeader).isDisplayed();
}
}
