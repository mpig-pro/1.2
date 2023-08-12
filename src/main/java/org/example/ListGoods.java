package org.example;
import java.util.ArrayList;

public class ListGoods implements MyAction{
    private static final String ACTION_NAME="list";
    
    ArrayList<Goods>  goods = new ArrayList<Goods>();

    public ListGoods(ArrayList<Goods> goods){
        this.goods=goods;
    }
    public String getActionName(){
        return ListGoods.ACTION_NAME;
    }

    public void run(String[] args){
    
        System.out.println("id  goodsname  producer  price   number ");
        for(Goods good : goods){
            System.out.printf("%-5d",good.getId());
            System.out.printf("%-10s",good.getName());
            System.out.printf("%-10s",good.getProducer());
            System.out.printf("%-10.1f ",good.getPrice());
            System.out.printf("%d",good.getNum());
            System.out.print("\n");
        }
                  
    }
}