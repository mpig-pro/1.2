package org.example;
import java.util.Scanner;
import java.util.ArrayList;

public class QueryClient implements MyAction{
    private static final String ACTION_NAME="query";
    ArrayList<Client> client = new ArrayList<Client>();
    Scanner scanner = null;

    public QueryClient(Scanner scanner,ArrayList<Client> client){
        this.scanner=scanner;
        this.client=client;
    }

    public String getActionName(){
        return QueryClient.ACTION_NAME;
    }

    public void run(String[] args){
        int id;
        System.out.print("请输入查询客户的id:");
        id = scanner.nextInt();
        scanner.nextLine();
        System.out.println("id username grade registertime  totalconsumption  phonenumber     email ");
        for(Client client1 : client){
            if(client1.getId()==id){
                System.out.printf("%-3d",client1.getId());
                System.out.printf("%-10s",client1.getName());
                System.out.printf("%-5s",client1.getGrade());
                System.out.printf("%-15s",client1.getRegtime());
                System.out.printf("%-15.1f",client1.getCost());
                System.out.printf("%-15s",client1.getPhone());
                System.out.printf("%-18s",client1.getEmail());
                System.out.print("\n");
            }
        }
    }
}