package excelReading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Tabelreading {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		File myfile=new File("E:\\shubham.xlsx");
		Sheet sheets1 = WorkbookFactory.create(myfile).getSheet("Sheet1");
		
		
		
		for(int i=0;i<=2;i++) {
			for(int j=0;j<=2;j++) {
				String value = sheets1.getRow(i).getCell(j).getStringCellValue();
				System.out.print(value+"  ");
				
			}
			System.out.println();
		}
		
		
		
	}

}
