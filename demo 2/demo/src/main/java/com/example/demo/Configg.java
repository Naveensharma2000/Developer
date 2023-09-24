package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan(basePackages = "com.example.demo")
public class Configg {

    // @Bean
    // public Students student(){
    //     return new Students();
    // }

    // @Bean
    // public Staffs staff(){
    //     return new Staffs();
    // }

    // @Bean
    // public College college(){
    //    
    //  College c = new College();
    //     c.set(staff());
    //     return c;
    // }
}
