package com.kodilla.selenium.allegro;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AllegroTestingApp {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "c:\\selenium-drivers\\chrome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.allegro.pl");

        WebElement yearCombo = driver.findElement(
                By.xpath("/html/body/div[2]/div[3]/header/div/div/div/div/form/div[2]/div/select"));

        Select yearSelect = new Select(yearCombo);
        yearSelect.selectByIndex(3);

        WebElement inputField = driver.findElement(By.xpath("/html/body/div[2]/div[3]/header/div/div/div/div/form/input"));
        inputField.sendKeys("Mavic mini");
        inputField.submit();
    }
}
