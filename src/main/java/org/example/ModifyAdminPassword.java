package org.example;
import java.util.ArrayList;
import java.util.Scanner;

public class ModifyAdminPassword implements MyAction{
    private static final String ACTION_NAME = "modify";
    private Scanner scanner = null;
    ArrayList<Users> users = new ArrayList<Users>();
    public ModifyAdminPassword(Scanner scanner,ArrayList<Users> users){
        this.scanner = scanner;
        this.users=users;
    }

    public String getActionName(){
        return ModifyAdminPassword.ACTION_NAME;
    }

    public void run(String[] args){
        String adminname;
        String newPassword;
        System.out.print("请输入管理员用户名:");
        adminname=this.scanner.nextLine();
        System.out.print("请输入新密码:");
        newPassword=this.scanner.nextLine();
        int flag=0;
        for(Users user : users){
            if(user.getName().equals(adminname)){
                user.updatePass(newPassword);
                flag=1;
                break;
            }
        }
        if(flag==1)
            System.out.println("管理员密码修改成功");
        else
            System.out.println("管理员密码修改失败");    


    }
}