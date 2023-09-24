package com.example.demo;

public class Sample {
    private String lastname;
    private int ad;
    // private float fv;

    Welcome welcome;

    public Sample(String lastname, int ad){
        this.lastname = lastname;
        this.ad = ad;
    }

    public void setWelcome(Welcome welcome){
this.welcome = welcome;
    }

    // public void setLastname(String name){
    //     this.lastname = name;
    // }
    
    // public void setAd(int v){
    //     this.ad = v;
    // }

    // public void SetFloat(){
        // this.fv = 0.1f;
    // }
    
    public void displayName(){

        System.out.println(this.lastname + this.ad );
        welcome.displayV();
    }
  

}
