package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class BlueRentalLoginPage {

    public BlueRentalLoginPage() {

        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy(id = "formBasicEmail")
    public WebElement email;

    @FindBy(id = "formBasicPassword")
    public WebElement password;

    @FindBy(xpath = "//button[.=' Login']")
    public WebElement loginButton;


}