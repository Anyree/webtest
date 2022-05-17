package org.example.lesson5;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomeWork5 {
    WebDriver driver;
    WebDriverWait webDriverWait;

    @BeforeAll
    static void registerDrive() {
        WebDriverManager.chromedriver().setup();
    }

    @BeforeEach
    void initDiver() {
        driver = new ChromeDriver();
        webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(5));
        driver.get("http://automationpractice.com/index.php");
    }

    @Test
    void wishListTest () {
        driver.findElement(By.xpath("//*[@class = 'login']")).click();
        driver.findElement(By.id("email")).sendKeys("test11@mail.ru");
        driver.findElement(By.id("passwd")).sendKeys("123456");
        driver.findElement(By.xpath("//button[@class = 'button btn btn-default button-medium']")).click();
        driver.findElement(By.xpath("//li[@class = 'lnk_wishlist']")).click();
        driver.findElement(By.id("name")).sendKeys("Test");
        driver.findElement(By.id("submitWishlist")).click();
        driver.findElement(By.xpath("//a[@title = 'View a top sellers products']")).click();
        driver.findElement(By.xpath("//a[@class = 'addToWishlist wishlistProd_7']")).click();

        webDriverWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class = 'fancybox-skin']")));
        Assertions.assertEquals(driver.findElement(By.xpath("//div[@class = 'fancybox-skin']")).isDisplayed(),true);
    }

    @AfterEach
    void tearDown() {
        driver.quit();
    }

}
