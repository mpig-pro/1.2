package org.example;
import java.util.ArrayList;

public class HistoryCart implements MyAction{              //加入购物车
    private static final String ACTION_NAME="history";

    ArrayList<History>  history = new ArrayList<History>();

    public HistoryCart(ArrayList<History> history){
        this.history = history;
    }

    public String getActionName(){
        return HistoryCart.ACTION_NAME;
    }
    
    public void run(String[] args){
        
        System.out.println("id  price  number  time");
        for(History history1 : history){
            System.out.printf("%-5d",history1.getId());
            System.out.printf("%-10.1f ",history1.getPrice());
            System.out.printf("%-5d",history1.getNum());
            System.out.printf("%-12s",history1.getTime());
            System.out.print("\n");
        }
                
            
    }
}