package org.example;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public class LanguageSwitchActions extends BaseTest {

    public static void switchLanguage(WebElement languageElement, String languageCode) {
        languageElement.click();
        waitForUrlContains(languageCode.toLowerCase(), 10);
    }

    public static void assertLanguageSwitch(String language, String expectedUrl) {
        if (driver.getCurrentUrl().startsWith(expectedUrl)) {
            System.out.println(language + " diline geçiş başarılı.");
        } else {
            System.out.println(language + " diline geçiş başarısız.");
        }
    }
}
