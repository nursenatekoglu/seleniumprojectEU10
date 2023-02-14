package com.cydeo.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homework6_FacebookTask2 {

    public static void main(String[] args) throws InterruptedException {

        //TC #2: Facebook incorrect login title verification

        //1. Open Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        //2. Go to https://www.facebook.com
        driver.get("https://www.facebook.com ");

        //for cookies
        // css:   //tagName[@attribute='value']
        driver.findElement(By.xpath("//button[@class='_42ft _4jy0 _9xo7 _4jy3 _4jy1 selected _51sy']")).click();

        //3. Enter incorrect username
        WebElement userNameInput = driver.findElement(By.id("email"));
        userNameInput.sendKeys("juice@");

        //4. Enter incorrect password
        WebElement passwordInput = driver.findElement(By.id("pass"));
        passwordInput.sendKeys("apple" + Keys.ENTER);

        Thread.sleep(4000);

        //5. Verify title changed to:
        //Expected: “Log in to Facebook”
        String expectedTitle = "Facebook'a Giriş Yap";
        String actualTitle = driver.getTitle();

        System.out.println(actualTitle);



        if (expectedTitle.equals(actualTitle)){
            System.out.println("title verification is PASSED");
        }else{
            System.out.println("title verification is FAILED");
        }




    }
}
