package assessment;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Row.MissingCellPolicy;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class GetQuotes {

	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--disable-notificatios");
		opt.addArguments("--start-maximized");

		WebDriver driver = new ChromeDriver(opt);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("http://localhost/login.do");
		driver.findElement(By.id("licenseLink")).click();

		Set<String> win = driver.getWindowHandles();

		for (String w : win) {

			driver.switchTo().window(w);

		}

		String para = driver.findElement(By.xpath("//div[@class='licenseText no_restrictions_para']/p[5]")).getText();

		List<String> lst = new ArrayList<>();

		String[] str = para.split("\"");

		for (String st : str) {
				if (!(st.contains("(") | st.contains(")"))) {
					System.out.println(st + "\t");
					lst.add(st);
				}
			}
			
			System.out.println(lst);

			 FileInputStream fis=new FileInputStream("./data/input.xlsx");
			 Workbook wb = WorkbookFactory.create(fis);
			 Sheet sh = wb.getSheet("Sheet1");
			 for(int i=0;i<8;i++){
			 Row row = sh.createRow(i);
			 row.getCell(0,MissingCellPolicy.CREATE_NULL_AS_BLANK).setCellValue(lst.get(i));
			 }
			 wb.write(new FileOutputStream("./data/data.xlsx"));
	}
}
