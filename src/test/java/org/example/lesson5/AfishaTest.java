package org.example.lesson5;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class AfishaTest {
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
        driver.get("https://afisha.ru");
    }

    @Test
    void likeFilmTest() {

        List<WebElement> filmsList = driver.findElements(By.xpath("//a[@data-test='LINK ITEM-NAME ITEM-URL' and contains(@href, 'movie')]"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", filmsList.stream().filter(f -> f.getText().contains("Бука")).findFirst().get());
        filmsList.stream().filter(f -> f.getText().contains("Бука")).findFirst().get().click();
    }

    @AfterEach
    void tearDown() {
        driver.quit();
    }
}
