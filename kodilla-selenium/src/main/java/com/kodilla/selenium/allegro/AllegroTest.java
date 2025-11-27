import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class AllegroTest {
    public static void main(String[] args) throws InterruptedException {
        ChromeOptions chromeOptions = new ChromeOptions();
        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.get("https://allegro.pl/");


        WebElement searchField = driver.findElement(By.cssSelector("input[name='string']"));
        searchField.sendKeys("Mavic mini");


        WebElement scopeSelect = driver.findElement(By.cssSelector("select[data-role='search-scope-select']"));
        Select select = new Select(scopeSelect);
        select.selectByVisibleText("Elektronika");


        searchField.submit();
    }
}