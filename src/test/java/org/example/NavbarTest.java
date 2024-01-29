package org.example;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.example.NavbarActions.*;


public class NavbarTest {

    @BeforeAll
    public static void setup() {
        setupWebDriver();
    }

    @Test
    public void testNavbar() {
        openWebsite("https://kariyer.baykartech.com/");

        clickAllMenuItems();
    }

    @AfterAll
    public static void tearDown() {
        quitWebDriver();
    }
}
