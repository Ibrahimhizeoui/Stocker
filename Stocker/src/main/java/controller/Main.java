package controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.Category;
import dao.CategoryDao;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		CategoryDao productDao = (CategoryDao)context.getBean("categorytDao");
		productDao.delete(2);
		
	}

}
