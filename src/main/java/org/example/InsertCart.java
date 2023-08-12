package org.example;
import java.util.Scanner;
import java.util.ArrayList;

public class InsertCart implements MyAction{              //加入购物车
    private static final String ACTION_NAME="insert";
    
    ArrayList<Cart>  cart = new ArrayList<Cart>();
    ArrayList<Goods>  goods = new ArrayList<Goods>();
    Scanner scanner = null;

    public InsertCart(Scanner scanner,ArrayList<Cart> cart,ArrayList<Goods> goods){
        this.scanner=scanner;
        this.cart =cart;
        this.goods = goods;
    }

    public String getActionName(){
        return InsertCart.ACTION_NAME;
    }
    public void run(String[] args){
        int goodsId;
        int  number;
        System.out.print("请输入商品编号:");
        goodsId=scanner.nextInt();
        System.out.print("请输入商品数量:");
        number=scanner.nextInt();
        scanner.nextLine();
        int flag=0;
        for(Goods goods1 : goods){
            if(goods1.getId()==goodsId){
                Cart cart1 = new Cart(goodsId,goods1.getPrice(),number);
                cart.add(cart1);
                flag=1;
                break;
            }
        }
        if(flag==1)
            System.out.println("添加购物车成功");
        else
            System.out.println("添加购物车失败");    
        
    }
}