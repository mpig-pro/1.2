package org.example;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Shopping implements MyAction{              //购物
    private static final String ACTION_NAME ="shopping";
    private Scanner scanner=null;
    private List<MyAction> actionList2= new ArrayList<MyAction>();

    ArrayList<Cart>  cart = new ArrayList<Cart>();
    ArrayList<Goods>  goods = new ArrayList<Goods>();
    ArrayList<History>  history = new ArrayList<History>();


    public Shopping(Scanner scanner,ArrayList<Cart> cart,ArrayList<Goods> goods,ArrayList<History> history){
        this.scanner=scanner;
        this.cart = cart;
        this.goods =goods;
        this.history=history;
    }
    
    private void init(){
        InsertCart insertcart = new InsertCart(scanner,cart,goods);           //添加
        DeleteCart deletecart = new DeleteCart(scanner,cart);            //删除
        UpdateCart updatecart = new UpdateCart(scanner,cart);             //修改
        PayCart paycart = new PayCart(cart,history,goods);                         // 支付
        HistoryCart  historycart =new HistoryCart(history);        //购物历史\

        actionList2.add(insertcart);
        actionList2.add(deletecart);
        actionList2.add(updatecart);
        actionList2.add(paycart);
        actionList2.add(historycart);
    }

    public String getActionName(){
        return Shopping.ACTION_NAME;
    }

    public void run(String[] args) {
        init();
        System.out.println("当前你在购物子菜单.");
        String userInput="";
        while (true) {
            System.out.print("请输入指令,q退出> ");
            userInput = this.scanner.nextLine();
            if (userInput.equals("q")) {
                break;
            }
            String actionName = null;
            for(MyAction oneAction: actionList2) {
                actionName = oneAction.getActionName();
                if (userInput.equalsIgnoreCase(actionName)) {
                    oneAction.run(null);
                }
            }
            
            
        }
    }
}