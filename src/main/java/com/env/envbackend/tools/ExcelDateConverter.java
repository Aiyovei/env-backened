package com.env.envbackend.tools;

import java.time.LocalDate;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class ExcelDateConverter {

    // Excel的起始日期是从1900年1月1日开始，但因为1900年被认为是闰年的错误，
    // 所以实际上应该减去1天。
    private static final LocalDate EXCEL_EPOCH = LocalDate.of(1899, 12, 30);

    public static Date convertFromExcelDate(int excelDate) {
        LocalDate localDate = EXCEL_EPOCH.plusDays(excelDate);
        // 将LocalDate转换为Date
        return Date.from(localDate.atStartOfDay(ZoneId.systemDefault()).toInstant());
    }

//    public static void main(String[] args) {
//        int excelDateSerial = 44927; // 这里输入你的Excel日期序列号
//        LocalDate localDate = convertFromExcelDate(excelDateSerial);
//        System.out.println("转换后的日期: " + localDate);
//    }
}