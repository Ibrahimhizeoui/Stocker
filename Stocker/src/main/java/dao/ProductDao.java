package dao;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import beans.Product;
import mapper.ProductMapper;

public class ProductDao implements Dao<Product> {
	   private DataSource dataSource;
	   private JdbcTemplate jdbcTemplateObject;
	   
	   public void setDataSource(DataSource dataSource) {
	      this.dataSource = dataSource;
	      this.jdbcTemplateObject = new JdbcTemplate(dataSource);
	   }

	public Product create(Product obj) {
		String query = "INSERT INTO `product` (`id`, `name`, `price`, `quantity`, `description`, `created_at`, `updated_at`)"
				+ "     VALUES (NULL, ?, ?, ?, ?, ?, null)";
		jdbcTemplateObject.update(query,obj.getName(),obj.getPrice(),obj.getQuantity(),obj.getDescription(),obj.getcreatedAt());
	      
		return obj;
	}

	public Product update(Product obj) {
		System.out.print("update to :"+obj);
		String query = "UPDATE `product` SET "
				+ "`name` = ?, "
				+ "`price` = ?, "
				+ "`quantity` = ?, "
				+ "`description` = ?,"
				+ "`updated_at` = ?"
				+ " WHERE `product`.`id` = ?";
		jdbcTemplateObject.update(query,obj.getName(),obj.getPrice(),obj.getQuantity(),obj.getDescription(),new Timestamp(new Date().getTime()),obj.getId());	
		return obj;
	}

	public Product find(int id) {
		String query = "SELECT * FROM `product` WHERE id= ?";
	      Product product = jdbcTemplateObject.queryForObject(query, new ProductMapper(),id);
	      return product;
	}

	public List<Product> findAll() {
		  String query = "SELECT * FROM `product`";
	      List<Product> products = jdbcTemplateObject.query(query, new ProductMapper());
	      return products;
	}

	public boolean delete(int id) {
		String query = "DELETE FROM `product` WHERE `product`.`id` ="+id;
		jdbcTemplateObject.execute(query);
		return false;
	}

}
