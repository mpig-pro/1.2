package org.example;
import java.util.Scanner;
import java.util.ArrayList;

public class UpdateGoods implements MyAction{
    private static final String ACTION_NAME="update";
    ArrayList<Goods>  goods = new ArrayList<Goods>();

    Scanner scanner = null;

    public UpdateGoods(Scanner scanner,ArrayList<Goods> goods){
        this.scanner=scanner;
        this.goods = goods;
    }

    public String getActionName(){
        return UpdateGoods.ACTION_NAME;
    }
    public void run(String[] args){
        int goodsid;
        int number;
        float price;
        String producer;
        String field;
        System.out.print("请输入要修改的商品编号:");
        goodsid=scanner.nextInt();
        scanner.nextLine();
        int index=0;
        for(Goods good : goods){
            if(good.getId()==goodsid){
                index=goods.indexOf(good);
                break;
            }
        } 
        int flag=0;
        System.out.print("请输入修改的部分(number or price or producer):");
        field = scanner.nextLine();
        System.out.print("请输入对应修改后的值:");
        switch (field) {
            case "number": 
                number=scanner.nextInt();
                goods.get(index).updateNum(number);
                flag=1;
                break;
            case "price":
                price=scanner.nextFloat();
                goods.get(index).updatePrice(price);
                flag=1;
                break;
            case "producer":
                producer=scanner.nextLine();
                goods.get(index).updateProducer(producer);
                flag=1;
                break;
            default:
                break;
        }
        if(flag==1)
            System.out.println("修改成功");
        else
            System.out.println("修改失败");
            

    
    }
}