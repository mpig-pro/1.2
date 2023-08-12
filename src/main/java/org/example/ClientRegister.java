package org.example;

import java.util.Scanner;
import java.util.ArrayList;

public class ClientRegister implements MyAction {

    private static final String ACTION_NAME = "register";

    private Scanner scanner = null;
    ArrayList<Users>  users = new ArrayList<Users>();

    public ClientRegister(Scanner scanner, ArrayList<Users> users) {
        this.scanner = scanner;
        this.users = users;
    }

    @Override
    public String getActionName() {
        return ClientRegister.ACTION_NAME;
    }

    @Override
    public void run(String[] args) {
        System.out.println("现在你在客户注册子菜单里.");
        System.out.print("请输入用户名:");
        String username=null;
        while(true){
            username = this.scanner.nextLine();
            if(username.length()<5){
                System.out.print("用户名长度不少于5个字符,请重新输入用户名:");
            }
            else 
                break;
        }
           
        System.out.print("请输入密码:");
        String password = null;
        while(true){
            password = this.scanner.nextLine();
            if(password.length()<=8){
                System.out.print("密码长度大于8个字符,请重新输入密码:");
                continue;
            }
            int flag=1;
            for(int i=0;i<password.length();i++){
                if(password.charAt(i)>126 || password.charAt(i)<33){
                    System.out.print("密码必须由大小写字母，数字和标点符号组成,请重新输入密码:");
                    flag=0;
                    break;
                }
            }
            if(flag==0)
                continue;
            break;    
            
        }
        int id=users.size()+1;
        Users user = new Users(id,username,password,"client");
        users.add(user);
        if(users.size()==id)
            System.out.println("注册成功");
        else
            System.out.println("注册失败");    
        //this.clientAccount.register(username, password); 
            
    }
    
}
