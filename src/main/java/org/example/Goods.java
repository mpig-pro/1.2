package org.example;

public class Goods {
    private int id;
    private String goodsname;
    private String producer;
    private float price;
    private int number;

    public Goods(int id,String goodsname,String producer,float price,int number){
        this.id=id;
        this.goodsname=goodsname;
        this.producer=producer;
        this.price=price;
        this.number=number;

    }
    public int getId(){
        return id;
    }
    public String getName(){
        return goodsname;
    }
    public String getProducer(){
        return producer;
    }
    public float getPrice(){
        return price;
    }
    public int getNum(){
        return number;
    }
    public void updateNum(int num){
        this.number=num;
    }
    public void updatePrice(float price){
        this.price = price;
    }
    public void updateProducer(String producer){
        this.producer = producer;
    }
}

