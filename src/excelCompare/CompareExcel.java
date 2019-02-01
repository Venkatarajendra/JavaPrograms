package excelCompare;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class CompareExcel {
	
	public void compare(String path1, int shtID1, String path2, int shtID2) throws IOException {
		
		FileInputStream fis1 = new FileInputStream(path1);
		FileInputStream fis2 = new FileInputStream(path2);
		XSSFWorkbook wb1 = new XSSFWorkbook(fis1);
		XSSFWorkbook wb2 = new XSSFWorkbook(fis2);
		
		int rc1 = wb1.getSheetAt(shtID1).getLastRowNum();
		int rc2 = wb2.getSheetAt(shtID2).getLastRowNum();
		int cc1 = wb1.getSheetAt(shtID1).getRow(0).getLastCellNum();
		int cc2 = wb2.getSheetAt(shtID2).getRow(0).getLastCellNum();
		
		System.out.println("Rowcount1 = "+rc1+" Rowcount2 = "+rc2);
		System.out.println("ColumnCount1 = "+cc1+" and ColumnCount2 = "+cc2);
		
		if (rc1 == rc2 && cc1==cc2) {
			
			for(int i = 0; i<=rc1; i++) {
				
				for (int k = 0; k<cc1; k++) {
					
					String s1 = wb1.getSheetAt(shtID1).getRow(i).getCell(k).getStringCellValue();
					String s2 = wb2.getSheetAt(shtID2).getRow(i).getCell(k).getStringCellValue();
					System.out.println("s1= "+s1+" and s2= "+s2);
					
					if(s1.equals(s2)) {
						System.out.println("Matched");
					}
					else {
						System.out.println("Not Matched");
						XSSFCell curCell = wb2.getSheetAt(shtID2).getRow(i).getCell(k);
						XSSFCellStyle cstyle = wb2.createCellStyle();
						cstyle.setFillPattern(XSSFCellStyle.SOLID_FOREGROUND);
						cstyle.setFillForegroundColor(IndexedColors.RED.index);
						curCell.setCellStyle(cstyle);
						FileOutputStream out = new FileOutputStream(path2);
						wb2.write(out);
						out.close();
					}
					
				}			
				
			}
			
			
		}
		
		wb1.close();
		wb2.close();		
	}

	public static void main(String[] args) throws IOException {
		
		String path1 = "E:\\Webdriverwork\\ActualSheet.xlsx";
		String path2 = "E:\\Webdriverwork\\ExpectedSheet.xlsx";
		int shtID1 = 0;
		int shtID2 = 0;
		CompareExcel compXL = new CompareExcel();
		compXL.compare(path1, shtID1, path2, shtID2);
		
		
	}

}
