package PageModels;

import Util.Util;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;
import java.util.Random;

public class BasketModel extends Util {

    public By totalCountParent = By.id("com.getir.casestudy.dev:id/btnCheckout");
    public By btnBasket = By.id("com.getir.casestudy.dev:id/ga_toolbar_getir10GABasketButton");
    public By btnRemove = By.id("com.getir.casestudy.dev:id/btnRemove");
    public By btnAdd = By.id("com.getir.casestudy.dev:id/btnAdd");
    public By btnAddProduct = By.id("com.getir.casestudy.dev:id/btnAdd");
    public Random random = new Random();

    public BasketModel(){

    }

    public void clickBasket(){

        clickElement(btnBasket);
    }

    public void checkBasketProduct() {

        Assert.assertFalse(isElementDisplayed(totalCountParent));
    }

    public void clickRemoveButton() {
        while (isElementVisible(btnRemove)){
            clickElement(btnRemove);
        }
    }

    public void clickAddToRandomProduct() {
        List<WebElement> productlist = findElements(btnAddProduct);
        int randomProductNumber = random.nextInt(productlist.size());
        clickElement(productlist.get(randomProductNumber));
    }

    public void addProductToBasket(int product) {
        List<WebElement> productlist = findElements(btnAddProduct);
        for (int i=0;i<product;i++){
            clickElement(productlist.get(i));
        }
    }

    public void productIncreased() {
        List<WebElement> addButtonList = findElements(btnAdd);
        for (int i = 0; i < addButtonList.size(); i++) {
            clickElement(addButtonList.get(i));
        }
    }
}