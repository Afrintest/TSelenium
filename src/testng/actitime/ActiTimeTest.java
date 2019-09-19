package testng.actitime;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ActiTimeTest extends BaseactiTest{
	
	@Parameters({"browser"})
	ActiTimeTest(String browser) {
		super(browser);
		// TODO Auto-generated constructor stub
	}

	String parent;
	
	@Test(priority=0)
	public void liscenseHeader(){
		LoginPage lp=new LoginPage(driver);
		parent = driver.getWindowHandle();
		lp.clickViewLicense();
		
		LiscensePage lsp=new LiscensePage(driver);
		//Getting Elements
		lsp.liscenseElements();
		//close Browser
		lsp.closeChildBrowser();
		
		
	}
	
	@Test(priority=1)
	public void captureError() throws InterruptedException{	
		driver.switchTo().window(parent);
		LoginPage lp=new LoginPage(driver);
		lp.clickLogin();
		//Error Text
		Thread.sleep(2000);
		System.out.println(lp.errorText());
	}
	
	@DataProvider
	public Object[][] getInputData() throws EncryptedDocumentException, IOException{
		
		Object[][] data=new Object[3][2]; 
		FileInputStream fis=new FileInputStream("./data/input.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh=wb.getSheet("Sheet1");
		// Row row = sh.getRow(0);
		 
		for(int i=0;i<=2;i++){
			Row row=sh.getRow(i);
		for(int j=0;j<row.getLastCellNum();j++){
		Cell col = row.getCell(j);
		String value = col.getStringCellValue();
		System.out.println(value);
		data[i][j]=value;
		}
		
		}
		return data;
		
	}
		
	@Test(priority=2, dataProvider="getInputData")
	public void validateLogin(String un, String pwd) throws InterruptedException{	
		LoginPage lp=new LoginPage(driver);		
		lp.userName().sendKeys(un);
		System.out.println(lp.userName().getAttribute("value"));
		lp.password().sendKeys(pwd);
		lp.clickLogin();
		Thread.sleep(2000);
		String atitle=driver.getTitle();
		System.out.println(atitle);
		String etitle="actiTIME - Enter Time-Track";
		
		if(atitle.equals(etitle)){
			System.out.println("Verified Title");
		}
		else{
			System.out.println("Title is not same");
		}
		
	}	

}
