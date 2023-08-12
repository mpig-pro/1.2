package org.example;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GoodsManage implements MyAction{          //商品管理
    private static final String ACTION_NAME ="goodsmanage";
    private Scanner scanner=null;
    private List<MyAction> actionList2= new ArrayList<MyAction>();
    ArrayList<Goods>  goods = new ArrayList<Goods>();

    public GoodsManage(Scanner scanner,ArrayList<Goods> goods){
        this.scanner=scanner;
        this.goods = goods;
    }
    
    private void init(){
        InsertGoods insertgoods = new InsertGoods(scanner,goods);      //添加
        DeleteGoods deletegoods = new DeleteGoods(scanner,goods);        //删除
        UpdateGoods updategoods = new UpdateGoods(scanner,goods);          //更新
        QueryGoods querygoods = new QueryGoods(scanner,goods);            //查询
        ListGoods listgoods = new ListGoods(goods);                         //列出
        actionList2.add(insertgoods);
        actionList2.add(deletegoods);
        actionList2.add(updategoods);
        actionList2.add(querygoods);
        actionList2.add(listgoods);
    }

    public String getActionName(){
        return GoodsManage.ACTION_NAME;
    }

    public void run(String[] args) {
        init();
        System.out.println("当前你在商品管理子菜单.");
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