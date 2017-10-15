package selenium.simple;



import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOfElementLocated;

/**
 * @author Jose Benitez
 */

public class LoginTest {

    protected WebDriverWait wait;



    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void loginLotto() throws InterruptedException {


        String url = "https://www16.test.lottoland.ie";
        WebElement element;

        System.setProperty("webdriver.chrome.driver", "/Users/jobe/selenium/resources/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.findElements(By.cssSelector(".t-showLogin")).get(0).click();

        element = driver.findElement(By.id("loginOverlay-loginForm-username-input"));
        element.sendKeys("jobe@gmail.com");
        element = driver.findElement(By.id("loginOverlay-loginForm-password-input"));
        element.sendKeys("123456");

        driver.findElement(By.id("loginOverlay-loginForm-submit")).click();




/*
        try {
            wait.until(visibilityOfElementLocated(By.cssSelector(".t-showLogin loginLink")));
            driver.findElement(By.cssSelector(".t-showLogin loginLink")).click();
        } catch (Exception e) {

            driver.quit();
            throw new RuntimeException(e);
        }
*/




      //  driver.quit();


    }

}



