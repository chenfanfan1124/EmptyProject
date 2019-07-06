package com.imooc.excel2;

import org.apache.commons.io.FileUtils;
import org.apache.poi.hssf.usermodel.*;
import org.apache.poi.ss.usermodel.CellStyle;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class CreteTemplate2 {

	/**
	 * 创建模板文件
	 * @author David
	 * @param args
	 */
	public static void main(String[] args) {

		//创建Excel工作簿
		HSSFWorkbook workbook = new HSSFWorkbook();
		//创建一个工作表sheet
		HSSFSheet sheet = workbook.createSheet();
		//创建第一行
		HSSFRow row = sheet.createRow(0);
		sheet.setColumnWidth(1, 10000);
		HSSFCell cell = row.createCell(0);
		cell.setCellType(1);
		cell.setCellValue("fdfsdfsdf");
		HSSFCellStyle cellStyle = workbook.createCellStyle();
		HSSFDataFormat format = workbook.createDataFormat();
		format.getFormat("");

		File file = new File("e:/poi_test.xls");
		try {
			file.delete();
			file.createNewFile();
			//将Excel内容存盘
			FileOutputStream stream = FileUtils.openOutputStream(file);
			workbook.write(stream);
			stream.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
