package org.example;
import java.util.Scanner;
import java.util.ArrayList;

public class UpdateCart implements MyAction{       //修改购物车
    private static final String ACTION_NAME="update";
    ArrayList<Cart>  cart = new ArrayList<Cart>();
    Scanner scanner = null;

    public UpdateCart(Scanner scanner,ArrayList<Cart> cart){
        this.scanner=scanner;
        this.cart=cart;
    }

    public String getActionName(){
        return UpdateCart.ACTION_NAME;
    }

    public void run(String[] args){
        int goodsid;
        int number;
        System.out.print("请输入要修改的商品编号:");
        goodsid=scanner.nextInt();
        System.out.print("请输入修改后的数量:");
        number = scanner.nextInt();
        scanner.nextLine();
        int flag=0;
        for(Cart cart1 : cart){
            if(cart1.getId()==goodsid){
                if(number==0)
                    cart.remove(cart1);
                else
                    cart1.updateNum(number); 
                flag=1;
                break;           
            }
        }
        if(flag==1)
            System.out.println("修改购物车成功");
        else
            System.out.println("修改购物车失败");
    }
}