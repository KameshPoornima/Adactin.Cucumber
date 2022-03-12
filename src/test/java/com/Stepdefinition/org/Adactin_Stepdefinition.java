package com.Stepdefinition.org;

import java.io.IOException;
import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import com.Runner.org.Adactin_RunnerClass;
import com.adactin.helper.FileReaderManager;
import com.adactin.helper.PageObjectManager;

import Com.cucumber.org.AdactinLoginpage_POM;
import Com.cucumber.org.Adactin_BookaHotal_pom;
import Com.cucumber.org.Adactin_BookingConformation_pom;
import Com.cucumber.org.Adactin_BookingItinerary_pom;
import Com.cucumber.org.Adactin_Searchhotal_POM;
import Com.cucumber.org.Adactin_Selecthotal_Pom;
import Com.cucumber.org.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import junit.textui.TestRunner;

public class Adactin_Stepdefinition extends BaseClass {
	public static WebDriver driver = Adactin_RunnerClass.driver;
	
	PageObjectManager pom = new PageObjectManager(driver);
	
	
	
   

	@Given("Broswer Launched")
	public void broswer_launched() {
		System.out.println("Driver Launched on Chrome Broswer");
	}
	
		
	@When("URl link opened") 
	public void u_rl_link_opened() throws IOException {
		String url = FileReaderManager.getInstance().gecrtInstance().getUrl();
		get(url);
	}
	
	@When("User Enters on {string} in username field")
	public void user_enters_on_in_username_field(String string) {
		Sendkeys(pom.getAlp().getUsername(), string);
	}
	
	@When("User Enters on {string} in password field")
	public void user_enters_on_in_password_field(String string) {
		Sendkeys(pom.getAlp().getPassword(), string);
	}
	
	@When("Click on Login button")
	public void click_on_login_button() {
		Click(pom.getAlp().getLogin());
	}
	
	@Then("Verifies the login functionality is successfully logined")
	public void verifies_the_login_functionality_is_successfully_logined() throws IOException {
		ScreenShot();
		System.out.println("Adactine Hotal Page Successfully Login");
	}
	
	@Then("navigate to the Search Hotal page")
	public void navigate_to_the_search_hotal_page() {
		System.out.println("Navigate to the Search Hotal Page");
	}


	
	
	
	Adactin_Searchhotal_POM ac = new Adactin_Searchhotal_POM(driver);
	

	@Given("User enters on Details in Manidatory Field")
	public void user_enters_on_details_in_manidatory_field() {
		System.out.println("User entered on Details in Manidatory Field");
	}
	
	@When("User Select a location in location field")
	public void user_select_a_location_in_location_field() {
		WebElement location = pom.getAsp().getLocation();
		Select s = new Select(location);
		s.selectByIndex(1);
	}
	
	@When("User Select a Hotals in Hotals Field")
	public void user_select_a_hotals_in_hotals_field() {
		WebElement hotals = pom.getAsp().getHotals();
		Select s = new Select(hotals);
		s.selectByIndex(1);
		
	}
	
	@When("User Select a Room Type in Room Type Field")
	public void user_select_a_room_type_in_room_type_field() {
		WebElement room_type = pom.getAsp().getRoom_type();
		Select s = new Select(room_type);
		s.selectByIndex(1);
	}
	@When("User select a Number of Rooms in NOR Field")
	public void user_select_a_number_of_rooms_in_nor_field() {
		WebElement room_nos = pom.getAsp().getRoom_nos();
		Select s= new Select(room_nos);
			s.selectByIndex(2);	
	}
	
	@When("User enters on check in date in Check in date Field")
	public void user_enters_on_check_in_date_in_check_in_date_field() {
		Sendkeys(pom.getAsp().getCheckindate(), "12/03/2022");
	}
	
	@When("User enters on check out date in Check out date Field")
	public void user_enters_on_check_out_date_in_check_out_date_field() {
		Sendkeys(pom.getAsp().getCheckoutdate(), "12/3/2022");
	}
	
	@When("User Select a Adults per Room in Adults per Room Field")
	public void user_select_a_adults_per_room_in_adults_per_room_field() {
		WebElement adult_room = pom.getAsp().getAdult_room();
		Select s = new Select(adult_room);
		s.selectByIndex(2);
	}
	
	@When("User Select a Children per Room in Children per Room Field")
	public void user_select_a_children_per_room_in_children_per_room_field() {
		WebElement child_room = pom.getAsp().getChild_room();
		Select s = new Select(child_room);
		s.selectByIndex(1);
	}
	
	@When("if any issues Click on Reset button or if ok click on search button")
	public void if_any_issues_click_on_reset_button_or_if_ok_click_on_search_button() {
		Click(pom.getAsp().getSearch());
	}
	
	@Then("If verifes The Search Hotal Page an move to next page is successful")
	public void if_verifes_the_search_hotal_page_an_move_to_next_page_is_successful() throws IOException {
		ScreenShot();
		System.out.println("Verified the Search Hotal page");
	}
	
	@Then("navigate to the Select Hotal  page")
	public void navigate_to_the_select_hotal_page() {
		System.out.println("Navigate to the Select Hotal Page");
	}
	



	Adactin_Selecthotal_Pom as = new Adactin_Selecthotal_Pom(driver);
	

