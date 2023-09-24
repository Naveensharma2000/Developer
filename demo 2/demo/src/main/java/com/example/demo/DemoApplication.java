package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);


   // System.out.println("hvjgvj");

   // test obj = new test();
   // obj.ravi();

   // ApplicationContext content = new ClassPathXmlApplicationContext("bean.xml");
   // Car c = (Car)content.getBean("car");
   // c.Green();
   // c.Tree();

   // ApplicationContext content = new ClassPathXmlApplicationContext("bean.xml");
   // Vehicle c= content.getBean("car",Vehicle.class);
   // c.Green();
   // c.Tree();

   // Sample s= content.getBean("sample" , Sample.class);
   // s.displayName();
   
   //ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
   // Loosecoupling t = content.getBean("star", Loosecoupling.class);
   // t.displayName();

   // ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
   // Autow a = context.getBean("autow", Autow.class);
   // a.autoDisplay();

// ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
// College cv = context.getBean("college", College.class);
// cv.test();

// ApplicationContext context = new AnnotationConfigApplicationContext(Configg.class);
// College gg = context.getBean("college", College.class);
// gg.test();

 ApplicationContext connect = new AnnotationConfigApplicationContext(Configg.class);
// College h = connect.getBean("college",College.class);
// h.test();

// ApplicationContext collaps = new AnnotationConfigApplicationContext(Configg1.class);
// College1 r = collaps.getBean("college1", College1.class);
// r.test1();

// College t = connect.getBean("college",College.class);
// t.Test();

College h = connect.getBean("college",College.class);
h.Test();

   }
}