package com.kodilla.selenium.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LoginTestingApp {
    public static void main(String[] args) throws InterruptedException {
        ChromeOptions chromeOptions = new ChromeOptions();
        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.get("https://kodilla.com/pl/test/login");


        WebElement emailField = driver.findElement(By.xpath("//html/body/section/form/div[1]/input"));
        emailField.sendKeys("test@kodilla.com");
        WebElement passwordField = driver.findElement(By.xpath("//html/body/section/form/div[2]/input"));
        passwordField.sendKeys("Kodilla123");
    }
}