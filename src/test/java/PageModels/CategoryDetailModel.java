package PageModels;

import Util.Util;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class CategoryDetailModel extends Util {

    public By tvTitle = By.id("com.getir.casestudy.dev:id/tvTitle");

    ArrayList<String> categoryItem = new ArrayList<String>();

    public CategoryDetailModel() {
        categoryItem.add("Meyve ve Sebze");
        categoryItem.add("Atıştırmalık");
        categoryItem.add("Dondurma");
        categoryItem.add("Yiyecek");
        categoryItem.add("İçecek");
        categoryItem.add("Fit & Form");
        categoryItem.add("Süt & Kahvaltı");
        categoryItem.add("Temel Gıda");
        categoryItem.add("Kişisel Bakım");
        categoryItem.add("Ev & Yaşam");
        categoryItem.add("Ev Bakım");
        categoryItem.add("Teknoloji");
        categoryItem.add("Bebek");
    }

    public void clickCategoryByName(String categoryName) {

        for (int i = 0; i < categoryItem.size(); i++) {
            if (categoryItem.get(i).equals(categoryName) && i < 10) {
                System.out.println(i);
                System.out.println("categoryItem" + categoryItem.get(i));
                System.out.println("tıklanan" + findElements(tvTitle).get(i).getText());
                findElements(tvTitle).get(i).click();
            }
        }
    }
}

