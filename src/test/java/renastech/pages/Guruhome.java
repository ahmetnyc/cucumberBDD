package renastech.pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import renastech.utils.BrowserUtils;

public class Guruhome extends BrowserUtils {
    public Guruhome(){PageFactory.initElements(driver,this);  }
    @FindBy(xpath = "//h1[.='Add Customer']")
    private WebElement logo;
    @FindBy(xpath = "//a[.='Add Customer']")
    private WebElement addcustomer;
    @FindBy(xpath = "//h1[.='Add Customer']")
    private WebElement verifymessage;
    @FindBy(id = "//input[@id='done']")
    private WebElement doneButton;
    @FindBy(id = "fname")
    private WebElement fname;
    @FindBy(id = "lname")
    private WebElement lastName;

    public void setLogo(String Header){Assert.assertEquals(Header,logo.getText());}
    public void setAddcustomer(){clickWithWait(addcustomer);}
    public void setVerifymessage(String expectedHeader){Assert.assertEquals(expectedHeader,verifymessage.getText());}
    public void setDone(){clickWithWait(doneButton);}
    public void setName(String Fname){enterText(fname,Fname);}
    public void setLastName(String Lname){enterText(lastName,Lname); }
}
