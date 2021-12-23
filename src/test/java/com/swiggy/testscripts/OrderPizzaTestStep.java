package com.swiggy.testscripts;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.testng.Assert;



public class OrderPizzaTestStep  extends Driver{
	
	@Given("user is on the mainpage of Swiggy")
	public void user_is_on_tuser_mainpage_of_swiggy() {
	//	Assert.assertTrue(driver.getTitle().equals("Order food online from India's best food delivery service. Order from restaurants near you"));    
	}

	@And("user Enters location as {string}")
	public void user_enters_location_as(String string) {
	    // Write code userre that turns tuser phrase above into concrete actions
	//	landingPage.enterLocation(string);
	}
	

	@When("user selects first location from suggested location in suggestion-box")
	public void user_selects_first_location_from_suggested_location_in_suggestion_box()
	{
	
		}
	//	landingPage.selectLocation(); 
		


	
	@And("user redirects to ItemPage")
	public void user_redirects_to_item_page() {
		
	System.out.println("test casse"); 
		
	    
	}

	@And("user hover over search icon")
	public void user_hover_over_search_icon() {
	//	items.hoverOverSerch();
	}

	@And("user Enters Item as {string}")
	public void user_enters_item_as(String string) {
		
//	    items.enterItem(string);
	//	items.searchItem();
	}

	//@When("user selects first suggested Item in Pizza cateogory")
//	public void user_select_first_suggested_item_in_Pizza_cateogory() {
//		items.selectFirstItem();
		
		
//	}

//	@And("user searches resturants and selects first restaurant")
//	public void user_searches_resturants_and_selects_first_restaurant() {
//		placeOrder.addItem();
		
		
//	}

	@And("user redirects to orderPage")
	public void user_redirects_to_order_page() {
//		placeOrder.continueorder();
	}

	@And("user adds first item to cart")
	public void user_adds_first_item_to_cart() {
//		placeOrder.moveToCart();
	}

//	@When("user clicks on checkout button")
//	public void user_click_on_checkout_button() {
//		placeOrder.checkoutAction();
		
	    
//	}

	@Then("user should be able to order a Pizza suscessfully")
	public void user_should_be_able_to_order_a_Pizza_suscessfully() {
	//	String expectedErrMsg = "SECURE CHECKCKOUT";
//		String actualErrMsg = cuserckOut.getMsg();
//		Assert.assertEquals(actualErrMsg, expectedErrMsg);
	    
	}
	
	

}