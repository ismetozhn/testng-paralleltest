package tests;

import managers.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.*;
import pages.HomePage;

import java.net.MalformedURLException;

public class SearchNumberTest extends DriverManager {
    //public WebDriver driver;
    HomePage homePage = new HomePage();
    @Parameters("browser")
    @BeforeClass
    void beforeClass(@Optional("browser") String browser) throws MalformedURLException {
        setDriver(browser);
    }

    @Test
    void searchNumTest2() throws InterruptedException {
        driver.get("https://www.udemy.com/");
        Thread.sleep(2000);
        driver.findElements(By.tagName("input")).get(1).click();
        driver.findElements(By.tagName("input")).get(1).sendKeys("tester");
        driver.findElements(By.tagName("input")).get(1).sendKeys(Keys.ENTER);
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"udemy\"]/div[1]/div[1]/div[3]/div[2]/form/button")).click();

    }

    @Test
    void searchNumTest3() throws InterruptedException {
        homePage.searchByKeyword(driver, "cloud");
    }

    @Test
    void searchNumTest4() throws InterruptedException {
        homePage.searchByKeyword(driver, "fullstack");
    }


}
