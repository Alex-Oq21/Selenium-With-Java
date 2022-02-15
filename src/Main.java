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
           driver.get("https://www.youtube.com/");
           Thread.sleep(2000);
           driver.findElement(By.xpath("//*[@id=\"content\"]//*[text() = 'Explorar']")).click();
           Thread.sleep(2000);
           String title = driver.getTitle();
            System.out.println(title);
        }catch (InterruptedException e){
            e.printStackTrace();
        }finally {
            driver.quit();
        }
    }
}
