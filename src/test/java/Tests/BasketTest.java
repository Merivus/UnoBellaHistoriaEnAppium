package Tests;

import PageModels.BasketModel;

import com.thoughtworks.gauge.Step;
import org.junit.Assert;

public class BasketTest extends BasketModel {

    BasketModel basketModel;

    public BasketTest() {
        this.basketModel=new BasketModel();
    }

    @Step("Sepet butonuna basılır.")
    public void clickBasket(){

        basketModel.clickBasket();
    }

    @Step("Sepetin boş olup olmadığının kontrolünü yapar")
    public void checkBasketProduct(){

        basketModel.checkBasketProduct();
    }

    @Step("Sepetteki tüm ürünler silinir.")
    public void clickRemoveButton(){

        basketModel.clickRemoveButton();
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
