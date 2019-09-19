package testng;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class CheckProperties {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		File src=new File("./data/test.properties");
		Properties prop=new Properties();
		prop.load(new FileInputStream(src));
		System.out.println(prop.getProperty("Name"));
		System.out.println(prop.getProperty("Learning"));
		
	}

}
