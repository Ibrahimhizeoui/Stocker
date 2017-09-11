package controller;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import dao.ProductDao;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context =
	    		new ClassPathXmlApplicationContext("Beans.xml");
		ProductDao productDao = (ProductDao)context.getBean("productDao");
		List list = productDao.findAll();
		
	}

}
