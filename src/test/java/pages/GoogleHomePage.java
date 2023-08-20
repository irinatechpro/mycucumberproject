package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.w3c.dom.html.HTMLInputElement;
import utilities.Driver;

public class GoogleHomePage {
    public GoogleHomePage()
    {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(name = "q")
    public WebElement searchBox;
    @FindBy(id = "L2AGLb")
    public WebElement acceptCookies;

}
