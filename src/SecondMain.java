import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SecondMain {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        try{
            driver.get("http://127.0.0.1:5500/index_completo.html");
            Select comboBoxSimple = new Select(driver.findElement(By.xpath("//*[@id=\"combobox1\"]")));
            comboBoxSimple.selectByIndex(2);

            Select comboBoxMultiple = new Select(driver.findElement(By.xpath("//*[@id=\"combobox2\"]")));
            comboBoxMultiple.selectByIndex(0);
            comboBoxMultiple.selectByIndex(1);
            comboBoxMultiple.selectByIndex(2);
            Thread.sleep(2000);
            comboBoxMultiple.deselectByIndex(1);


            WebElement bottom = driver.findElement(By.id("enviaCheckboxes"));
            bottom.click();
            Thread.sleep(5000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }finally {
            driver.quit();
        }
    }
}
