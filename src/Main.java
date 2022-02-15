import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.sql.Driver;
import java.util.concurrent.TimeUnit;

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
           driver.get("/index_completo.html");

           driver.findElement(By.id("explicitWaitButton")).click();
            Thread.sleep(4000);

        }catch (InterruptedException e){
            e.printStackTrace();
        }finally {
            driver.quit();
        }
    }
}
