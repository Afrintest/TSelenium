package testng.bulestoneScenarios;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class OffersPage {
	
	WebDriver driver;
	
	@FindBy(xpath="//span[text()='(5% off)']")
	private WebElement offpercenttext;
	
	@FindBy(xpath="//span[@class='b-price-wrapper']/span[2]/span")
	private List<WebElement> displayElements;
	
	public OffersPage(WebDriver driver){
		PageFactory.initElements(driver, this);
		this.driver=driver;
}

	public void elementsToVerify(){
		
		for(WebElement ds:displayElements){
			if(ds.getText().contains("(5% off)")  || ds.getText().contains("(15% off)")){
			System.out.println(ds.getText()+" discount is added");
		}
			else{
				System.out.println("5% discount is not added");
			}
		
	}

	}

}
