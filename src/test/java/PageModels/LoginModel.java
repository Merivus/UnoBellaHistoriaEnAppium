package PageModels;

import Util.Util;
import org.openqa.selenium.By;

public class LoginModel extends Util {

    public By edtUsername = By.id("com.getir.casestudy.dev:id/usernameEditText");
    public By edtPassword = By.id("com.getir.casestudy.dev:id/passwordEditText");
    public By btnSubmit = By.id("com.getir.casestudy.dev:id/loginButton");

    public LoginModel(){

    }

    public void setUser(String userName){
        sendKeys(edtUsername,userName);
    }

    public void setPassword(String password){
        sendKeys(edtPassword,password);
    }

    public void clickLogin(){
        clickElement(btnSubmit);
    }
}
