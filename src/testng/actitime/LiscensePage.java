package testng.actitime;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LiscensePage {
	
	WebDriver driver;
		
	@FindBy(xpath="//div[@class='licenseText no_restrictions_para']/h2")
	private  List<WebElement> heading;
	
	public LiscensePage(WebDriver driver){	
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	
	public void liscenseElements(){
		Set<String> win = driver.getWindowHandles();
		for(String w:win){
			
		driver.switchTo().window(w);
		}
		
		for(WebElement head:heading){
			System.out.println(head.getText());	
			}
	}

	public void closeChildBrowser(){
		driver.close();
		System.out.println("closed child browser");
	
	}
	

}
