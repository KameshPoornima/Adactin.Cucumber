package Com.cucumber.org;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Adactin_BookingConformation_pom {
	public static WebDriver driver;
	
	@FindBy(id = "search_hotel")
	private WebElement searchhotel;
	
	@FindBy(id = "my_itinerary")
	private WebElement my_itinerary;
	
	@FindBy(id = "logout")
	private WebElement logout;
	
	
	public Adactin_BookingConformation_pom(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver2, this);
	}
	

	public WebElement getSearchhotel() {
		return searchhotel;
	}

	public WebElement getMy_itinerary() {
		return my_itinerary;
	}

	public WebElement getLogout() {
		return logout;
	}
	

}
