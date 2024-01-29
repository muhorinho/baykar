package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class NavbarActions extends BaseTest {

    public static void clickMenuItem(WebElement menuItem) {
        System.out.println("Menüye Tıklanıyor: " + menuItem.getText());
        menuItem.click();
    }

    /*public static void clickSubMenuItem(WebElement subMenuItem) {
        boolean pageUpdated = isPageUpdated();

        if (pageUpdated) {
            WebElement navbar = findElement(By.cssSelector("ul.nav.navbar-nav.navbar-right[data-in='#'][data-out='#']"));
            WebElement subMenu = navbar.findElement(By.className("dropdown-menu"));
            subMenuItem = subMenu.findElement(By.tagName("a"));
        }

        System.out.println("Alt Menüye Tıklanıyor: " + subMenuItem.getText());
        subMenuItem.click();
    }*/

    public static void clickAllMenuItems() {
        List<WebElement> menuItems = findElements(By.xpath("//ul[@class='nav navbar-nav navbar-right']/li/a"));

        for (WebElement menuItem : menuItems) {
            clickMenuItem(menuItem);
            waitFor(2000);

            /*if (menuItem.getAttribute("class").contains("dropdown")) {
                List<WebElement> subMenuItems = findElements(By.className("dropdown-menu"));

                for (WebElement subMenuItem : subMenuItems) {
                    clickSubMenuItem(subMenuItem.findElement(By.tagName("a")));
                    waitFor(2);
                }
            }*/
        }
    }
}
