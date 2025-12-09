package login;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.Login;
import pages.SecureArea;

import static org.testng.Assert.assertTrue;


public class LoginTests extends BaseTests {


    @Test
    public void testSuccessfullLogin(){
        Login loginPage = homePage.clickformAuthentication();
        loginPage.setUsername("tomsmith");
        loginPage.setPassword("SuperSecretPassword!");

        var secureArea = loginPage.submit();
        secureArea.getStatusAlertText();
        assertTrue(secureArea.getStatusAlertText().contains("You logged into a secure area!"), "Invalid login!");
    }

    @Test
    public void testInvalidUsername(){
        Login loginPage = homePage.clickformAuthentication();
        loginPage.setUsername("tom");
        loginPage.setPassword("SuperSecretPass");
        var secureArea = loginPage.submit();

        secureArea.getStatusAlertText();
        assertTrue(secureArea.getStatusAlertText().contains("Your username is invalid!"), "Invalid login!");
    }

    @Test
    public void testInvalidPassword(){
        Login loginPage = homePage.clickformAuthentication();
        loginPage.setUsername("tomsmith");
        loginPage.setPassword("SuperSecretPass");
        var secureArea = loginPage.submit();

        secureArea.getStatusAlertText();
        assertTrue(secureArea.getStatusAlertText().contains("Your password is invalid!"), "Invalid login!");
    }
}
