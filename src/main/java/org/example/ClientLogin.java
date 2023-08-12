package org.example;

import java.util.Scanner;
import java.util.ArrayList;

public class ClientLogin implements MyAction {

    private static final String ACTION_NAME = "login";

    private Scanner scanner = null;
    ArrayList<Users>  users = new ArrayList<Users>();

    public ClientLogin(Scanner scanner, ArrayList<Users> users) {
        this.scanner = scanner;
        this.users = users;
    }

    @Override
    public String getActionName() {
        return ClientLogin.ACTION_NAME;
    }

    @Override
    public void run(String[] args) {
        System.out.println("现在你在客户户登录子菜单");
        System.out.print("用户名：");
        String username = this.scanner.nextLine();

        System.out.print("密码:");
        String password = this.scanner.nextLine();
        int flag=0;
        for(Users user : users){
            if(user.getName().equals(username)){
                flag=1;
                if(user.getPass().equals(password )){
                    System.out.println("登录成功");
                    break;
                }
                    
                else{
                    System.out.println("密码错误");
                    break;
                }
                        
            }
        }
        if(flag==0)
            System.out.println("用户不存在");

        //this.clientAccount.login(username, password);
        
            

        
    }
    
}