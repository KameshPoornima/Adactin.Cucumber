package Com.cucumber.org;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Adactin_Selecthotal_Pom {
	public static WebDriver driver;
	
	@FindBy(id = "radiobutton_0")
	private WebElement select;
	
	@FindBy(id = "continue")
	private WebElement continues;
	
	@FindBy(id = "cancel")
	private WebElement cancel;
	
	
	
	
	public  Adactin_Selecthotal_Pom(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver2, this);

	}
	
		
	public WebElement getSelect() {
		return select;
	}

	public WebElement getContinues() {
		return continues;
	}

	public WebElement getCancel() {
		return cancel;
	}
	

}
