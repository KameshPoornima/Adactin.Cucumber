package Com.cucumber.org;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Adactin_Searchhotal_POM {
	public static WebDriver driver;
	
	
	@FindBy(id = "location")
	private WebElement Location;
	
	@FindBy(id = "hotels")
	private WebElement Hotals;
	
	@FindBy(id = "room_type")
	private WebElement room_type;
	
	@FindBy(id = "room_nos")
	private WebElement room_nos;
	
	@FindBy(id = "datepick_in")
	private WebElement Checkindate;
	
	@FindBy(id = "datepick_out")
	private WebElement checkoutdate;
	
	@FindBy(id = "adult_room")
	private WebElement adult_room;
	
	@FindBy(id = "child_room")
	private WebElement child_room;
	
	
	
	public Adactin_Searchhotal_POM(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver2, this);
	}
	
	
	
	
	
	public WebElement getLocation() {
		return Location;
	}

	public WebElement getHotals() {
		return Hotals;
	}

	public WebElement getRoom_type() {
		return room_type;
	}

	public WebElement getRoom_nos() {
		return room_nos;
	}

	public WebElement getCheckindate() {
		return Checkindate;
	}

	public WebElement getCheckoutdate() {
		return checkoutdate;
	}

	public WebElement getAdult_room() {
		return adult_room;
	}

	public WebElement getChild_room() {
		return child_room;
	}

	public WebElement getSearch() {
		return Search;
	}

	public WebElement getReset() {
		return Reset;
	}

	@FindBy(id = "Submit")
	private WebElement Search;
	
	@FindBy(id = "Reset")
	private WebElement Reset;
	
	
	

}
