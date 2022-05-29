package org.example.lesson6;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BestSellers extends BaseView {
    public BestSellers(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//a[@class = 'addToWishlist wishlistProd_7']")
    public WebElement heartButton;

    public void heartButtonClick() {
        heartButton.click();
    }
}
