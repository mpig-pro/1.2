package org.example;
import java.util.ArrayList;
import java.util.Scanner;

public class QueryGoods implements MyAction{
    private static final String ACTION_NAME="query";
    ArrayList<Goods>  goods = new ArrayList<Goods>();
    Scanner scanner = null;

    public QueryGoods(Scanner scanner,ArrayList<Goods> goods){
        this.scanner=scanner;
        this.goods=goods;
    }

    public String getActionName(){
        return QueryGoods.ACTION_NAME;
    }

    public void run(String[] args){
        System.out.print("请输入查询商品的名称:");
        String goodsname = scanner.nextLine();
        System.out.println("id  goodsname  producer  price   number ");

        for(Goods good : goods){
            if(good.getName().equals(goodsname)){
                System.out.printf("%-5d",good.getId());
                System.out.printf("%-10s",good.getName());
                System.out.printf("%-10s",good.getProducer());
                System.out.printf("%-10.1f ",good.getPrice());
                System.out.printf("%d",good.getNum());
                System.out.print("\n");
            }
        }
        
                
         
        
    
    }
}