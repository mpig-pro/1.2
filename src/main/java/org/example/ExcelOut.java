package org.example;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

public class ExcelOut{
    public static String PATH1 = "/workspace/1.2/src/main/java/org/example/Users.xlsx";
    public static String PATH2 = "/workspace/1.2/src/main/java/org/example/Cart.xlsx";
    public static String PATH3 = "/workspace/1.2/src/main/java/org/example/Client.xlsx";
    public static String PATH4 = "/workspace/1.2/src/main/java/org/example/Goods.xlsx";
    public static String PATH5 = "/workspace/1.2/src/main/java/org/example/History.xlsx";

    
    public static void outUsers(ArrayList<Users> users) throws FileNotFoundException,IOException{
    
        Workbook workbook = new XSSFWorkbook();
        
        Sheet sheet = workbook.createSheet("Users");
        Row row = sheet.createRow(0);
        row.createCell(0).setCellValue("id");
        row.createCell(1).setCellValue("username");
        row.createCell(2).setCellValue("password");
        row.createCell(3).setCellValue("type");
        for(int i=0;i<users.size();i++){
            Row row1 = sheet.createRow(i+1);
            row1.createCell(0).setCellValue(users.get(i).getId());
            row1.createCell(1).setCellValue(users.get(i).getName());
            row1.createCell(2).setCellValue(users.get(i).getPass());
            row1.createCell(3).setCellValue(users.get(i).getType());
        }

        FileOutputStream outputStream = new FileOutputStream(PATH1);
        workbook.write(outputStream);
        outputStream.flush();
        outputStream.close();
        workbook.close();

    }

    public static void outCart(ArrayList<Cart> cart) throws FileNotFoundException,IOException{
    
        Workbook workbook = new XSSFWorkbook();
        
        Sheet sheet = workbook.createSheet("Cart");
        Row row = sheet.createRow(0);
        row.createCell(0).setCellValue("id");
        row.createCell(1).setCellValue("price");
        row.createCell(2).setCellValue("number");
        for(int i=0;i<cart.size();i++){
            Row row1 = sheet.createRow(i+1);
            row1.createCell(0).setCellValue(cart.get(i).getId());
            row1.createCell(1).setCellValue(cart.get(i).getPrice());
            row1.createCell(2).setCellValue(cart.get(i).getNum());
        }

        FileOutputStream outputStream = new FileOutputStream(PATH2);
        workbook.write(outputStream);
        outputStream.flush();
        outputStream.close();
        workbook.close();

    }

    public static void outClient(ArrayList<Client> client) throws FileNotFoundException,IOException{
    
        Workbook workbook = new XSSFWorkbook();
        
        Sheet sheet = workbook.createSheet("Client");
        Row row = sheet.createRow(0);
        row.createCell(0).setCellValue("id");
        row.createCell(1).setCellValue("username");
        row.createCell(2).setCellValue("grade");
        row.createCell(3).setCellValue("registertime");
        row.createCell(4).setCellValue("totalconsumption");
        row.createCell(5).setCellValue("phonenumber");
        row.createCell(6).setCellValue("email");

        for(int i=0;i<client.size();i++){
            Row row1 = sheet.createRow(i+1);
            row1.createCell(0).setCellValue(client.get(i).getId());
            row1.createCell(1).setCellValue(client.get(i).getName());
            row1.createCell(2).setCellValue(client.get(i).getGrade());
            row1.createCell(3).setCellValue(client.get(i).getRegtime());
            row1.createCell(4).setCellValue(client.get(i).getCost());
            row1.createCell(5).setCellValue(client.get(i).getPhone());
            row1.createCell(6).setCellValue(client.get(i).getEmail());
        }

        FileOutputStream outputStream = new FileOutputStream(PATH3);
        workbook.write(outputStream);
        outputStream.flush();
        outputStream.close();
        workbook.close();

    }

    public static void outGoods(ArrayList<Goods> goods) throws FileNotFoundException,IOException{
    
        Workbook workbook = new XSSFWorkbook();
        
        Sheet sheet = workbook.createSheet("Goods");
        Row row = sheet.createRow(0);
        row.createCell(0).setCellValue("id");
        row.createCell(1).setCellValue("goodsname");
        row.createCell(2).setCellValue("producer");
        row.createCell(3).setCellValue("price");
        row.createCell(4).setCellValue("number");

        for(int i=0;i<goods.size();i++){
            Row row1 = sheet.createRow(i+1);
            row1.createCell(0).setCellValue(goods.get(i).getId());
            row1.createCell(1).setCellValue(goods.get(i).getName());
            row1.createCell(2).setCellValue(goods.get(i).getProducer());
            row1.createCell(3).setCellValue(goods.get(i).getPrice());
            row1.createCell(4).setCellValue(goods.get(i).getNum());
        }

        FileOutputStream outputStream = new FileOutputStream(PATH4);
        workbook.write(outputStream);
        outputStream.flush();
        outputStream.close();
        workbook.close();

    }

    public static void outHistory(ArrayList<History> history) throws FileNotFoundException,IOException{
    
        Workbook workbook = new XSSFWorkbook();
        
        Sheet sheet = workbook.createSheet("History");
        Row row = sheet.createRow(0);
        row.createCell(0).setCellValue("id");
        row.createCell(1).setCellValue("price");
        row.createCell(2).setCellValue("number");
        row.createCell(3).setCellValue("time");

        for(int i=0;i<history.size();i++){
            Row row1 = sheet.createRow(i+1);
            row1.createCell(0).setCellValue(history.get(i).getId());
            row1.createCell(1).setCellValue(history.get(i).getPrice());
            row1.createCell(2).setCellValue(history.get(i).getNum());
            row1.createCell(3).setCellValue(history.get(i).getTime());

        }

        FileOutputStream outputStream = new FileOutputStream(PATH5);
        workbook.write(outputStream);
        outputStream.flush();
        outputStream.close();
        workbook.close();

    }
    
}

