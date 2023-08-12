package org.example;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;
public class ForgetPassword implements MyAction{                   //忘记密码
    private static final String ACTION_NAME = "forget";
    ArrayList<Users> users= new ArrayList<Users>();
    private Scanner scanner = null;

    public ForgetPassword(Scanner scanner,ArrayList<Users> users){
        this.scanner = scanner;
        this.users = users;
    }

    public String getActionName(){
        return ForgetPassword.ACTION_NAME;
    }

    public String getRandomString(int length){               //随机生成密码
        Random random=new Random();
        StringBuffer sb=new StringBuffer();
        for(int i=0;i<length;i++){
            int number=random.nextInt(33)+94;
            char c=(char)number;
            sb.append(c);
        }
        return sb.toString();
    }

    public void run(String[] args){
        String username;
        String emailaddress;
        String newpassword=getRandomString(10);
        System.out.print("请输入用户名: ");
        username=this.scanner.nextLine();
        System.out.print("请输入注册的邮箱地址:");
        emailaddress=this.scanner.nextLine();
        int flag=0;
        for(Users user : users){
            if(user.getName().equals(username)){
                flag=1;
                user.updatePass(newpassword);
                break;
            }
        }
        if(flag==1)
            System.out.println("密码重置成功，新密码为"+newpassword);
        else
            System.out.println("密码重置失败");    


    }
}