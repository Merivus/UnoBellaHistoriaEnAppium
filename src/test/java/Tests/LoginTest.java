package Tests;

import PageModels.LoginModel;
import com.thoughtworks.gauge.Step;
import driver.Driver;
import io.appium.java_client.MobileElement;

public class LoginTest {

    LoginModel loginModel;

    public LoginTest() {
        this.loginModel=new LoginModel();
    }

    @Step("Kullanıcı adı alanına <key> yazılır")
    public void setUser(String userName){
        loginModel.setUser(userName);
    }

    @Step("Kullanıcı şifre alanına <key> yazılır")
    public void setPassword(String password){
        loginModel.setPassword(password);
    }

    @Step("Giriş butonuna tıklanır")
    public void clickLogin(){
        loginModel.clickLogin();
    }
}
