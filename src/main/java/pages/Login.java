package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login {
    private WebDriver driver;
    private By usernameField = By.id("username");
    private By passwordField = By.id("password");
    private By submitButton = By.cssSelector("#login button");




    public Login(WebDriver driver) {
        this.driver = driver;
    }

    public void setUsername(String username){
        driver.findElement(usernameField).sendKeys(username);
    }
    public void setPassword(String password){
        driver.findElement(passwordField).sendKeys(password);
    }

    public SecureArea submit(){
        driver.findElement(submitButton).click();
        System.out.println("Submitted");
        return new SecureArea(driver);
    }

}
