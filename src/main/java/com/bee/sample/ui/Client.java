package com.bee.sample.ui;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bee.sample.service.ICustomerService;
/**
 * 
 * ʹ�������ļ� ��ʾ Spring AOP
 * ��һ�����⣺ʹ��ע����ʾSpring AOP��
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
