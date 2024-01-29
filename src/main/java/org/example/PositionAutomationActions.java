package org.example;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.time.Duration;
import java.util.List;

public class PositionAutomationActions extends BaseTest {

    public static void clickButtonByClass(String className) {
        WebElement button = findElement(By.className(className));
        button.click();
    }

    public static List<WebElement> findElements(By by) {
        return findElementsWithWait(by, 5);
    }
}

