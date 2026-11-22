package com.example;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class base {
 protected  WebDriver driver;
public void Setup(){ 
driver = new ChromeDriver();
  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        System.out.println(" Page Title:"+driver.getTitle());
}
public void TearDown(){  
    if(driver!=null){
    driver.quit();  
    }
} 

}