package renastech.stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import renastech.pages.Guruhome;
import renastech.pages.Guruweb;
import renastech.utils.BrowserUtils;
import renastech.utils.ConfigurationsReader;
import renastech.utils.Driver;
import java.util.Map;

public class Gurusteph extends BrowserUtils {
 Guruweb guruweb = new Guruweb();
 Guruhome guruhome = new Guruhome();

    @Given("The user wants to see Guru demo site")
    public void the_user_wants_to_see_guru_demo_site() {
        Driver.getDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        BrowserUtils.setWaitTime();
        driver.get(ConfigurationsReader.getProperties("urlguru"));

        System.out.println("website launched");
    }
    @When("The user wants to Add Tariff Plan")
    public void the_user_wants_to_add_tariff_plan() {guruweb.setAddTariffPlan();}
    @Then("The user wants to verify {string} header")
    public void the_user_wants_to_verify_header(String expectedHeader) {guruweb.setHeader(expectedHeader);}
    @Then("The user wants to Add Tariff Plan details as")
    public void the_user_wants_to_add_tariff_plan_details_as(Map<String, String> dataTable) {
    guruweb.setMonthlyrental(dataTable.get("Monthly Rental"));
    guruweb.setLocal_minute(dataTable.get("Free Local Minutes"));
    guruweb.setInterminute(dataTable.get("Free International Minutes"));
    guruweb.setFreesms(dataTable.get("Free SMS Pack"));
    guruweb.setMinutecharges(dataTable.get("Local Per Minutes Charges"));
    guruweb.setInter_charges(dataTable.get("International Per Minutes Charges"));
    guruweb.setSms_charges(dataTable.get("SMS Per Charges"));
    }
    @Then("The user wants to submit")
    public void the_user_wants_to_submit(){guruweb.setSubmitButton(); }
    @Then("The_user_wants_to_verify_message_as_{string}")
    public void the_user_wants_to_verify_message_as(String expectedtext){guruweb.setVerify_ms(expectedtext);

    }


    @When("The user wants to add a customer")
    public void the_user_wants_to_add_a_customer() {
       guruhome.setAddCostumer();
    }
    @Then("The users wants to verify {string} header")
    public void the_users_wants_to_verify_header(String expectedheader2) {
       guruhome.setHeader2(expectedheader2);

    }
    @Then("The user wants to enter background check as {string}")
    public void the_user_wants_to_enter_background_check_as(String Background)  {
       guruhome.setBackgroundCheck(Background);
    }
    @Then("The user wants to enter billingaddress as {string} and {string} and {string} and {string} and {string}")
    public void the_user_wants_to_enter_billingaddress_as_and_and_and_and(String fname,String lname, String email,String address,String number) {
       guruhome.setFName(fname);
       guruhome.setLName(lname);
       guruhome.setEmailID(email);
       guruhome.setAddressBox(address);
       guruhome.setPNumber(number);

    }
    @Then("The wants to verify message as {string}")
    public void the_wants_to_verify_message_as(String string) {

    }
}
