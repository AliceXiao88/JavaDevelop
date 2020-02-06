package com.demo.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo.config.AppConfig;
import com.demo.service.CustomerService;
import com.demo.service.CustomerServiceImpl;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context =new AnnotationConfigApplicationContext(AppConfig.class);
		
		CustomerService service=context.getBean("customerService",CustomerService.class);
		System.out.println(service);
		
		CustomerService service2=context.getBean("customerService",CustomerService.class);
		System.out.println(service2);
		
		//for singleton, the above two service object should be the same;
		//but for prototype, the above two will be different;
		//@Scope in service file
		System.out.println(service.findAll().get(0).getName());
		
	}

}
