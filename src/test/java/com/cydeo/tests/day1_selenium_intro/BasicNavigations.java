package com.cydeo.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigations {

    public static void main(String[] args) throws InterruptedException {

        //1-Setting up the web driver manager
        WebDriverManager.chromedriver().setup();

        //2-Create instance of the Selenium Web Driver
        //This the line opening an empty browser
        WebDriver driver = new ChromeDriver();

        //3- Go to "https://www.tesla.com"
        driver.get("https://www.tesla.com");

        //Get the current URL using selenium
        String currentURL = driver.getCurrentUrl();
        System.out.println("currentURL = " + currentURL);

        //stop the code execution for 3 seconds
        Thread.sleep(3000);

        // use selenium to navigate back
        driver.navigate().back();

        //stop the code execution for 3 seconds
        Thread.sleep(3000);

        // use selenium to navigate forward
        driver.navigate().forward();

        //stop the code execution for 3 seconds
        Thread.sleep(3000);

        // use selenium to navigate refresh
        driver.navigate().refresh();


        Thread.sleep(3000);

        // use navigate().to()  method
        driver.navigate().to("https://www.google.com");

        //get the title of the page
        System.out.println("driver.getTitle() = " + driver.getTitle());
        String currentTitle= driver.getTitle();

        //Get the current URL using selenium
        currentURL = driver.getCurrentUrl();
        System.out.println("currentURL = " + currentURL);


    }




}
