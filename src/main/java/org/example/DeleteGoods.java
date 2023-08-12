package org.example;
import java.util.Scanner;
import java.util.ArrayList;

public class DeleteGoods implements MyAction{
    private static final String ACTION_NAME="delete";
    ArrayList<Goods>  goods = new ArrayList<Goods>();
    Scanner scanner = null;

    public DeleteGoods(Scanner scanner,ArrayList<Goods> goods){
        this.scanner=scanner;
        this.goods=goods;
    }

    public String getActionName(){
        return DeleteGoods.ACTION_NAME;
    }

    public void run(String[] args){
        int goodsid;
        System.out.print("请输入要删除商品编号 :");
        goodsid=scanner.nextInt();
        scanner.nextLine();
        int flag=0;
        for(Goods good : goods){
            if(good.getId()==goodsid){
                goods.remove(good);
                flag=1;
                break;
            }
        }
        if(flag==1)
            System.out.println("删除商品成功");
        else
            System.out.println("删除商品失败");    
    
    }
}