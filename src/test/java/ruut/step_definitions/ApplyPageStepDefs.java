package ruut.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import ruut.pages.ApplyPage;
import ruut.utilities.ConfigurationReader;
import ruut.utilities.Driver;

public class ApplyPageStepDefs {
    String actual;
    String expected;
    Log4j log = new Log4j();

    @Given("go to websites")
    public void go_to_websites() {

        Driver.get().get(ConfigurationReader.get("url"));
        Driver.get().manage().window().maximize();

    }

    @Given("homepage should be seen on window")
    public void homepage_should_be_seen_on_window() {
        String actual = Driver.get().getTitle();
        String expected = "RUUT";
        Assert.assertEquals(actual, expected);


    }

    ApplyPage apply = new ApplyPage();

    @Given("click the apply button")
    public void click_the_apply_button() {
        apply.applyBtn.click();
    }

    @When("click the {string} tab")
    public void click_the_tab(String string) {
        if (string.equals("driver")) {
            apply.driver.click();

        } else if (string.equals("bikers")) {
            apply.biker.click();

        } else if (string.equals("advertiser")) {
            apply.advertiser.click();
        } else {
            apply.screenInvestor.click();
        }
    }

    @Then("check that {string} explanation")
    public void check_that_explanation(String string) {


            try {

                if (string.equals("driver")) {
                    actual = apply.driverExp.getText();
                    expected = "Drivers generate extra income by simply integrating Ruut Smart Screens on their cars.";
                    Assert.assertEquals(actual, expected);
                } else if (string.equals("bikers")) {
                    actual = apply.bikerExp.getText();
                    expected = "Bikers generate extra income by simply integrating Ruut Smart Screens on their bikes.";
                    Assert.assertEquals(actual, expected);
                } else if (string.equals("advertiser")) {
                    actual = apply.advertiserExp.getText();
                    expected = "Brands and agencies reach audiences via hyper-local, measurable and targeted outdoor campaigns with Ruut Smart Screens.";
                    Assert.assertEquals(actual, expected);
                } else {
                    actual = apply.screenInvestorExp.getText();
                    expected = "People generate extra income by purchasing Ruut Smart Screens and having Ruut operate them across its vehicle network.";
                    Assert.assertEquals(actual, expected);
                }
                log.info(actual);
                log.info(expected);

            }
            catch(Exception e){

            }
        }

    }

