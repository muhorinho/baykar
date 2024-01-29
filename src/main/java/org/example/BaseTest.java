package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class BaseTest {

    protected static WebDriver driver;

    protected static void setupWebDriver() {
        System.setProperty("chromedriver.exe", "C:\\Users\\Muhammed\\IdeaProjects\\baykar\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    protected static void openWebsite(String url) {
        driver.get(url);
    }

    protected static WebElement findElement(By by) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        return wait.until(ExpectedConditions.presenceOfElementLocated(by));
    }

    protected static List<WebElement> findElementsWithWait(By by, int seconds) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(seconds));
        return wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(by));
    }

    protected static List<WebElement> findElements(By by) {
        return driver.findElements(by);
    }

    protected static void waitFor(int milliseconds) {
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    protected static void quitWebDriver() {
        if (driver != null) {
            driver.quit();
        }
    }

    protected static boolean isPageUpdated(String expectedTitle) {
        return isPageLoaded(expectedTitle);
    }

    protected static boolean isPageLoaded(String expectedTitle) {
        return driver.getTitle().equals(expectedTitle);
    }

    protected static void waitForUrlContains(String languageCode, int seconds) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(seconds));
        wait.until(ExpectedConditions.urlContains("/" + languageCode + "/"));
    }
}
