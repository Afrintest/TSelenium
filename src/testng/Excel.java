package testng;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
//		FileInputStream fis=new FileInputStream("./data/input.xlsx");
//		Workbook wb = WorkbookFactory.create(fis);
//		Sheet sh=wb.getSheet("Sheet1");
//		
//		for(int i=0;i<=2;i++){
//			Row row=sh.getRow(i);
//			for(int j=0;j<row.getLastCellNum();j++){
////		short lastcellnum = row.getLastCellNum();
////		System.out.println(lastcellnum);
//		Cell col = row.getCell(j);
//		String value = col.getStringCellValue();
//		System.out.println(value);
//			}
//		}
		
		File directory=new File("./images");
		File[] img = directory.listFiles();
		for(File f:img){
			if(f.isFile()){
				try {
					FileUtils.copyFile(f, new File("./photos"));
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

	}

}
