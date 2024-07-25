package tests;

import managers.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.*;

import java.net.MalformedURLException;

public class SearchStringTest extends DriverManager {
    private WebElement searchElement;

    @Parameters("browser")
    @BeforeClass
    void beforeClass(@Optional("browser") String browser) throws MalformedURLException {
        setDriver(browser);
    }

    @Test
    void searchNumTest1() throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/");
        Thread.sleep(2000);
        driver.findElement(By.linkText("Inputs")).click();
        driver.findElement(By.cssSelector("#content > div > div > div > input[type=number]")).sendKeys("3");
    }

    @Test
    void searchNumTest2() throws InterruptedException {
        driver.get("https://www.udemy.com/");
        Thread.sleep(2000);
        driver.findElements(By.tagName("input")).get(1).click();
        driver.findElements(By.tagName("input")).get(1).sendKeys("tester");
        driver.findElements(By.tagName("input")).get(1).sendKeys(Keys.ENTER);
        Thread.sleep(5000);
    }

    @AfterClass
    void afterClass() {
        driver.quit();
    }
}
