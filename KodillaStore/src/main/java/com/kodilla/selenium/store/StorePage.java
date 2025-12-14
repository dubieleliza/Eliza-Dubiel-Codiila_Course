package com.kodilla.selenium.store;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class StorePage {
    private WebDriver driver;

    public StorePage(WebDriver driver) {
        this.driver = driver;
        driver.get("https://kodilla.com/pl/test/store");
    }

    public void searchFor(String text) {
        WebElement searchField = driver.findElement(By.id("searchField"));
        searchField.clear();
        searchField.sendKeys(text);
        searchField.sendKeys(Keys.ENTER); // zamiast submit()
    }

    public int getResultsCount() {
        List<WebElement> results = driver.findElements(By.cssSelector(".products li"));
        return results.size();
    }
}