package Tests;

import PageModels.BasketModel;

import com.thoughtworks.gauge.Step;
import org.junit.Assert;

public class BasketTest extends BasketModel {

    BasketModel basketModel;

    public BasketTest() {
        this.basketModel=new BasketModel();
    }

    /*@Step("Sepete tıklanır ve sepetin boş olduğu görülür")
    public void checkBasketProduct(){
        basketModel.checkBasketProduct();
    }*/

    @Step("Sepet butonuna basılır.")
    public void clickBasket(){
       /*MobileElement element = (MobileElement) appiumDriver.findElementById("com.getir.casestudy.dev:id/usernameEditText");
        element.sendKeys(userName);*/
        basketModel.clickBasket();
    }

    @Step("Sepetin boş olup olmadığının kontrolünü yapar")
    public void checkBasketProduct(){
       /*MobileElement element = (MobileElement) appiumDriver.findElementById("com.getir.casestudy.dev:id/usernameEditText");
        element.sendKeys(userName);*/
        basketModel.checkBasketProduct();
    }

    @Step("Sepetteki tüm ürünler silinir.")
    public void clickRemoveButton(){
       /*MobileElement element = (MobileElement) appiumDriver.findElementById("com.getir.casestudy.dev:id/usernameEditText");
        element.sendKeys(userName);*/
        basketModel.clickRemoveButton();
        //Assert.assertFalse("Sepette ürün bulunmaktadır.",basketModel.checkBasketProduct());
    }

    @Step("Kategoriden rastgele <key> ürün seçilir")
    public void addRandomProductToBasket(int randomPruduct){
        for (int i=0;i<randomPruduct;i++){
            basketModel.clickAddToRandomProduct();
        }
    }

    @Step("<key> farklı üründen <key> tane ürün eklenir")
    public void addProductToBasket(int product, int item){
        for (int i=0;i<product;i++){
            basketModel.addProductToBasket(product);
        }
    }

    @Step("Sepete eklenen ürünler birer tane arttırılır")
    public void addProductItems() {
        basketModel.productIncreased();
    }
}
