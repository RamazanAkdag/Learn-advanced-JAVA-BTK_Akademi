package com.springDemo;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(IocConfig.class);
    	ICustomerDal customerDal = context.getBean("database",ICustomerDal.class);
    	ICustomerService service= context.getBean("service",ICustomerService.class);
      
    	
       customerDal.add();
       service.add();
    }
}
