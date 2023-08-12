package org.example;

public class Client {
    private int id;
    private String username;
    private String grade;
    private String regtime;
    private float cost;
    private String phone;
    private String email;

    public Client(int id,String username,String grade,String regtime,float cost,String phone,String email){
        this.id=id;
        this.username=username;
        this.grade=grade;
        this.regtime=regtime;
        this.cost=cost;
        this.phone=phone;
        this.email=email;

    }
    public int getId(){
        return id;
    }
    public String getName(){
        return username;
    }
    public String getGrade(){
        return grade;
    }
    public String getRegtime(){
        return regtime;
    }
    public float getCost(){
        return cost;
    }
    public String getPhone(){
        return phone;
    }
    public String getEmail(){
        return email;
    }

}
