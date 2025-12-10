package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Home {
    private WebDriver driver;

    public Home(WebDriver driver){
        this.driver = driver;
    }

    public Login clickformAuthentication(){
        clickLink("Form Authentication");
        return new Login(driver);
    }
    public Dropdown clickDropdown(){
        clickLink("Dropdown");
        System.out.println("Dropdown is clicked");
        return new Dropdown(driver);
    }
    private void clickLink(String linkText){
        driver.findElement(By.linkText(linkText));
    }
}
