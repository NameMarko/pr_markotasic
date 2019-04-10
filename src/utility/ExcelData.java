package utility;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.DataFormatter;

public class ExcelData {
	private static HSSFWorkbook WORK_BOOK;
	private static HSSFSheet SHEET;
	private static HSSFCell CELL;
	private static HSSFRow ROW;
	private static FileInputStream FILE_INPUT;
	private static FileOutputStream FILE_OUTPUT;
	private static DataFormatter FORMATTER;

	public static void setFile(String filePath, String sheetName) throws Exception {
		try {
			FILE_INPUT = new FileInputStream(filePath);
			WORK_BOOK = new HSSFWorkbook(FILE_INPUT);
			SHEET = WORK_BOOK.getSheet(sheetName);
			FORMATTER = new DataFormatter();
		} catch (Exception e) {
			throw (e);
		}
	}

	public static String getData(int rNum, int cNum) {
		CELL = SHEET.getRow(rNum).getCell(cNum);
		String cData = FORMATTER.formatCellValue(CELL);
		return cData;
	}

	public static void setData(String data, int rNum, int cNum) throws Exception {
		ROW = SHEET.getRow(rNum);
		CELL = ROW.getCell(cNum);

		if (CELL == null) {
			CELL = ROW.createCell(cNum);
			CELL.setCellValue(data);
		} else {
			CELL.setCellValue(data);
		}
		FILE_OUTPUT = new FileOutputStream(Cons.path + Cons.file);
		WORK_BOOK.write(FILE_OUTPUT);
		FILE_OUTPUT.flush();
		FILE_OUTPUT.close();
	}

	public static void setDoubleData(double data, int rNum, int cNum) throws Exception {
		ROW = SHEET.getRow(rNum);
		CELL = ROW.getCell(cNum);

		if (CELL == null) {
			CELL = ROW.createCell(cNum);
			CELL.setCellValue(data);
		} else {
			CELL.setCellValue(data);
		}
		FILE_OUTPUT = new FileOutputStream(Cons.path + Cons.file);
		WORK_BOOK.write(FILE_OUTPUT);
		FILE_OUTPUT.flush();
		FILE_OUTPUT.close();
	}

	public static int rowCount() {
		return SHEET.getLastRowNum() + 1;
	}
}
