import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

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
        }*/
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        try{
           driver.get("http://127.0.0.1:5500/index_completo.html");

           //driver.findElement(By.id("implicitWaitButton")).click();

            Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
                    .withTimeout(Duration.ofSeconds(10))
                    .pollingEvery(Duration.ofSeconds(2))
                    .ignoring(NoSuchElementException.class);
            WebElement webElement = wait.until(new Function<WebDriver, WebElement>() {
                @Override
                public WebElement apply(WebDriver driver) {
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
    }
}
