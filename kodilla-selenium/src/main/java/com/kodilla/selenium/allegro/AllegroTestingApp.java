package com.kodilla.selenium.allegro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class AllegroTestingApp {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "c:\\selenium-drivers\\chrome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.allegro.pl");

        TimeUnit.SECONDS.sleep(5);

        WebElement dialogWindow = driver.findElement(By.xpath("//button[@data-role='accept-consent']"));
        dialogWindow.click();

        WebElement yearCombo = driver.findElement(By.xpath("//select[@data-role='filters-dropdown-toggle']"));
        Select yearSelect = new Select(yearCombo);
        yearSelect.selectByIndex(3);

        WebElement inputField = driver.findElement(By.xpath("//input[@role='combobox']"));
        inputField.sendKeys("Mavic mini");
        inputField.submit();
    }
}
