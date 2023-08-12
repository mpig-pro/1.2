package org.example;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Date;
import java.text.SimpleDateFormat;

public class PayCart implements MyAction{                 //支付
    private static final String ACTION_NAME="pay";
    Scanner scanner = null;
    ArrayList<Cart>  cart = new ArrayList<Cart>();
    ArrayList<History>  history = new ArrayList<History>();
    ArrayList<Goods>  goods = new ArrayList<Goods>();

    public PayCart(ArrayList<Cart>  cart ,ArrayList<History> history,ArrayList<Goods> goods){
        this.cart = cart;
        this.history = history;
        this.goods = goods;
    }
    public String getActionName(){
        return PayCart.ACTION_NAME;
    }

    public void run(String[] args){
        float totalPrice=0.0f;

        Date date=new Date();
        SimpleDateFormat dateFormat=new SimpleDateFormat("YYYY-MM-dd");//设置当前时间的格式，为年-月-日
        String time = dateFormat.format(date);       //获取结账时间
        
        for(Cart cart1 : cart){
            totalPrice +=cart1.getNum()*cart1.getPrice();   
        }
        
        for(Cart cart1 : cart){                //加入购物历史
            History history1 = new History(cart1.getId(),cart1.getPrice(),cart1.getNum(),time);
            history.add(history1);
        }

        for(Cart cart1 : cart){               //修改库存商品数量
            for(Goods goods1 : goods){
                if(cart1.getId()==goods1.getId()){
                    int storeNum=goods1.getNum();
                    goods1.updateNum(storeNum-cart1.getNum());
                }
            }
        }

        cart.clear();                            //结账后要清空购物车

        System.out.println("支付金额为"+totalPrice);
    }
}