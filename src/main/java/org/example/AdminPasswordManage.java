package org.example;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AdminPasswordManage implements MyAction{   //管理员密码管理
    private static final String ACTION_NAME ="passwordManage";
    private Scanner scanner=null;
    private List<MyAction> actionList= new ArrayList<MyAction>();
    ArrayList<Users> users = new ArrayList<Users>();

    public AdminPasswordManage(Scanner scanner,ArrayList<Users> users){
        this.scanner=scanner;
        this.users=users;
    }
    
    private void init(){
        ModifyAdminPassword modify = new ModifyAdminPassword(scanner,users);   //修改管理员密码
        ResetClientPassword  reset= new ResetClientPassword(scanner,users);     // 重置客户密码
        actionList.add(modify);
        actionList.add(reset);
     
    }

    public String getActionName(){
        return AdminPasswordManage.ACTION_NAME;
    }

    public void run(String[] args) {
        init();
        System.out.println("当前你在管理员的密码管理子菜单.");
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

