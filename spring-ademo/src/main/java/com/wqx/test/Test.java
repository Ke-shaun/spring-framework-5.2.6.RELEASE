package com.wqx.test;

import com.wqx.config.MyConfig;
import com.wqx.dao.UserDao;
import com.wqx.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MyConfig.class);

//		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
		UserService service = (UserService) applicationContext.getBean("userService");
		service.getOrderService();
	}
}
