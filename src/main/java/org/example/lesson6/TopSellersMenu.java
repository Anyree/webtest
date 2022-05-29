package org.example.lesson6;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TopSellersMenu extends BaseView {
    public TopSellersMenu(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//a[@title = 'View a top sellers products']")
    public WebElement topSellers;

    public void topSellersMenuClick() {
        topSellers.click();
    }
}
