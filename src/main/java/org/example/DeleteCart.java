package org.example;
import java.util.Scanner;
import java.util.ArrayList;

public class DeleteCart implements MyAction{                   //从购物车移除
    private static final String ACTION_NAME="delete";
    ArrayList<Cart>  cart = new ArrayList<Cart>();
    Scanner scanner = null;

    public DeleteCart(Scanner scanner,ArrayList<Cart> cart){
        this.scanner=scanner;
        this.cart =cart;
    }

    public String getActionName(){
        return DeleteCart.ACTION_NAME;
    }

    public void run(String[] args){
        int goodsid;
        System.out.print("请输入要删除商品编号 :");
        goodsid=scanner.nextInt();
        scanner.nextLine();
        int flag =0;
        for(Cart cart1 : cart){
            if(cart1.getId()==goodsid){
                cart.remove(cart1);
                flag=1;
                break;
            }
        }
        if(flag==1)
            System.out.println("移除购物车成功");
        else
            System.out.println("移除购物车失败");
    }
}
