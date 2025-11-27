package com.kodilla.selenium.search;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StoreSearchExample {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://kodilla.com/pl/test/store");
    }
}
