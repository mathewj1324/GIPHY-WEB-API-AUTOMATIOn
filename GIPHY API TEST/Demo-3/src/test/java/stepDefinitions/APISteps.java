package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import pages.MainPage;
import runners.BaseClass;

import java.net.HttpURLConnection;
import java.net.URL;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class APISteps extends BaseClass {

private BaseClass base;
MainPage mainPage;

public APISteps(BaseClass base) {
        this.base = base;
        }
        String api_key, username, sourceUrl, tagdata,postUrl,q, rating, lang;


    @Given("^that user is having api_key \"([^\"]*)\" and username as \"([^\"]*)\"$")
    public void that_user_is_having_api_key_and_username_as(String apikey, String uname) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        api_key=apikey;
        username= uname;

    }


    @When("^user is having image upload source url as \"([^\"]*)\"$")
    public void user_is_having_image_upload_source_url_as(String srcUrl) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        sourceUrl= srcUrl;

    }

    @When("^the tags as \"([^\"]*)\"$")
    public void the_tags_as(String tag) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
       tagdata= tag;
    }

    @When("^the source post url as \"([^\"]*)\"$")
    public void the_source_post_url_as(String pstUrl) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        postUrl= pstUrl;
    }

    @Then("^the image will be uploaded sucessfully$")
    public void the_image_will_be_uploaded_sucessfully() throws Throwable {
        // Write code here that turns the phrase above into concrete actions


        URL url = new URL("https://api.giphy.com/v1/gifs/search?username="+username+"&api_key="+api_key+"&source_image_url="+sourceUrl+"&tags="+tagdata+"&source_post_url="+postUrl+"");

        System.out.println(url);
        HttpURLConnection http = (HttpURLConnection)url.openConnection();
        System.out.println(http.getResponseCode() + " " + http.getResponseMessage());
        assertEquals(200,http.getResponseCode());

        http.disconnect();

    }


    @Given("^that user is having api_key \"([^\"]*)\"$")
    public void that_user_is_having_api_key(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        api_key=arg1;
    }

    @When("^user is having search query term as \"([^\"]*)\"$")
    public void user_is_having_search_query_term_as(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        q=arg1;
    }

    @When("^the rating as \"([^\"]*)\"$")
    public void the_rating_as(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        rating=arg1;
    }

    @When("^the language as \"([^\"]*)\"$")
    public void the_language_as(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        lang=arg1;
    }

    @Then("^the search results will be displayed$")
    public void the_search_results_will_be_displayed() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        URL url = new URL("https://api.giphy.com/v1/gifs/search?q="+q+"&api_key="+api_key+"&rating="+rating+"&lang="+lang+"");

        System.out.println(url);
        HttpURLConnection http = (HttpURLConnection)url.openConnection();
        System.out.println(http.getResponseCode() + " " + http.getResponseMessage());
        assertEquals(200,http.getResponseCode());

        http.disconnect();
    }





    // WebDriver driver;

    @Given("^that i am on the shopping website$")
    public void that_i_am_on_the_shopping_website() throws Throwable {
/*
        mainPage= new MainPage(base.driver);
        mainPage.launchApplication(base.driver);*/
        URL url = new URL("https://api.giphy.com/v1/gifs/search?q=cheeseburgers&api_key=mU0vwi0OFS5fVdD0X7QoxcXEoFEs5xq5");
        HttpURLConnection http = (HttpURLConnection)url.openConnection();
        System.out.println(http.getResponseCode() + " " + http.getResponseMessage());
        http.disconnect();


    }

    @When("^i add an item to the basket$")
    public void i_add_an_item_to_the_basket() throws Throwable {
        /*addToCartPage= new AddToCartPage(base.driver);
        addToCartPage.clickOn_Cart();
        addToCartPage.enterData();
        addToCartPage.clickAddToCart(base.driver);*/

    }

    @Then("^i can view the item in my basket$")
    public void i_can_view_the_item_in_my_basket() throws Throwable {

        /*addToCartPage.viewCart();*/

    }

}