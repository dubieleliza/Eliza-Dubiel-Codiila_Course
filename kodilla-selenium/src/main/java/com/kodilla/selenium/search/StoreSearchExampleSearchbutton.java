import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StoreSearchExampleSearchbutton {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();                	// [2]
        driver.get("https://kodilla.com/pl/test/store");                 	// [3]

        WebElement inputField = driver.findElement(By.name("search")); // [4]
        inputField.sendKeys("School");
        inputField.submit();
    }
}