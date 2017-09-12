package dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import beans.Category;
import mapper.CategoryMapper;
import mapper.ProductMapper;

public class CategoryDao implements Dao<Category> {

	private DataSource dataSource;
	   private JdbcTemplate jdbcTemplateObject;
	   
	   public void setDataSource(DataSource dataSource) {
	      this.dataSource = dataSource;
	      this.jdbcTemplateObject = new JdbcTemplate(dataSource);
	   }
	public Category create(Category obj) {
		String query = "INSERT INTO `categories` (`id`, `category_id`, `name`) VALUES (NULL, ?, ?)";
		this.jdbcTemplateObject.update(query, obj.getName(),obj.getCategory_id());
		return obj;
	}

	public boolean delete(int id) {
		String query = "DELETE FROM `categories` WHERE `categories`.`id` ="+id;
		this.jdbcTemplateObject.execute(query);
		return false;
	}

	public Category update(Category obj) {
		String query = "UPDATE `categories` SET `category_id` = ?, `name` = ? WHERE `categories`.`id` = ?";
		this.jdbcTemplateObject.update(query, obj.getName(),obj.getCategory_id());
		return obj;
	}

	public Category find(int id) {
		 String query = "SELECT * FROM `categories` WHERE `categories`.`id` = ?";
		 Category obj = this.jdbcTemplateObject.queryForObject(query, new CategoryMapper(),id);	
		 return obj;
	}

	public List<Category> findAll() {
		String query = "SELECT * FROM `categories`";
		List<Category> categories = this.jdbcTemplateObject.query(query, new CategoryMapper()); 
		return categories;
	}

}
