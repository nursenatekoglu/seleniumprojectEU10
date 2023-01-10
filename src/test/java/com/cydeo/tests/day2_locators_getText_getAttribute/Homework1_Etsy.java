package com.cydeo.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homework1_Etsy {

    public static void main(String[] args) {

        //TC #1: Etsy Title Verification

        //1. Open Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        //2. Go to https://www.etsy.com
        driver.get("https://www.etsy.com");

        //for cookies
        driver.findElement(By.xpath("//button[@class = 'wt-btn wt-btn--filled wt-mb-xs-0']")).click();

        //3. Search for “wooden spoon”
        WebElement etsySearchBox = driver. findElement(By.name("search_query"));
        etsySearchBox.sendKeys("wooden spoon" + Keys.ENTER);

        //4. Verify title:
        //Expected: “Wooden spoon | Etsy”
        String expectedInTitle = "Wooden spoon - Etsy UK";
        String actualTitle = driver.getTitle();

        if (expectedInTitle.equals(actualTitle)){
            System.out.println("title verification is PASSED");
        }else{
            System.out.println("title verification is FAILED");
        }





    }

}
