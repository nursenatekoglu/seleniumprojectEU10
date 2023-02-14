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

        // This line will maximize the browser size
        driver.manage().window().maximize();

       // driver.manage().window().fullscreen(); - (sometime doesn't work for windows)

        //3- Go to "https://www.tesla.com"
        driver.get("https://www.tesla.com");

        //-------------------------------------------------------------

        String currentTitle= driver.getTitle();
        System.out.println("driver.getTitle() = " + driver.getTitle());

        //Get the current URL using selenium
        String currentURL = driver.getCurrentUrl();
        System.out.println("currentURL = " + currentURL);

        //---------------------------------------------------------------

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

        //----------------------------------------------------------------


        //get the title of the page
       currentTitle= driver.getTitle();
        System.out.println("driver.getTitle() = " + driver.getTitle());

        //Get the current URL using selenium
        currentURL = driver.getCurrentUrl();
        System.out.println("currentURL = " + currentURL);


        //this will close the currently opened window
        driver.close();

        // this will close all of the open windows. (kills the current session)
        driver.quit();




    }


}
