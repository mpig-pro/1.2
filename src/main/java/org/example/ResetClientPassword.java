package org.example;
import java.util.ArrayList;
import java.util.Scanner;

public class ResetClientPassword implements MyAction{
    private static final String ACTION_NAME = "reset";
    ArrayList<Users> users = new ArrayList<Users>();

    private Scanner scanner = null;

    public ResetClientPassword(Scanner scanner,ArrayList<Users> users){
        this.scanner = scanner;
        this.users=users;
    }

    public String getActionName(){
        return ResetClientPassword.ACTION_NAME;
    }


    public void run(String[] args){
        String username;
        String newpassword = "1234abcd";
        System.out.print("请输入重置密码客户的用户名: ");
        username=this.scanner.nextLine();
        int flag=0;
        for(Users user : users){
            if(user.getName().equals(username)){
                user.updatePass(newpassword);
                flag=1;
                break;
            }
        }
        if(flag==1)
            System.out.println("重置密码成功");
        else
            System.out.println("重置密码失败");

    }
}