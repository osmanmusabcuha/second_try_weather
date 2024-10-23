//package org.example;
//
//import com.gargoylesoftware.htmlunit.WebClient;
//import com.gargoylesoftware.htmlunit.html.*;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import java.util.List;
//
////TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
//// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
//public class Main {
//    public static void main(String[] args) throws InterruptedException {
//        WebDriver driver = new ChromeDriver();
//        System.setProperty("webdriver.chrome.driver", "C:\\Users\\osman\\seleniumdrivers\\chrome-driver\\chromedriver-win64\\chromedriver.exe");
//        driver.get("https://meteostat.net/en/place/tr/istanbul?s=17060&t=2024-10-09/2024-10-11");
//        driver.manage().window().maximize();
//        Thread.sleep(3000);
//        WebElement date_button = driver.findElement(By.xpath("//button[@class='btn btn-light px-4 px-md-3']"));
//        date_button.click();
//        WebElement today = driver.findElement(By.xpath("//span[@aria-label='Thursday, October 10, 2024']"));
//        today.click();
//        today.click();
//        WebElement details_button = driver.findElement(By.xpath("//button[@class='btn btn-light me-1']"));
//        details_button.click();
//
//
//
//
//
//
//    }
//}