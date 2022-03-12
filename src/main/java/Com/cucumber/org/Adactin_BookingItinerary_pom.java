package Com.cucumber.org;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Adactin_BookingItinerary_pom {
	public static WebDriver driver;
	
	@FindBy(name = "ids[]")
	private WebElement Check_box;
	
	@FindBy(name = "cancelall")
	private WebElement cancelall;
	
	@FindBy(name = "search_hotel")
	private WebElement search_hotel;
	
	@FindBy(name = "logout")
	private WebElement logout;
	
	
	public Adactin_BookingItinerary_pom(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver2,this);
		
	}

	public WebElement getCheck_box() {
		return Check_box;
	}

	public WebElement getCancelall() {
		return cancelall;
	}

	public WebElement getSearch_hotel() {
		return search_hotel;
	}

	public WebElement getLogout() {
		return logout;
	}
	
	

}
