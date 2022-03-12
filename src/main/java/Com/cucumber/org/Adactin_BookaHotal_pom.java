package Com.cucumber.org;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Adactin_BookaHotal_pom {
	public static WebDriver driver;
	
	@FindBy(id = "first_name")
	private WebElement firstname;
	
	@FindBy(id = "last_name")
	private WebElement lastname;
	
	@FindBy(id = "address")
	private WebElement address;
	
	@FindBy(id = "cc_num")
	private WebElement Creditcardnumber;
	
	@FindBy(id = "cc_type")
	private WebElement creditcardtype;
	
	@FindBy(id = "cc_exp_month")
	private WebElement Expmonth;
	
	@FindBy(id = "cc_exp_year")
	private WebElement expyear;
	
	@FindBy(id = "cc_cvv")
	private WebElement cvv;
	
	@FindBy(id = "book_now")
	private WebElement book;
	
	@FindBy(id = "cancel")
	private WebElement cancel;
	
	
	
	public Adactin_BookaHotal_pom(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver2, this);
	}

	public WebElement getFirstname() {
		return firstname;
	}

	public WebElement getLastname() {
		return lastname;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getCreditcardnumber() {
		return Creditcardnumber;
	}

	public WebElement getCreditcardtype() {
		return creditcardtype;
	}

	public WebElement getExpmonth() {
		return Expmonth;
	}

	public WebElement getExpyear() {
		return expyear;
	}

	public WebElement getCvv() {
		return cvv;
	}

	public WebElement getBook() {
		return book;
	}

	public WebElement getCancel() {
		return cancel;
	}

}
