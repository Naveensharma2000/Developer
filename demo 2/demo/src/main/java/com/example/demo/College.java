package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

 @Component("college")
public class College {
      

      @Autowired
       public Students students;

     @Autowired
     public Staffs staffs;


     public void set(Staffs staff){
        this.staffs = staff;
     }


    public void Test(){
         System.out.println("from college");
         staffs.disStud();





    }

    }