	@Given("User click to select the Hotal on Select field")
	public void user_click_to_select_the_hotal_on_select_field() {
		Click(pom.getAsp2().getSelect());
	}
	
	@When("if user Given  any incorrect Details cilck on Cancle Button Or if ok Click on Continue Button")
	public void if_user_given_any_incorrect_details_cilck_on_cancle_button_or_if_ok_click_on_continue_button() {
		Click(pom.getAsp2().getContinues());
	}
	
	@Then("Verifies the Select Hotal page is successfully Move to Next page")
	public void verifies_the_select_hotal_page_is_successfully_move_to_next_page() throws IOException {
		ScreenShot();
		System.out.println("Select Hotal Page Verified");
	}
	
	
	@Then("navigate to Book a Hotal Page")
	public void navigate_to_book_a_hotal_page() {
		System.out.println("Navigate to Book a Hotal Page");
	}
	



	
	

	@Given("User  check the Details in Manidatory Field")
	public void user_check_the_details_in_manidatory_field() {
		System.out.println("User Looking on the Befor Manditory Field");
	}
	
	@When("User enters on Frist name in frist name field")
	public void user_enters_on_frist_name_in_frist_name_field() throws IOException {
		 String friestName = FileReaderManager.getInstance().gecrtInstance().getFriestName();
		 Sendkeys(pom.getAbp().getFirstname(), friestName);
	}
	
	@When("User enters on last name in last name field")
	public void user_enters_on_last_name_in_last_name_field() throws IOException {
		String lastName = FileReaderManager.getInstance().gecrtInstance().getLastName();
		Sendkeys(pom.getAbp().getLastname(), lastName);
	}
	
	@When("User enters on Billing Address in Billing Address field")
	public void user_enters_on_billing_address_in_billing_address_field() throws IOException {
		String address = FileReaderManager.getInstance().gecrtInstance().getAddress();
		Sendkeys(pom.getAbp().getAddress(), address);
	}
	
	@When("User enters on Credit Card No in Credit Card No field")
	public void user_enters_on_credit_card_no_in_credit_card_no_field() throws IOException {
		String creditCard = FileReaderManager.getInstance().gecrtInstance().getCreditCard();
		Sendkeys(pom.getAbp().getCreditcardnumber(), creditCard);
	}
	
	@When("User Select a Credit Card Type in Credit Card Type field")
	public void user_select_a_credit_card_type_in_credit_card_type_field() {
		WebElement creditcardtype = pom.getAbp().getCreditcardtype();
		Select s = new Select(creditcardtype);
		s.selectByIndex(3);
	}
	
	@When("User Select a Expiry Date in Expiry Date field")
	public void user_select_a_expiry_date_in_expiry_date_field() {
		WebElement expmonth = pom.getAbp().getExpmonth();
		WebElement expyear = pom.getAbp().getExpyear();
		Select s = new Select(expmonth);
		Select s1 = new Select(expyear);
		s.selectByIndex(5);
		s1.selectByIndex(6);
		
	}
	
	@When("User enters on CVV Number in CVV Number field")
	public void user_enters_on_cvv_number_in_cvv_number_field() throws IOException {
		String getcvv = FileReaderManager.getInstance().gecrtInstance().getcvv();
		Sendkeys(pom.getAbp().getCvv(), getcvv);
	}
	
	@When("if ok for user Given details Click on Book Button or if any in corrct details Click on cancel Button")
	public void if_ok_for_user_given_details_click_on_book_button_or_if_any_in_corrct_details_click_on_cancel_button() throws InterruptedException {
		Click(pom.getAbp().getBook());
		Thread.sleep(6000);
	}
	
	@Then("if verify the user is Successful hotal booking")
	public void if_verify_the_user_is_successful_hotal_booking() throws IOException {
		ScreenShot();
		System.out.println("hotal booking Successfully");
	}
	
	@Then("navigate To Booked Itinerary Page")
	public void navigate_to_booked_itinerary_page() {
		Click(pom.getAbcp().getMy_itinerary());
		System.out.println("Navigate Itinerary Page");
	}
	


	
	
	

	@Given("User select a Orders")
	public void user_select_a_orders() {
		Click(pom.getAbip().getCheck_box());
	}
	
	@When("Click on Cancel Button")
	public void click_on_cancel_button() {
		Click(pom.getAbip().getCancelall());
	}
	
	@Then("if verifies the Booking Cancel")
	public void if_verifies_the_booking_cancel() throws IOException {
		ScreenShot();
		System.out.println("Booking Cancel successfully");
	}
	
	@Then("navigate LogOut page")
	public void navigate_log_out_page() {
		System.out.println("Open a Navigate LogOut Page ");
	}
	


	
	

	@Given("Click on LogOut Button")
	public void click_on_log_out_button() {
		Click(pom.getAbcp().getLogout());
	}
	
	@Then("if adactin Hotal Booking page is successfully LogOut")
	public void if_adactin_hotal_booking_page_is_successfully_log_out() throws IOException {
		ScreenShot();
		System.out.println("Adactin Hotal Page Logout Successfully");
	}
	
	@Then("Broswer will be Closed")
	public void broswer_will_be_closed() {
		System.out.println("Broswer Closed");
	    
	}



	
	
	
	
}
