package com.kodilla.selenium.store;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StoreSearchTest {
    private WebDriver driver;
    private StorePage storePage;

    @BeforeEach
    void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        storePage = new StorePage(driver);
    }

    @AfterEach
    void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

    @Test
    void testSearchResults() {
        Object[][] testData = {
                {"NoteBook", 2},
                {"School", 1},
                {"Brand", 1},
                {"Business", 1},
                {"Gaming", 1},
                {"Powerful", 0}
        };

        for (Object[] data : testData) {
            String query = (String) data[0];
            int expectedResults = (int) data[1];

            storePage.searchFor(query);
            assertEquals(expectedResults, storePage.getResultsCount());

            storePage.searchFor(query.toUpperCase());
            assertEquals(expectedResults, storePage.getResultsCount());
        }
    }
}
//komerntarz
