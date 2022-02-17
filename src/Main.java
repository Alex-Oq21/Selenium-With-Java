import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.*;

import java.io.IOException;
import java.sql.Driver;
import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

       /* try{
            driver.get("https://www.youtube.com/");

            Thread.sleep(5000);
            String title = driver.getTitle();
            System.out.println(title);
        }catch (InterruptedException e){
            e.printStackTrace();
        }finally {
            driver.quit();
        }
        //--------------------------------------------------------------------
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        try{
           driver.get("http://127.0.0.1:5500/index_completo.html");

           //driver.findElement(By.id("implicitWaitButton")).click();
          Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
                  .withTimeout(Duration.ofSeconds(10))
                  .pollingEvery(Duration.ofSeconds(3))
                  .ignoring(NoSuchElementException.class);
          WebElement webElement = wait.until(new Function<WebDriver, WebElement>() {
              @Override
              public WebElement apply(WebDriver webDriver) {
                  return driver.findElement(By.id("implicitWaitButton"));
              }
          });
            webElement.click();
            Thread.sleep(4000);

        }catch (InterruptedException e){
            e.printStackTrace();
        }finally {
            driver.quit();
        }

        */
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        try{
            driver.get("http://127.0.0.1:5500/index_completo.html");

            //WebDriverWait driverWait = new WebDriverWait(driver, 10);
            WebElement webElement = new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.id("explicitWaitButton")));
            webElement.click();
            Thread.sleep(4000);

        }catch (InterruptedException e){
            e.printStackTrace();
        }finally {
            driver.quit();
        }
    }
}
