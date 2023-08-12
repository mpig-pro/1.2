package org.example;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ClientPasswordManage implements MyAction{                          //客户密码管理
    private static final String ACTION_NAME ="passwordManage";
    private Scanner scanner=null;
    private List<MyAction> actionList= new ArrayList<MyAction>();
    ArrayList<Users> users= new ArrayList<Users>();

    public ClientPasswordManage(Scanner scanner,ArrayList<Users> users){
        this.scanner=scanner;
    }
    
    private void init(){
        ModifyPassword modifypassword = new ModifyPassword(scanner,users);  //修改密码
        ForgetPassword  forgetpassword = new ForgetPassword(scanner,users);             //忘记密码，重置
        actionList.add(modifypassword);
        actionList.add(forgetpassword);
     
    }

    public String getActionName(){
        return ClientPasswordManage.ACTION_NAME;
    }

    public void run(String[] args) {
        init();
        System.out.println("当前你在客户密码管理子菜单里");
        String userInput="";
        while (true) {
            System.out.print("请输入指令,q退出> ");
            userInput = this.scanner.nextLine();
            if (userInput.equals("q")) {
                break;
            }
            String actionName = null;
            for(MyAction oneAction: actionList) {
                actionName = oneAction.getActionName();
                if (userInput.equalsIgnoreCase(actionName)) {
                    oneAction.run(null);
                }
            }
            
            
        }
    }
}