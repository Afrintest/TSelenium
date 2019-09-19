package testng;

import java.io.File;
import java.io.IOException;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;

public class LoadPdf {
	
	public static void main(String[] args) throws IOException {
		File src=new File("./data/Cover.pdf");
		PDDocument pdf=PDDocument.load(src);
		PDFTextStripper strip=new PDFTextStripper();
		String str=strip.getText(pdf);
		System.out.println(str);		
	}

}
