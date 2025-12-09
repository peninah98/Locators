package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Home {
    WebDriver driver;
    private By formAuthentication = By.linkText("Form Authentication");

    public Home(WebDriver driver){
        this.driver = driver;
    }


    public Login clickformAuthentication(){
        driver.findElement(formAuthentication).click();
        return new Login(driver);

    }
}
