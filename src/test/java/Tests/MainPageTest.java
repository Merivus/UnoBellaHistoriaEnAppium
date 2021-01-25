package Tests;

import PageModels.MainPageModel;
import com.thoughtworks.gauge.Step;

public class MainPageTest {

    MainPageModel mainPageModel;

    public MainPageTest() {
        this.mainPageModel=new MainPageModel();
    }

    @Step("Ana sayfaya geri dönüş yapılır")
    public void checkBasketProduct(){
        mainPageModel.clickLeftButton();
    }
}
