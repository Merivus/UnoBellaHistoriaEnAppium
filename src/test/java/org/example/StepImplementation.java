package org.example;

import com.thoughtworks.gauge.Gauge;
import com.thoughtworks.gauge.Step;
import driver.Driver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static driver.Driver.appiumDriver;
import static org.assertj.core.api.Assertions.assertThat;

public class StepImplementation extends Driver {
   /* @Step("Kullanıcı adı alanına <key> girilir")
    public void setUserName(String userName) {
        MobileElement element = (MobileElement) appiumDriver.findElementById("com.getir.casestudy.dev:id/usernameEditText");
        element.sendKeys(userName);
    }

    @Step("Şifre alanına <key> girilir")
    public void setPassword(String password) {
        MobileElement element = (MobileElement) appiumDriver.findElementById("com.getir.casestudy.dev:id/passwordEditText");
        element.sendKeys(password);
    }

    @Step("Giriş butonuna tıklanır")
    public void clickSubmit() {
        MobileElement element = (MobileElement) appiumDriver.findElementsById("com.getir.casestudy.dev:id/loginButton");
        element.click();
    }*/
}
