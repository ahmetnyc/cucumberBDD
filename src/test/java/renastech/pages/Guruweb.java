package renastech.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import renastech.utils.BrowserUtils;

public class Guruwep extends BrowserUtils {
  public Guruwep (){PageFactory.initElements(driver , this);}

  @FindBy(xpath = "//a[@href='addtariffplans.php']")
  private WebElement addTariffPlan;


  public void setAddTariffPlan(){addTariffPlan.click(); }
}
