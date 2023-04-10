package com.examples.S01springcoreapp;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//    	demo1();
//    	demo3();
    	demo2();
    }
    
    private static void demo2() {
    	//traditional way
      System.out.println( "Hello World!" );
//        Employee emp=new Employee();
//        emp.setId(1);
//        emp.setName("Anusha");
//        System.out.println(emp);
    	
    	//create the spring container
//    	ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com/examples/S01springcoreapp/springconfig.xml");
    	AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(SpringConfig.class);
    	//ask the container for employee bean
    	Employee emp1=(Employee) ctx.getBean("emp1");
    	System.out.println(emp1);
    	Employee emp2=(Employee) ctx.getBean("emp2");
    	System.out.println(emp2);
    	Employee emp3=(Employee) ctx.getBean("emp3");
    	System.out.println(emp3);
    	Employee emp4=(Employee) ctx.getBean("emp4");
    	System.out.println(emp4);
//    	Employee emp5=(Employee) ctx.getBean("emp5");
//    	System.out.println(emp5);
//    	Employee emp6=(Employee) ctx.getBean("emp6");
//    	System.out.println(emp6);
    	Employee emp7=(Employee) ctx.getBean("emp7");
    	System.out.println(emp7);
    	
    }
    private static void demo1() {
    	ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com/examples/S01springcoreapp/springconfig2.xml");
    	Car c1=(Car) ctx.getBean("car");
    	System.out.println(c1.hashCode());
    	Car c2=(Car) ctx.getBean("car");
    	System.out.println(c2.hashCode());
    	Object b1=ctx.getBean("bank");
    	System.out.println(b1.hashCode());
    	Object b2=ctx.getBean("bank");
    	System.out.println(b2.hashCode());
    }
    private static void demo3() {
    	ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com/examples/S01springcoreapp/springconfig3.xml");
    	Computer c1=(Computer) ctx.getBean("homecomputer");
    	System.out.println(c1);
    	Computer c2=(Computer) ctx.getBean("officecomputer");
    	System.out.println(c2);
    }
    private static void demo4() {
    	ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com/examples/S01springcoreapp/springconfig4.xml");
    	EmployeeDAO dao=(EmployeeDAO) ctx.getBean("empdao");
    	System.out.println(dao);
    }
}
