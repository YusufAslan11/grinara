package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class RegisterPage {
    public RegisterPage() {
        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy(linkText = "https://grinara.de/my-account/")
    public WebElement accountButton;

    @FindBy(className = "btn wd-switch-to-register")
    public WebElement register_Enter;
    @FindBy(id = "reg_email")
    public WebElement register_Email;

    @FindBy(xpath = "//button[@value=\"Registrieren\"]")
    public WebElement register_Button;

}
