package org.example;


import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

public class ExcelIn{
    public static String PATH1= "/workspace/1.2/src/main/java/org/example/Users.xlsx";
    public static String PATH2 = "/workspace/1.2/src/main/java/org/example/Cart.xlsx";
    public static String PATH3= "/workspace/1.2/src/main/java/org/example/Client.xlsx";
    public static String PATH4 = "/workspace/1.2/src/main/java/org/example/Goods.xlsx";
    public static String PATH5 = "/workspace/1.2/src/main/java/org/example/History.xlsx";
    
    public static ArrayList<Users> initUsers() throws IOException ,FileNotFoundException{

        ArrayList<Users> users = new ArrayList<Users>();
        //获取文件流
        FileInputStream inputStream = new FileInputStream(PATH1);
        //1.创建工作簿,使用excel能操作的这边都看看操作
        Workbook workbook = new XSSFWorkbook(inputStream);
        //2.得到表
        Sheet sheet = workbook.getSheet("Users");
        
        int rowlength = sheet.getLastRowNum();
        for(int i=1;i<=rowlength;i++){
            ArrayList<String> list = new ArrayList<String>();
            Row row = sheet.getRow(i);
            for(Cell cell : row){

                String value=cell.getStringCellValue().toString();
                list.add(value);
                
            }
            Users user = new Users(Integer.parseInt(list.get(0)),list.get(1),list.get(2),list.get(3));
            users.add(user);
        }
        inputStream.close();
        workbook.close();
        return users;
    }
    
    public static ArrayList<Cart> initCart() throws IOException ,FileNotFoundException{

        ArrayList<Cart> cart = new ArrayList<Cart>();
        //获取文件流
        FileInputStream inputStream = new FileInputStream(PATH2);
        //1.创建工作簿,使用excel能操作的这边都看看操作
        Workbook workbook = new XSSFWorkbook(inputStream);
        //2.得到表
        Sheet sheet = workbook.getSheet("Cart");
        
        int rowlength = sheet.getLastRowNum();
        for(int i=1;i<=rowlength;i++){
            ArrayList<String> list = new ArrayList<String>();
            Row row = sheet.getRow(i);
            for(Cell cell : row){
                String value=cell.getStringCellValue().toString();
                list.add(value);
                
            }
            Cart cart1= new Cart(Integer.parseInt(list.get(0)),Float.parseFloat(list.get(1)),Integer.parseInt(list.get(2)));
            cart.add(cart1);
        }
        inputStream.close();
        workbook.close();
        return cart;
    }
    public static ArrayList<Client> initClient() throws IOException ,FileNotFoundException{

        ArrayList<Client> client = new ArrayList<Client>();
        //获取文件流
        FileInputStream inputStream = new FileInputStream(PATH3);
        //1.创建工作簿,使用excel能操作的这边都看看操作
        Workbook workbook = new XSSFWorkbook(inputStream);
        //2.得到表
        Sheet sheet = workbook.getSheet("Client");
        
        int rowlength = sheet.getLastRowNum();
        for(int i=1;i<=rowlength;i++){
            ArrayList<String> list = new ArrayList<String>();
            Row row = sheet.getRow(i);
            for(Cell cell : row){
                
                String value=cell.getStringCellValue().toString();
                list.add(value);
                
            }
            Client client1= new Client(Integer.parseInt(list.get(0)),list.get(1),list.get(2),list.get(3),Float.parseFloat(list.get(4)),list.get(5),list.get(6));
            client.add(client1);
        }
        inputStream.close();
        workbook.close();
        return client;
    }
    public static ArrayList<Goods> initGoods() throws IOException ,FileNotFoundException{

        ArrayList<Goods> goods = new ArrayList<Goods>();
        //获取文件流
        FileInputStream inputStream = new FileInputStream(PATH4);
        //1.创建工作簿,使用excel能操作的这边都看看操作
        Workbook workbook = new XSSFWorkbook(inputStream);
        //2.得到表
        Sheet sheet = workbook.getSheet("Goods");
        
        int rowlength = sheet.getLastRowNum();
        for(int i=1;i<=rowlength;i++){
            ArrayList<String> list = new ArrayList<String>();
            Row row = sheet.getRow(i);
            for(Cell cell : row){
                String value=cell.getStringCellValue().toString();
                list.add(value);
                
            }
            Goods goods1= new Goods(Integer.parseInt(list.get(0)),list.get(1),list.get(2),Float.parseFloat(list.get(3)),Integer.parseInt(list.get(4)));
            goods.add(goods1);
        }
        inputStream.close();
        workbook.close();
        return goods;
    }
    public static ArrayList<History> initHistory() throws IOException ,FileNotFoundException{

        ArrayList<History> history = new ArrayList<History>();
        //获取文件流
        FileInputStream inputStream = new FileInputStream(PATH5);
        //1.创建工作簿,使用excel能操作的这边都看看操作
        Workbook workbook = new XSSFWorkbook(inputStream);
        //2.得到表
        Sheet sheet = workbook.getSheet("History");
        
        int rowlength = sheet.getLastRowNum();
        for(int i=1;i<=rowlength;i++){
            ArrayList<String> list = new ArrayList<String>();
            Row row = sheet.getRow(i);
            for(Cell cell : row){
                String value=cell.getStringCellValue().toString();
                list.add(value);
                
            }
            History history1= new History(Integer.parseInt(list.get(0)),Float.parseFloat(list.get(1)),Integer.parseInt(list.get(2)),list.get(3));
            history.add(history1);
        }
        inputStream.close();
        workbook.close();
        return history;
    }
}

