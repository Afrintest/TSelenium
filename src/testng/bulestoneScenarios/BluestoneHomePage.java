package testng.bulestoneScenarios;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BluestoneHomePage {
	
	WebDriver driver;
	
	@FindBy(xpath="(//span[@class='caret hs'])[9]")
	private WebElement offers;
	
	@FindBy(xpath="//span[text()='Flat 5% Off']")
	private WebElement flat5off;
	
	@FindBy(xpath="//span[text()='Flat 15% Off']")
	private WebElement flat15off;
	
	@FindBy(xpath="//span[text()='Flat 20% Off']")
	private WebElement flat20off;
	
	BluestoneHomePage(WebDriver driver){
			PageFactory.initElements(driver, this);
			this.driver=driver;
		
	}
	
	public void mouseOverOffers() throws InterruptedException{
		Actions act=new Actions(driver);
		Thread.sleep(2000);
		act.moveToElement(offers).perform();
		//act.contextClick().perform();
	}
	
	public void clickFlat5Off(){
		flat5off.click();
	}
	
	public void clickFlat15Off(){
		flat15off.click();
	}
	
	public void clickFlat20Off(){
		flat20off.click();
	}

}
