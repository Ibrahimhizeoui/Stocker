package mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import beans.Product;

public class ProductMapper implements RowMapper<Product> {
	   public Product mapRow(ResultSet rs, int rowNum) throws SQLException {
		      Product product = new Product();
		      product.setId(rs.getInt("id"));
		      product.setName(rs.getString("name"));
		      product.setPrice(rs.getString("price"));
		      product.setDescription(rs.getString("description"));
		      product.setQuantity(rs.getInt("quantity"));
		      product.setCreated_at(rs.getTimestamp("created_at"));
		      product.setUpdated_at(rs.getTimestamp("updated_at"));
		      System.out.println(product.toString());
		      return product;
		   }
		}