package com.TestData;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import sun.plugin2.message.JavaScriptBaseMessage;

public class happybirtday {


    public static void main(String[] args)throws Exception{

        System.setProperty("webdriver.chrome.driver", "E:\\sw\\Homework1\\demoappiumcom\\Driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        Thread.sleep(2000);
        String url ="https://www.flipkart.com";
        driver.get(url);
        Thread.sleep(5000);
        driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
        Thread.sleep(2000);
        WebElement search = driver.findElement(By.xpath("//input[@placeholder='Search for products, brands and more']"));
        search.sendKeys("iphone");
        Thread.sleep(2000);
        WebElement Enter = driver.findElement(By.xpath("//button[@class='vh79eN']//*[local-name()='svg']"));
        Enter.click();
        Thread.sleep(5000);

        JavascriptExecutor js = (JavascriptExecutor) driver; // Scroll page
        js.executeScript("window.scrollBy(0,300)");
        Thread.sleep(3000);
        System.out.println("Scroll");

//        driver.findElement(By.xpath("//div[@class='gl5Kwg']")).click();
//        Thread.sleep(3000);

        Select droupdown = new Select(driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/section[2]/div[4]/div[3]/select[1]")));
        droupdown.selectByValue("20000"); // droupdown box change value of amount

        Thread.sleep(5000);
        driver.quit();


    }
}
