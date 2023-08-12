package org.example;
import java.util.Scanner;
import java.util.ArrayList;

public class InsertGoods implements MyAction{
    private static final String ACTION_NAME="insert";
    ArrayList<Goods>  goods = new ArrayList<Goods>();

    Scanner scanner = null;

    public InsertGoods(Scanner scanner,ArrayList<Goods> goods){
        this.scanner=scanner;
        this.goods = goods;
    }

    public String getActionName(){
        return InsertGoods.ACTION_NAME;
    }
    public void run(String[] args){
        String goodsname;
        String producer;
        float price;
        int number;
        System.out.print("请输入添加商品的名称:");
        goodsname=scanner.nextLine();
        System.out.print("请输入添加商品的厂家:");
        producer=scanner.next();
        System.out.print("请输入添加商品的价格:");
        price =scanner.nextFloat();
        System.out.print("请输入添加商品的数量:");
        number =scanner.nextInt();
        scanner.nextLine();
        int id=goods.get(goods.size()-1).getId()+1;
        Goods goods1 =new Goods(id,goodsname,producer,price,number);
        goods.add(goods1);

    }
}