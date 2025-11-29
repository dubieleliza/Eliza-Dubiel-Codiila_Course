package com.kodilla.selenium.allegro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class AllegroTest {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        try {
            driver.manage().window().maximize();
            driver.get("https://allegro.pl/");

            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

            WebElement searchField = driver.findElement(By.cssSelector("input[name='string']"));
            searchField.sendKeys("Mavic mini");

            WebElement scopeSelect = driver.findElement(By.cssSelector("select[data-role='search-scope-select']"));
            Select select = new Select(scopeSelect);
            select.selectByVisibleText("Elektronika");

            searchField.submit();

            wait.until(ExpectedConditions.visibilityOfElementLocated(
                    By.cssSelector("section article")
            ));

            List<WebElement> productCards = driver.findElements(By.cssSelector("section > article"));

            System.out.println("Znaleziono produktów: " + productCards.size());

            for (WebElement product : productCards) {
                System.out.println("----------------------------------");
                System.out.println(product.getText());
            }

        } finally {
            driver.quit();
        }
    }
}
