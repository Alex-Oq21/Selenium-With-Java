import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) {
        //System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        try {
            driver.get("https://www.youtube.com/");

            Thread.sleep(5000);
            
            String title = driver.getTitle();
            System.out.println(title);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            driver.quit();
        }


    }
}
