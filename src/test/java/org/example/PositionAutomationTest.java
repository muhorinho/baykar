package org.example;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

import static org.example.PositionAutomationActions.*;

public class PositionAutomationTest {

    @BeforeAll
    public static void setup() {
        setupWebDriver();
    }

    @Test
    public void testPositionAutomation() {
        openWebsite("https://kariyer.baykartech.com/");

        clickButtonByClass("fix-btn");
        waitFor(4000);

        WebElement unitCheckbox = findElement(By.cssSelector("input[name='competition'][value='Üretim Yönetimi']"));
        unitCheckbox.click();
        waitFor(4000);

        WebElement positionFilterInput = findElement(By.id("myInput"));
        positionFilterInput.sendKeys("depo");
        waitFor(4000);

        /*List<WebElement> filteredPositions = findElements(By.cssSelector(".positions-list li"));


        for (WebElement position : filteredPositions) {
            System.out.println("Filtrelenen Pozisyon: " + position.getText());
        }*/
    }

    @AfterAll
    public static void tearDown() {
        quitWebDriver();
    }
}
