package utility.dataConfig;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;


public class ReadExcel {


    File src=null;
    FileInputStream fis=null;
    XSSFWorkbook wb= null;
    XSSFSheet sh;
    XSSFRow row=null;
    XSSFCell cell=null;

    public ReadExcel()
    {
        try
        {
            String dir = System.getProperty("user.dir");
            String path = dir + "\\testData\\AutomationAssignment.xlsx";
            File src= new File(path);
            fis=new FileInputStream(src);
            wb= new XSSFWorkbook(fis);
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
    public String getData(int sheetNo, int row, int col)
    {
        sh=wb.getSheetAt(sheetNo);
        cell=sh.getRow(row).getCell(col);

        if(cell.getCellTypeEnum()==CellType.NUMERIC)
        {
            int data1= (int) cell.getNumericCellValue();
            return Integer.toString(data1);

        }
			/*else if(cell.getCellTypeEnum()==CellType.NUMERIC)
			{
				Double d1= cell.getNumericCellValue();
				return Double.toString(d1);

			}*/
        else if(cell.getCellTypeEnum()== CellType.STRING)
        {
            return cell.getStringCellValue();
        }
        else
            return cell.getStringCellValue();
    }

    public int getRowCount(int sheetIndex)
    {
        sh=wb.getSheetAt(sheetIndex);
        int rowCount=sh.getLastRowNum();
        return rowCount;

    }
    public int getColCount(int sheetIndex)
    {
        sh=wb.getSheetAt(sheetIndex);
        row=sh.getRow(0);
        int colCount=row.getLastCellNum();
        return colCount;
    }
    public int sheetCount() {
        int sheetCount =wb.getNumberOfSheets();
        return sheetCount;
    }



}
