package controller;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import beans.Category;
import beans.Product;
import dao.CategoryDao;
import dao.ProductDao;

@Controller
@RequestMapping("/categories")
public class CategoryController {
	
	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView indexAction(){
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		CategoryDao categoryDao = (CategoryDao) context.getBean("categorytDao");
		List<Category> categories = categoryDao.findAll();
		ModelAndView model = new ModelAndView("/categories/categories");
		model.addObject("categories",categories);
		model.addObject("category",new Category());
		return model;
	}
	
	@RequestMapping(value ="/add", method = RequestMethod.GET)
	public ModelAndView addAction(){
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		CategoryDao categoryDao = (CategoryDao) context.getBean("categorytDao");
		List<Category> categories = categoryDao.findAll();
		ModelAndView model = new ModelAndView("/categories/add","category", new Category());
		return model;
	}
	
	@RequestMapping(value="/add", method =  RequestMethod.POST)
	public ModelAndView addAction(@ModelAttribute("SpringWeb")Category category) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		CategoryDao categoryDao = (CategoryDao) context.getBean("categorytDao");
		categoryDao.create(category);
		ModelAndView model = new ModelAndView("redirect:/categories");
		return model;
	}
	
	@RequestMapping(value="/edit/{id}", method = RequestMethod.GET)
	public ModelAndView editAction(@PathVariable int id) {
		System.out.print(id);
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		CategoryDao categoryDao = (CategoryDao) context.getBean("categorytDao");
		Category category = categoryDao.find(id);
		List<Category> categories = categoryDao.findAll();
		System.out.print(category.toString());
		ModelAndView model = new ModelAndView("/categories/edit","category", category);
		model.addObject("categories",categories);
		return model;
	}
	
	@RequestMapping(value="/edit/{id}", method =  RequestMethod.POST)
	public ModelAndView updateAction(@ModelAttribute("SpringWeb")Category category) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		CategoryDao categoryDao = (CategoryDao) context.getBean("categorytDao");
		categoryDao.update(category);
		ModelAndView model = new ModelAndView("redirect:/categories");
		return model;
	}
	
	@RequestMapping(value="/delete/{id}", method =  RequestMethod.GET)
	public ModelAndView deleteAction(@PathVariable int id) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		CategoryDao categoryDao = (CategoryDao) context.getBean("categorytDao");
		categoryDao.delete(id);
		ModelAndView model = new ModelAndView("redirect:/categories");
		return model;
	}

}
