package stepDefinitions;

import org.junit.Assert;

import core.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.HomePageObject;
import utilities.UtilityClass;



public class homeStepDef extends Base{
	
	HomePageObject homePage = new HomePageObject();
	Base base=new Base();

	@Given("user login in homepage")
	public void user_login_in_homepage() {

		Assert.assertTrue(getBrowser(), true);
		
		
		//		String url= driver.getCurrentUrl();
//		 Assert.assertEquals(url,url.contains("ferguson"));
		 System.out.println("Url has been verified");
//		String actualPageTitile = driver.getTitle();
//		boolean expectedPageTitle =driver.equals("Plumbing Supplies, HVAC Parts, Pipe, Valves & Fittings – Ferguson");
//		
//		Assert.assertEquals(expectedPageTitle, actualPageTitile);
//		logger.info("Actual Titel is matching with expected title");
	}
		@When("Search in the search bar")
	public void search_in_the_search_bar() throws InterruptedException {
		homePage.searchForProductLandsOnCorrectProduct();
		UtilityClass.takeScreenShot(); 
		 }
	
	@Then("expected by checking the product brand and product id")
	public void expected_by_checking_the_product_brand_and_product_id() throws InterruptedException {
//		String url= driver.getCurrentUrl();
//		 Assert.assertEquals(url,url.contains("m6702bn")
//		 );
//		 System.out.println("Url has been verified");
//	}
		homePage.successMessageMoen();
		
}
//////////////////////////////////////////
	@Given("Go to the Bathroom Sinks category directly")
	public void url() {
	  	}
	@When("click the second product")
	public void click_the_second_product() {
	  
	}
	@When("the product added to the cart")
	public void the_product_added_to_the_cart() {
	     
	}
	@Then("give message and the product that is added to the cart is what is expected")
	public void give_message_and_the_product_that_is_added_to_the_cart_is_what_is_expected() throws InterruptedException {
	  homePage.addProductToCartFromCategoryDrop();
	}
////////////////////////////////////////////////////////
	@When("Add two different finishes of a product to cart")
	public void add_two_different_finishes_of_a_product_such_as_moen_m6702bn_to_cart() throws InterruptedException {
		homePage.addMoenBrushedNickel();
		}
	@When("change the quantity of each finish on the cart page")
	public void change_the_quantity_of_each_finish_on_the_cart_page() throws InterruptedException {
	homePage.addMoenChrome();
	}
	@Then("cart total update as expected when the quantity is changed")
	public void cart_total_update_as_expected_when_the_quantity_is_changed() throws InterruptedException {
	homePage.addMultipleCartItemsAndChangeQuantity();
	
	}
////////////////////////////////////////////////////////////
	@When("click on category drop page")
	public void click_on_category_drop_page() {
	   homePage.categoryBathroom();
	}
	@When("filter Brand and filter finish")
	public void filter_brand_and_filter_finish() throws InterruptedException {
		homePage.addFilterBrandAndFinish();
	}
	@When("User should see number results for product")
	public void user_should_see_number_results_for_product() throws InterruptedException {
	   homePage.numberOfResults();
	}
	@When("add filter")
	public void add_filter() {
	   
	}
	@Then("User should see lower number of results whan adding a layer of filter")
	public void user_should_see_lower_number_of_results_whan_adding_a_layer_of_filter() throws InterruptedException {
	   homePage.facetNarrowBysResultInCorrectProductCounts(); 
	}

}