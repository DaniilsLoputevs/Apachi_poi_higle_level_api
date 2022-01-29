package xlsx.tools;

import org.apache.poi.ss.usermodel.Sheet;
import xlsx.core.ExcelSheetConfig;
import xlsx.utils.Pair;

import static xlsx.core.ExcelBook.ABOUT_STANDARD_WIDTH_EXCEL_CHAR;

public class ExcelSheetConfigs {
    
    public static ExcelSheetConfig config() {
        return new ExcelSheetConfig();
    }
    
    /**
     * If the appearance of the report is important to you, choose the width for your font.
     * You can set the width in excel pixels using method below {@link ExcelSheetConfigs#columnWidth(int, double)}.
     * See more info about column width in {@link Sheet#setColumnWidth}
     *
     * @param colIndex -
     * @param width    the width is set in units, for different fonts, it can be a DIFFERENT that real width will bee.
     * @return option for ExcelSheetConfig.
     */
    public static Pair<Integer, Double> columnWidth(int colIndex, int width) {
        return new Pair<>(colIndex, (double) (width * ABOUT_STANDARD_WIDTH_EXCEL_CHAR));
    }
    
    public static Pair<Integer, Double> columnWidth(int colIndex, double width) {
        return new Pair<>(colIndex, width);
    }
    
}