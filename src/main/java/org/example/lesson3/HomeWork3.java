package org.example.lesson3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeWork3 {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        driver.get("http://automationpractice.com/index.php");

        driver.findElement(By.xpath("//*[@class = 'login']")).click();
        driver.findElement(By.id("email")).sendKeys("test11@mail.ru");
        driver.findElement(By.id("passwd")).sendKeys("123456");
        driver.findElement(By.xpath("//button[@class = 'button btn btn-default button-medium']")).click();
        driver.findElement(By.xpath("//li[@class = 'lnk_wishlist']")).click();
        driver.findElement(By.id("name")).sendKeys("Test");
        driver.findElement(By.id("submitWishlist")).click();
        driver.findElement(By.xpath("//a[@title = 'View a top sellers products']")).click();
        driver.findElement(By.xpath("//a[@class = 'addToWishlist wishlistProd_7']")).click();
        Thread.sleep(10000);
        driver.quit();
    }
}
