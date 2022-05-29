package org.example.lesson6;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyWishListsPage extends BaseView {
    public MyWishListsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "name")
    public WebElement wishListName;

    @FindBy(id = "submitWishlist")
    public WebElement saveButton;

    public void createWishListName() {
        wishListName.sendKeys("Test");
        saveButton.click();
    }
}
