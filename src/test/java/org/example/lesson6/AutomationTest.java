package org.example.lesson6;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomationTest {
    WebDriver driver;

    @BeforeAll
    static void registerDriver() {
        WebDriverManager.chromedriver().setup();
    }

    @BeforeEach
    void initDriver() {
        driver = new ChromeDriver();
    }

    @Test
    void wishListCreate() {
        driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
        new LoginPage(driver).login("test11@mail.ru", "123456");
        new MyAccountPage(driver).wishListButtonClick();
        new MyWishListsPage(driver).createWishListName();
        new TopSellersMenu(driver).topSellersMenuClick();
        new BestSellers(driver).heartButtonClick();

        Assertions.assertTrue(new SuccessBlock(driver).addedToWishListSight.isDisplayed());

    }

    @AfterEach
    void tearDown() {
        driver.quit();
    }


}
