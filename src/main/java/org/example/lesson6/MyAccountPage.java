package org.example.lesson6;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage extends BaseView {

    public MyAccountPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//li[@class = 'lnk_wishlist']")
    public WebElement wishListButton;

   public void wishListButtonClick() {
       wishListButton.click();
   }
}





