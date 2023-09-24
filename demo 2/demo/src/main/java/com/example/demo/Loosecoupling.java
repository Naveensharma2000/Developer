package com.example.demo;

public class Loosecoupling {
    
    Marks mark;

    public void setMark(Marks mark){
        this.mark = mark;
    }

    public void displayName(){
        mark.dmark();
    }
}
    

