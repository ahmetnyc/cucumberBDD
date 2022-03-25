package renastech.pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import renastech.utils.BrowserUtils;

  public class Guruweb extends BrowserUtils {
  public Guruweb(){PageFactory.initElements(driver , this);}
  @FindBy(xpath = "//a[@href='addtariffplans.php']") private WebElement addTariffPlan;
  @FindBy(xpath = "//h1[.='Add Tariff Plans']") private WebElement header;
  @FindBy(xpath = "//input[@type='text']") private WebElement monthlyrental;
  @FindBy(xpath = "//input[@name='local_minutes']") private WebElement local_minute;
  @FindBy(xpath = "//input[@name='inter_minutes']") private WebElement interminute;
  @FindBy(xpath = "//input[@name='sms_pack']") private WebElement freesms;
  @FindBy(xpath = "//input[@name='minutes_charges']") private WebElement minutecharges;
  @FindBy(xpath = "//input[@name='inter_charges']") private WebElement inter_charges;
  @FindBy(xpath = "//input[@name='sms_charges']") private WebElement sms_charges;
  @FindBy(xpath = "//input[@type='submit']") private WebElement submitButton;
  @FindBy(xpath = "//h2[.='Congratulation you add Tariff Plan']") private WebElement verify_ms;

  public void setAddTariffPlan(){addTariffPlan.click(); }
  public void setHeader(String expectedHeader){Assert.assertEquals(expectedHeader,header.getText());}
  public void setMonthlyrental(String MonthlyRental){monthlyrental.sendKeys(MonthlyRental);}
  public void setLocal_minute(String FreeLocalMinutes){local_minute.sendKeys(FreeLocalMinutes);}
  public void setInterminute(String FreeInternationalMinutes){interminute.sendKeys(FreeInternationalMinutes);}
  public void setFreesms(String FreeSMSPack){freesms.sendKeys(FreeSMSPack);}
  public void setMinutecharges(String LocalPerMinutesCharges){minutecharges.sendKeys(LocalPerMinutesCharges);}
  public void setInter_charges(String Inter_charges){inter_charges.sendKeys(Inter_charges);}
  public void setSms_charges(String SMSPerCharges){sms_charges.sendKeys(SMSPerCharges);}
  public void setSubmitButton(){submitButton.click();}
  public void setVerify_ms(String expectedtext){Assert.assertEquals(expectedtext,verify_ms.getText());}

}
