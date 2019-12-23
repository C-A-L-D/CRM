package com.sc.entity;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.util.HSSFColor;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.ss.util.CellRangeAddress;
import org.apache.poi.xssf.usermodel.XSSFFont;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sc.service.SysUsersInfoService;

import java.io.*;
import java.util.ArrayList;
import java.util.List;


public class Ygexcel {
/*	@Autowired
	SysUsersInfoService sysUsersInfoService;
	
    *//**
     * 生成Excel
     *//*
	
    public void zxExprotExcelXLSX() {
        XSSFWorkbook wb = new XSSFWorkbook();
        Sheet sheet = wb.createSheet("0");
        for (int i = 0; i < 9; i++) {
            sheet.setColumnWidth(i, 4300);
        }

        *//**
         * 单元格 样式
         *//*
        CellStyle cellStyle = wb.createCellStyle();
        cellStyle.setBorderTop(BorderStyle.THIN);
        cellStyle.setBorderBottom(BorderStyle.THIN);
        cellStyle.setBorderLeft(BorderStyle.THIN);
        cellStyle.setBorderRight(BorderStyle.THIN);
        cellStyle.setTopBorderColor(HSSFColor.BLACK.index);
        cellStyle.setBottomBorderColor(HSSFColor.BLACK.index);
        cellStyle.setLeftBorderColor(HSSFColor.BLACK.index);
        cellStyle.setRightBorderColor(HSSFColor.BLACK.index);
        cellStyle.setAlignment(HSSFCellStyle.ALIGN_CENTER); // 水平居中
        cellStyle.setVerticalAlignment(HSSFCellStyle.VERTICAL_CENTER); // 上下居中

        *//**
         * 标题样式 样式
         *//*
        XSSFFont titleFont = wb.createFont();
        titleFont.setFontHeight(24);
        titleFont.setBold(true);
        CellStyle titleCellStyle = wb.createCellStyle();
        titleCellStyle.setBorderTop(BorderStyle.THIN);
        titleCellStyle.setBorderBottom(BorderStyle.THIN);
        titleCellStyle.setBorderLeft(BorderStyle.THIN);
        titleCellStyle.setBorderRight(BorderStyle.THIN);
        titleCellStyle.setTopBorderColor(HSSFColor.BLACK.index);
        titleCellStyle.setBottomBorderColor(HSSFColor.BLACK.index);
        titleCellStyle.setLeftBorderColor(HSSFColor.BLACK.index);
        titleCellStyle.setRightBorderColor(HSSFColor.BLACK.index);
        titleCellStyle.setAlignment(HSSFCellStyle.ALIGN_CENTER); // 水平居中
        titleCellStyle.setVerticalAlignment(HSSFCellStyle.VERTICAL_CENTER); // 上下居中
        titleCellStyle.setFont(titleFont);

        *//**
         * 主 标题 在这里插入主标题
         *//*
        Row titleRow;
        Cell titleCell;
        sheet.addMergedRegion(new CellRangeAddress((short) 0, (short) 2, (short) 0, (short) 8));
        for (int i = 0; i <= 2; i++) {
            titleRow = sheet.createRow(i);
            for (int j = 0; j < 9; j++) {
                titleCell = titleRow.createCell(j);
                titleCell.setCellType(CellType.STRING);
                titleCell.setCellStyle(titleCellStyle);
                titleCell.setCellValue("员工信息表");
            }
        }

        *//**
         * 列 标题 在这里插入标题
         *//*
        List<SysUsersInfo> list = sysUsersInfoService.select();
        for (SysUsersInfo sysUsersInfo : list) {
        	sysUsersInfo.getSid();
        	sysUsersInfo.getSname();
        	sysUsersInfo.getSsex();
        	sysUsersInfo.getSphoto();
        	sysUsersInfo.getSidcard();
        	sysUsersInfo.getSaddressHome();
        	sysUsersInfo.getSxl();
        	sysUsersInfo.getSzzmm();
        	sysUsersInfo.getSphone();
        	sysUsersInfo.getSphoneLine();
        	sysUsersInfo.getSchatLine();
        	sysUsersInfo.getSshStatus();
        	sysUsersInfo.getSjobid();
        	sysUsersInfo.getSstatus();
        	sysUsersInfo.getSdescribe();
        	sysUsersInfo.getGongsiid();
        	sysUsersInfo.getLasttime();
        	//17
        	
     	
		}
        
        Row rowLabel;
        Cell cellLabel;
        for (int i = 3; i < 4; i++) {
            rowLabel = sheet.createRow(i);
            for (int j = 0; j < 9; j++) {
                cellLabel = rowLabel.createCell(j);
                cellLabel.setCellType(CellType.STRING);
                cellLabel.setCellStyle(cellStyle);
                cellLabel.setCellValue("测试标题列【" + (j + 1) + "】");
                
           }
        }

        *//**
         * 列 数据 在这里插入数据
         *//*
        Row rowCheck;
        Cell cellCheck;
        for (int i = 3; i < 2000; i++) {
            rowCheck = sheet.createRow((i + 1));
            for (int j = 0; j < 9; j++) {
                cellCheck = rowCheck.createCell(j);
                cellCheck.setCellType(CellType.STRING);
                cellCheck.setCellStyle(cellStyle);
                cellCheck.setCellValue("测试 - 0" + (i - 2));
            }
        }
        for (SysUsersInfo sysUsersInfo : list) {
            Row row = sheet.createRow(cell);//从第二行开始保存数据
            row.createCell(0).setCellValue(cell);
            row.createCell(1).setCellValue(goods.getGname());//将数据库的数据遍历出来
            row.createCell(2).setCellValue(goods.getGprice());
            row.createCell(3).setCellValue(goods.getTid());
            cell++;
        }

        *//**
         * 页脚
         *//*
        setExcelFooterName("测试", 0, wb);

        *//**
         * 进行导出
         *//*
        exportOutPutExcel("D:\\excel\\ExportExcel.xlsx", wb);

    }

    *//**
     * 设置Excel页脚
     *//*
    public void setExcelFooterName(String customExcelFooterName, int setExcelFooterNumber, XSSFWorkbook wb) {
        wb.setSheetName(setExcelFooterNumber, customExcelFooterName);
    }

    *//**
     * 输出流 导出Excel到桌面
     *//*
    public void exportOutPutExcel(String exportPositionPath, XSSFWorkbook wb) {
        try {
            File file = new File(exportPositionPath);
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            wb.write(fileOutputStream);
            fileOutputStream.close();
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        new Ygexcel().zxExprotExcelXLSX();
    }

	*/
}
