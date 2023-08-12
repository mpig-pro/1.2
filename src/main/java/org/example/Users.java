package org.example;

public class Users {
    private int id;
    private String username;
    private String password;
    private String type;

    public Users(int id,String username,String password,String type){
        this.id=id;
        this.username=username;
        this.password=password;
        this.type=type;
    }
    public void updatePass(String pass){
        this.password = pass;
    }
    public int getId(){
        return id;
    }
    public String getName(){
        return username;
    }
    public String getPass(){
        return password;
    }
    public String getType(){
        return type;
    }
}
