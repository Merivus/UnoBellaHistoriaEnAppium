package PageModels;

import Util.Util;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class MainPageModel extends Util {

    public By btnLeft = By.id("com.getir.casestudy.dev:id/ga_toolbar_leftIconImageView");

    public void clickLeftButton(){
        clickElement(btnLeft);
    }
}
