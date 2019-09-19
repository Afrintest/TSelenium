package testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	WebDriver driver;

	@FindBy(xpath="//li[@class='store-block']") private WebElement store;
	@FindBy(id="search_query_top_elastic_search") private WebElement search;
	
	public HomePage(WebDriver driver){
		
		PageFactory.initElements(driver, this);
		this.driver=driver;
		
	}
	
	public void verifyPageTitle(String etitle){
		String atitle=driver.getTitle();
		if(etitle.equals(atitle)){
			System.out.println("Page: "+atitle);
		}
		else{
			System.out.println("Title Mismatch");
		}
	}

	public void clickLocateStores(){
		store.click();
	}
	
}
