package org.example;
import java.util.Scanner;
import java.util.ArrayList;

public class ModifyPassword implements MyAction{
    private static final String ACTION_NAME = "modify";
    private Scanner scanner = null;
    ArrayList<Users> users= new ArrayList<Users>();

    public ModifyPassword(Scanner scanner,ArrayList<Users> users){
        this.scanner = scanner;
        this.users = users;
    }

    public String getActionName(){
        return ModifyPassword.ACTION_NAME;
    }

    public void run(String[] args){
        String newPassword;
        System.out.print("请输入用户名:");
        String username=this.scanner.nextLine();
        System.out.print("请输入新密码(大于8个字符,由大小写字母、数字和标点符号组成 ):");
        newPassword=this.scanner.nextLine();
        int flag=0;
        System.out.println(username);
        for(Users user : users){
            
            if(user.getName().equals(username)){
                flag=1;
                user.updatePass(newPassword);
                break;
            }
        }
        if(flag==1)
            System.out.println("密码修改成功");
        else
            System.out.println("密码修改失败");    

    }
}