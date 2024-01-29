package org.example;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.example.LanguageSwitchActions.*;

public class LanguageSwitchTest {

    @BeforeAll
    public static void setup() {
        setupWebDriver();
    }

    @Test
    public void testLanguageSwitch() {
        openWebsite("https://kariyer.baykartech.com/");

        WebElement languageElement = findElement(By.cssSelector("li.siteCustomLi a"));

        String defaultLanguageUrl = driver.getCurrentUrl();

        switchLanguage(languageElement, "EN");
        assertLanguageSwitch("İngilizce", "https://kariyer.baykartech.com/en/");

        languageElement = findElement(By.cssSelector("li.siteCustomLi a"));

        switchLanguage(languageElement, "TR");
        assertLanguageSwitch("Türkçe", defaultLanguageUrl);
    }

    @AfterAll
    public static void tearDown() {
        quitWebDriver();
    }
}
