package renastech.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import renastech.utils.BrowserUtils;
import renastech.utils.ConfigurationsReader;
import sun.jvm.hotspot.debugger.Page;

public class OrangeHRMHome extends BrowserUtils {
    public OrangeHRMHome(){
        PageFactory.initElements(driver, this);
    }
    @FindBy(id = "txtUsername")
    private WebElement username;
    @FindBy(id = "txtPassword")
    private WebElement password;
    @FindBy(id = "btnLogin")
    private WebElement loginbutton;

    public void setUsername(){
        username.sendKeys(ConfigurationsReader.getProperties("username"));

    }
    public void setPassword(){
        password.sendKeys(ConfigurationsReader.getProperties("password"));
    }
    public void setLoginbutton(){
        loginbutton.click();
    }
}
