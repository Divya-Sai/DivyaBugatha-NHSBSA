package stepDefinitions;

import Pages.basePage;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class steps  {

    basePage basePg;
    WebDriver driver;
    Logger logger; // //for logging

    @Before
    public void setup(){
        //for logging
         logger = LogManager.getLogger(this.getClass());
    }

    @Given("I can see {string} browser")
    public void i_can_see_browser(String browsername) {
        basePg = new basePage();
        basePg.setBrowser(browsername);
        driver = new ChromeDriver();
    }

    @When("I enter the RahulShettyAcademy Practise link {string}")
    public void i_enter_the_rahul_shetty_academy_practise_link(String url) {
        driver.get(url);
        driver.manage().window().maximize();
        logger.info("logged into url");
    }

    @When("User click on check-for-help-paying-nhs-costs url {string}")
    public void user_click_on_check_for_help_paying_nhs_costs_url(String url) {
        driver.get(url);
    }
    @Then("User verify the title of the page is {string}")
    public void user_verify_the_title_of_the_page_is(String title) {

    }

}
