package com.mmp.utils;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcellLib {
	XSSFWorkbook Workbook;

public ExcellLib(String xlpath)
{
	try 
	{
		File src = new File(xlpath);
		FileInputStream fil = new FileInputStream(src);
	    Workbook = new XSSFWorkbook(fil);
	}
	 catch (Exception e) 
	{
		e.printStackTrace();
	}
	
}

public int getRowCount(int sheetnum)
{
	return Workbook.getSheetAt(sheetnum).getLastRowNum()+1;
	
}
public String getcellData(int sheetnum, int row, int col)
{
	return Workbook.getSheetAt(sheetnum).getRow(row).getCell(col).toString();
	
}

}
