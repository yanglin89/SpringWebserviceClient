package com.run.job;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.run.service.IHelloWorld;

public class ClientTest {
	
	public static void main(String[] args) {  
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-client.xml");  
        IHelloWorld client = (IHelloWorld) ctx.getBean("client");  
        String result = client.sayHello("yanglin!");  
        System.out.println(result);
    }

}
