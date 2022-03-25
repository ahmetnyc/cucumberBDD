package renastech.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import renastech.utils.BrowserUtils;

public class Admin extends BrowserUtils {
    public Admin(){PageFactory.initElements(driver,this);  }
    @FindBy(id = "menu_admin_viewAdminModule")
    private WebElement adminModule;
    @FindBy(id = "menu_admin_nationality")
    private WebElement NationalitiiesSection;
    @FindBy(id = "btnAdd")
    private WebElement addNationButton;
    @FindBy(id = "nationality_name")
    private WebElement addNationBox;
    @FindBy(id = "btnSave")
    private WebElement saveButton;


    public void setAdminModule(){clickWithWait(adminModule);  }
    public void setNationalitiiesSection(){clickWithWait(NationalitiiesSection);  }
    public void setAddNationButton(){clickWithWait(addNationButton);}
    public void setAddNationBox(String nationName){enterText(addNationBox,nationName); }
    public void setSaveButton(){clickWithWait(saveButton);  }
}
