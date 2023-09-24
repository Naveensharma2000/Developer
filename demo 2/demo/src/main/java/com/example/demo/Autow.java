package com.example.demo;

public class Autow {
    
    public Welcome welcome;
    public Welcome welcome1;
    public Welcome welcome2;
    public Welcome welcome3;

// public Autow(Welcome welcome){
    // this.welcome = welcome;
    // System.out.println("constructor called");
// }
 




public void setWelcome(Welcome welcome){
    this.welcome=welcome;
}

public void setWelcome1(Welcome welcome1){
    this.welcome1=welcome1;
}

public void setWelcome2(Welcome welcome2){
    this.welcome2=welcome2;
}


public void autoDisplay(){
    this.welcome.displayV();
    this.welcome1.displayV();
    this.welcome2.displayV();


}

}
