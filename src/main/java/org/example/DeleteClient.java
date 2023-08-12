package org.example;
import java.util.Scanner;
import java.util.ArrayList;

public class DeleteClient implements MyAction{
    private static final String ACTION_NAME="delete";
    ArrayList<Client> client = new ArrayList<Client>();

    Scanner scanner = null;

    public DeleteClient(Scanner scanner,ArrayList<Client> client){
        this.scanner=scanner;
        this.client=client;
    }

    public String getActionName(){
        return DeleteClient.ACTION_NAME;
    }

    public void run(String[] args){
        String username;
        System.out.print("请输入要删除客户的用户名 :");
        username=scanner.nextLine();
        int flag=0;
        for(Client client1 : client){
            if(client1.getName().equals(username)){
                client.remove(client1);
                flag=1;
                break;
            }
        }
        if(flag==1)
            System.out.println("删除客户成功");
        else
            System.out.println("删除客户失败");    
    
    }
}