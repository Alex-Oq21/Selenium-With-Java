import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.sql.Driver;

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

        try{
           driver.get("https://es.wikipedia.org/wiki/Wikipedia:Portada");
           Thread.sleep(2000);
           String content = driver.findElement(By.cssSelector("#main-tfa > p:nth-child(5)")).getText();

            System.out.println(content);
        }catch (InterruptedException e){
            e.printStackTrace();
        }finally {
            driver.quit();
        }
    }
}
