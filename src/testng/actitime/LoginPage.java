package testng.actitime;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;

public class LoginPage {

	WebDriver driver;

	@FindBy(xpath = "//a[text()='View License']")
	private WebElement License;

	@FindBy(xpath = "//a[@id='loginButton']")
	private WebElement loginButton;

	@FindBy(xpath = "//span[@class='errormsg']")
	private WebElement errormsg;

	@FindBy(id = "username")
	private WebElement username;

	@FindBy(name = "pwd")
	private WebElement password;

	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
		
	}

	public void clickViewLicense() {
		License.click();
	}

	public void clickLogin() {
		loginButton.click();
		System.out.println("Clicked on login");
	}

	public String errorText() {
		return errormsg.getText();
	}

	public WebElement userName() {
		return username;
	}

	public WebElement password() {
		return password;

	}
}
