package org.example;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ClientManage implements MyAction{         //客户管理
    private static final String ACTION_NAME ="clientmanage";
    private Scanner scanner=null;
    List<MyAction> actionList2= new ArrayList<MyAction>();
    ArrayList<Client> client = new ArrayList<Client>();


    public ClientManage(Scanner scanner,ArrayList<Client> client){
        this.scanner=scanner;
        this.client=client;
    }
    
    private void init(){
        DeleteClient deleteclient = new DeleteClient(scanner,client); //删除客户
        QueryClient queryclient = new QueryClient(scanner,client);         //查询
        ListClient listclient = new ListClient(client);                 //列出
        actionList2.add(deleteclient);
        actionList2.add(queryclient);
        actionList2.add(listclient);
    }

    public String getActionName(){
        return ClientManage.ACTION_NAME;
    }

    public void run(String[] args) {
        init();
        System.out.println("当前你在客户管理子菜单里.");
        String userInput="";
        while (true) {
            System.out.print("请输入指令,q退出> ");
            userInput = this.scanner.nextLine();
            if (userInput.equals("q")) {
                break;
            }
            String actionName = null;
            for(MyAction oneAction: actionList2) {
                actionName = oneAction.getActionName();
                if (userInput.equalsIgnoreCase(actionName)) {
                    oneAction.run(null);
                }
            }
            
            
        }
    }
}