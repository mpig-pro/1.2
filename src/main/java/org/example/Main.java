package org.example;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) throws IOException,FileNotFoundException{
        ArrayList<Users>  users = new ArrayList<Users>();
        ArrayList<Cart>  cart = new ArrayList<Cart>();
        ArrayList<Client>  client = new ArrayList<Client>();
        ArrayList<Goods>  goods = new ArrayList<Goods>();
        ArrayList<History>  history = new ArrayList<History>();

        users = ExcelIn.initUsers();
        cart = ExcelIn.initCart();
        client = ExcelIn.initClient();
        goods = ExcelIn.initGoods();
        history = ExcelIn.initHistory();
        
        
        Scanner scanner = new Scanner(System.in);

        List<MyAction> clientActionList = new ArrayList<MyAction>(); //客户指令集

        ClientRegister clientRegister = new ClientRegister(scanner,users);
        clientActionList.add(clientRegister);

        ClientLogin clientLogin = new ClientLogin(scanner, users);
        clientActionList.add(clientLogin);

        ClientPasswordManage passwordManage = new ClientPasswordManage(scanner,users);
        clientActionList.add(passwordManage);

        Shopping shopping = new Shopping(scanner,cart,goods,history);
        clientActionList.add(shopping);

        List<MyAction> adminActionList = new ArrayList<MyAction>();           //管理员指令集

        AdminLogin adminLogin = new AdminLogin(scanner, users);
        adminActionList.add(adminLogin);

        GoodsManage goodsManage = new GoodsManage(scanner,goods);
        adminActionList.add(goodsManage);

        AdminPasswordManage adminPasswordManage = new AdminPasswordManage(scanner,users);
        adminActionList.add(adminPasswordManage);

        ClientManage clientManage = new ClientManage(scanner,client);
        adminActionList.add(clientManage);

        String input = "";
        System.out.print("确认你的身份client or admin :");
        input =scanner.nextLine();
        if(input.equals("client")){
            System.out.println("请先登录或者注册");
            while (true) {
                System.out.print("请输入你的指令, exit退出 > ");
                input = scanner.nextLine();

                if (input.equals("exit")) {
                    break;
                }
                
                String actionName = null;
                for(MyAction oneAction: clientActionList) {
                    actionName = oneAction.getActionName();
    
                    if (input.equalsIgnoreCase(actionName)) {
                        oneAction.run(null);
                    }
                }
    
            }
        }
        else if(input.equals("admin")){
            System.out.println("请先登录");
            while (true) {
                System.out.print("请输入你的指令, exit退出 > ");
                input = scanner.nextLine();
    
                if (input.equals("exit")) {
                    break;
                }
                
                String actionName = null;
                for(MyAction oneAction: adminActionList) {
                    actionName = oneAction.getActionName();
    
                    if (input.equalsIgnoreCase(actionName)) {
                        oneAction.run(null);
                    }
                }
    
            }
        }

        ExcelOut.outUsers(users);
        ExcelOut.outCart(cart);
        ExcelOut.outClient(client);
        ExcelOut.outGoods(goods);
        ExcelOut.outHistory(history);
        
        scanner.close();
        System.out.println("Done.");
    }
}