package org.example;
import java.util.ArrayList;;

public class ListClient implements MyAction{
    private static final String ACTION_NAME="list";
    ArrayList<Client> client = new ArrayList<Client>();

    public ListClient(ArrayList<Client> client){
        this.client=client;
    }
    public String getActionName(){
        return ListClient.ACTION_NAME;
    }

    public void run(String[] args){
        System.out.println("id username grade registertime  totalconsumption  phonenumber     email ");
        for(Client client1 : client){
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