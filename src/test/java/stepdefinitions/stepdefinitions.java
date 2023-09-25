package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pages.RegisterPage;
import utilities.Driver;

import static utilities.ReusableMethods.bekle;

public class stepdefinitions {

    RegisterPage register=new RegisterPage();
    Faker fake=new Faker();

    @Given("User {string} sayfasina gider")
    public void user_sayfasina_gider() {
        Driver.getDriver().get("https://grinara.de/");

    }
    @When("User account sekmesine tiklar")
    public void user_account_sekmesine_tiklar() {
        register.accountButton.click();
        bekle(2);

    }
    @When("User register sekmesine tiklar")
    public void user_register_sekmesine_tiklar() {
        register.register_Enter.click();
        bekle(2);
    }
    @When("User mail adresini girer")
    public void user_mail_adresini_girer() {
        register.register_Email.sendKeys(fake.internet().emailAddress());
        bekle(2);
    }
    @When("User register butonuna basar")
    public void user_register_butonuna_basar() {
        register.register_Button.click();
        bekle(2);
    }




}
