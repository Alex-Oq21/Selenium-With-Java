package testcases;

import junit.framework.Assert;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase {
    WebDriver driver;
    private String expectedTitle = "Selenium";
    @Before
    public void SetUp(){
        driver = new ChromeDriver();
    }

    @Test
    public void SeleniumTitleOnWikipedia(){

        try {
            driver.get("https://es.wikipedia.org/wiki/Wikipedia:Portada");
            WebElement inputText = driver.findElement(By.xpath("//*[@id=\"searchInput\"]"));
            inputText.sendKeys("Selenium");
            Thread.sleep(2000);
            WebElement searchBottom = driver.findElement(By.xpath("//*[@id=\"searchButton\"]"));
            searchBottom.click();
            WebElement titleElement = driver.findElement(By.xpath("//*[@id=\"firstHeading\"]"));
            String title = titleElement.getText();
            Assert.assertEquals(expectedTitle, title);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    
    @After
    public void ShutDown(){
        driver.quit();
    }
}
