package org.example;

public class History {
    private int id;
    private float price;
    private int number;
    private String time;

    public History(int id,float price,int number,String time){
        this.id=id;
        this.price=price;
        this.number=number;
        this.time=time;

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
    public String getTime(){
        return time;
    }
    
}
