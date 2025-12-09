package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class BaseTests {
    private WebDriver driver ;

    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com");
        System.out.println(driver.getTitle());
//        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
//        driver.manage().window().fullscreen();

      WebElement inputLinks = driver.findElement(new By.ByLinkText("Shifting Content"));
      inputLinks.click();
      WebElement shiftingContent = driver.findElement(new By.ByLinkText("Example 1: Menu Element"));
      shiftingContent.click();
      List<WebElement> shiftingMenu = driver.findElements(new By.ByTagName("a"));
      System.out.println(shiftingMenu.size());


        driver.quit();
    }

    public String clickLinks(String link){
        driver.findElement(new By.ByLinkText(link));
        return link;
    }

    public static  void main() {
        BaseTests tests = new BaseTests();
        tests.setUp();
    }
}
