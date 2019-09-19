package intro;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.usermodel.Row.MissingCellPolicy;

public class ExcelWrite {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream fis=new FileInputStream("./data/Employees.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		Sheet sh= wb.getSheet("Sheet1");
		
		for(int i=0;i<6;i++){
			Row row=sh.getRow(i);
			String value = row.getCell(0,MissingCellPolicy.CREATE_NULL_AS_BLANK).getStringCellValue();
			System.out.println(value);
		}
		
		int k=1;
		for(int i=1;i<6;i++){		
			for(int j=1;j<2;j++){
				Row row = sh.getRow(i);
				row.getCell(1,MissingCellPolicy.CREATE_NULL_AS_BLANK).setCellValue(1050+k);
			}
			k++;
		}
		
		wb.write(new FileOutputStream("./data/Employees.xlsx"));
		System.out.println("Excel is updated successfully");
	}

}
