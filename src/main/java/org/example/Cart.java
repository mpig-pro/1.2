package org.example;

public class Cart{
    private int id;
    private float price;
    private int number;

    public Cart(int id,float price,int number){
        this.id=id;
        this.price=price;
        this.number=number;
    }
    public void updateNum(int num){
        this.number=num;
    }
    public int getId(){
        return id;
    }
    public float getPrice(){
        return price;
    }
    public int getNum(){
        return number;
    }
    
}

