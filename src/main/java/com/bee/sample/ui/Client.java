package com.bee.sample.ui;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bee.sample.service.ICustomerService;
/**
 * 
 * 使用配置文件 演示 Spring AOP
 * 下一个问题：使用注解演示Spring AOP？
 * @author hhluci
 *
 */
public class Client {

	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
		ICustomerService cs = (ICustomerService) ac.getBean("customerService");
		cs.saveCustomer();
	}

}
