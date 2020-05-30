package com.kodilla.slenium.allegro;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class AllegroTestingApp {

    WebDriver driver;

    @Before
    public  void setUp() {
        System.setProperty("webdriver.chrome.driver", "c:\\selenium-drivers\\chrome\\chromedriver.exe");
        driver = new ChromeDriver();
    }

     @Test
     public void searchProduct() {
        driver.get("https://www.allegro.pl");

       driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);

        WebElement dialogWindow = driver.findElement(By.xpath("//button[@data-role='accept-consent']"));
        dialogWindow.click();

        WebElement yearCombo = driver.findElement(By.xpath("//select[@data-role='filters-dropdown-toggle']"));
        Select yearSelect = new Select(yearCombo);
        yearSelect.selectByIndex(3);

        WebElement inputField = driver.findElement(By.xpath("//input[@role='combobox']"));
        inputField.sendKeys("Mavic mini");
        inputField.submit();
    }

    @After
    public void tearDown() {
        driver.close();
    }
}