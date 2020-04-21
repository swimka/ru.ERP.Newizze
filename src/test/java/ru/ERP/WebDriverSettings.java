package ru.ERP.Newizze;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.util.Random;


public class WebDriverSettings {

    public ChromeDriver driver;
    @Before
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().fullscreen();
        driver.manage().deleteAllCookies();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");

    }
    Random random = new Random();
    int n = random.nextInt(100) +3;




//
//    @After
//    public void close() {
//        driver.quit();
//    }

}