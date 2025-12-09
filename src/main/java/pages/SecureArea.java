package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SecureArea {
    private WebDriver driver;
    private By statusAlert = By.id("flash");


    public SecureArea(WebDriver driver){
        this.driver = driver;
    }

    public String getStatusAlertText(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        WebElement alert =  wait.until(ExpectedConditions.visibilityOfElementLocated(statusAlert));
        return alert.getText();
    }

}
