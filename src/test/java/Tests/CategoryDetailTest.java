package Tests;

import PageModels.CategoryDetailModel;
import com.thoughtworks.gauge.Step;
import org.openqa.selenium.WebElement;

public class CategoryDetailTest {

    CategoryDetailModel categoryDetailModel;

    public CategoryDetailTest() {
        this.categoryDetailModel=new CategoryDetailModel();
    }

    @Step("<key> kategorisine tıklanır")
    public void clickCategoryByName(String categoryName){
        categoryDetailModel.clickCategoryByName(categoryName);
    }
}
