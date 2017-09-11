package controller;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import beans.Product;
import dao.ProductDao;

@Controller
@RequestMapping("/products")
public class ProductController {
	
	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView indexAction(){
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		ProductDao productDao = (ProductDao)context.getBean("productDao");
		List list = productDao.findAll();
		ModelAndView model = new ModelAndView("/products/products");
		model.addObject("lists", list);
		return model;
	}
	
	@RequestMapping(value ="/show/{id}", method = RequestMethod.GET)
	public ModelAndView showAction(@PathVariable int id){
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		ProductDao productDao = (ProductDao)context.getBean("productDao");
		Product product = productDao.find(id);
		ModelAndView model = new ModelAndView("/products/show");
		model.addObject("product", product);
		return model;
	}
	
	@RequestMapping(value ="/add", method = RequestMethod.GET)
	public ModelAndView addAction(){
		ApplicationContext context =
	    		new ClassPathXmlApplicationContext("Beans.xml");
		ProductDao productDao = (ProductDao)context.getBean("productDao");
		List list = productDao.findAll();
		ModelAndView model = new ModelAndView("/products/add","product", new Product());
	
		return model;
	}
	
	@RequestMapping(value="/add", method =  RequestMethod.POST)
	public ModelAndView addAction(@ModelAttribute("SpringWeb")Product product) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		ProductDao productDao = (ProductDao)context.getBean("productDao");
		Product productCreated = productDao.create(product);
		ModelAndView model = new ModelAndView("/products/add");
		model.addObject("product", product);
		return model;
	}
	
	@RequestMapping(value ="/edit/{id}", method = RequestMethod.GET)
	public ModelAndView editAction(@PathVariable int id){
		ApplicationContext context =
	    		new ClassPathXmlApplicationContext("Beans.xml");
		ProductDao productDao = (ProductDao)context.getBean("productDao");
		Product product = productDao.find(id);
		ModelAndView model = new ModelAndView("/products/edit");
		model.addObject("product", product);
		return model;
	}
	
	@RequestMapping(value ="/edit/{id}", method = RequestMethod.POST)
	public ModelAndView updateAction(@PathVariable int id,@ModelAttribute("SpringWeb")Product product){
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		ProductDao productDao = (ProductDao)context.getBean("productDao");
		product.setId(id);
		product = productDao.update(product);
		ModelAndView model = new ModelAndView("redirect:/products/show/"+id);
		model.addObject("product", product);
		return model;
	}
	
	@RequestMapping(value ="/delete/{id}", method = RequestMethod.GET)
	public ModelAndView deleteAction(@PathVariable int id){
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		ProductDao productDao = (ProductDao)context.getBean("productDao");
		productDao.delete(id);
		ModelAndView model = new ModelAndView("redirect:/products");
		return model;
	}
	
}
