package Util;

import driver.Driver;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class Util extends Driver {

    public WebElement findElement(By by) {
        return appiumDriver.findElement(by);
    }

    public void sendKeys(By selector, String text) {
        WebDriverWait wait = new WebDriverWait(appiumDriver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(selector));
        findElement(selector).sendKeys(text);
    }

    public void clickElement(By selector) {
        WebDriverWait wait = new WebDriverWait(appiumDriver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(selector));
        wait.until(ExpectedConditions.elementToBeClickable(selector));
        findElement(selector).click();
    }

    protected void clickElement(WebElement element) {
        WebDriverWait wait = new WebDriverWait(appiumDriver, 20);
        wait.until(ExpectedConditions.visibilityOf(element));
        wait.until(ExpectedConditions.elementToBeClickable(element)).click();
    }

    public List<WebElement> findElements(By by) {
        return appiumDriver.findElements(by);
    }

    public boolean isElementDisplayed(By selector) {
        try {
            return findElement(selector).isDisplayed();
        } catch (WebDriverException e) {
            return false;
        }
    }

    public String getText(By by) {
        WebDriverWait wait = new WebDriverWait(appiumDriver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
        return findElement(by).getText();
    }

    public boolean isElementVisible(By by) {
        try {
            WebDriverWait wait = new WebDriverWait(appiumDriver, 20);
            wait.until(ExpectedConditions.visibilityOfElementLocated(by));
            return true;
        } catch (Exception var4) {
            return false;
        }
    }

    protected void waitElementVisibility(By selector) {
        WebDriverWait wait = new WebDriverWait(appiumDriver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(selector));
    }
}

