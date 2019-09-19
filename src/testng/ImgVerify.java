package testng;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import ru.yandex.qatools.ashot.comparison.ImageDiff;
import ru.yandex.qatools.ashot.comparison.ImageDiffer;

public class ImgVerify {
	
	public static void main(String[] args) throws IOException {
		
//		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
//		WebDriver driver=new ChromeDriver();
//		driver.get("https://www.bluestone.com/");
//		String img = driver.findElement(By.xpath("//img[@class='img-responsive-c']")).getAttribute("src");
//		System.out.println(img);
		
		
		BufferedImage expected=ImageIO.read(new File("./data/bluestone.png"));
		BufferedImage actual1=ImageIO.read(new File("./data/bluestone.png"));
		BufferedImage actual2=ImageIO.read(new File("./data/Ren-Lake.png"));
		
		ImageDiffer differ=new ImageDiffer();
		ImageDiff diff=differ.makeDiff(expected, expected);
		System.out.println(diff.hasDiff());
		diff=differ.makeDiff(expected, actual1);
		System.out.println(diff.hasDiff());
		diff=differ.makeDiff(expected, actual2);
		System.out.println(diff.hasDiff());
		
		try{
			Assert.assertFalse(diff.hasDiff(),"Images are different");
		}
		catch(AssertionError e){
			System.out.println(e.getMessage());
		}
	}

}
