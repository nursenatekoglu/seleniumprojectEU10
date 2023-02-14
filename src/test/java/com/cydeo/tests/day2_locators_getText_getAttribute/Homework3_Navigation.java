package com.cydeo.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homework3_Navigation {

    public static void main(String[] args) {

        //TC #3: Back and forth navigation

        //1- Open a chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //2- Go to: https://google.com
        driver.get("https://google.com");

        //for cookies
        // css:   //tagName[@attribute='value']
        driver.findElement(By.xpath("//div[@class='QS5gu sy4vM']")).click();

        //3- Click to Gmail from top right
        driver.findElement(By.linkText("Gmail")).click();


        //4- Verify title contains:
        //  Expected: Gmail
        String expectedTitle1 = "Gmail";
        String actualTitle1 = driver.getTitle();

        if (expectedTitle1.equals(actualTitle1)){
            System.out.println("title verification is PASSED");
        }else {
            System.out.println("title verification is FAILED");
        }


        //5- Go back to Google by using the .back();
        driver.navigate().back();

        //6- Verify title equals:
        //  Expected: Google
        String expectedTitle2= "Google";
        String actualTitle2 = driver.getTitle();

        if (expectedTitle2.equals(actualTitle2)){
            System.out.println("title verification is PASSED");
        }else {
            System.out.println("title verification is FAILED");
        }

    }
}
