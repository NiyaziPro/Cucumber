package techproed.utilities;

import org.testng.annotations.DataProvider;

public class DataProviderUtilities {

    //Boundary Value Analysis (sınır değer analizi)
    //Equivalance Partitioning (eş değer analizi)

    @DataProvider(name = "positiveTestData")
    public static Object[][] provideBoundaryValueTestData() {
        return new Object[][]{
                {"18"},    // Alt sınır
                {"30"},  // Geçerli yaş
                {"100"},   // Üst sınır
        };
    }

    @DataProvider(name = "negativeTestData")
    public static Object[][] provideNegativeTestData() {
        return new Object[][]{
                {"17"},   // Alt sınırın altı
                {"101"}   // Üst sınırın üstü
        };
    }

    @DataProvider(name = "invalidTestData")
    public static Object[][] provideinvalidTestData() {
        return new Object[][]{
                {"ali"},   // invalidTestData
                {"?"},
                {"-5"}
        };
    }

    @DataProvider(name = "US10_passwords")
    public Object[][] US10_passwords() {
        String excelPath="resources/data_sheet.xlsx";
        String sheetName="US10_TC01";
        ExcelUtils excelUtils = new ExcelUtils(excelPath,sheetName);
        Object[][] returnInfo = excelUtils.getDataArrayWithoutFirstRow();
        return returnInfo;
              // {"admin08@gmail.com","123a","Too short"},
              // {"admin08@gmail.com","123a123","Weak"},
              // {"admin08@gmail.com","123a123ad","Good"},
              // {"admin08@gmail.com","admin123.?","Strong"}
    }
    @DataProvider(name = "US04_passwords")
    public Object[][] US04_passwords() {
        String excelPath="resources/data_sheet.xlsx";
        String sheetName="US04_TC01";
        ExcelUtils excelUtils = new ExcelUtils(excelPath,sheetName);
        Object[][] returnInfo = excelUtils.getDataArrayWithoutFirstRow();
        return returnInfo;
        // {"admin08@gmail.com","123a","Too short"},
        // {"admin08@gmail.com","123a123","Weak"},
        // {"admin08@gmail.com","123a123ad","Good"},
        // {"admin08@gmail.com","admin123.?","Strong"}
    }


}
