package mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import beans.Category;

public class CategoryMapper implements RowMapper<Category>{

	public Category mapRow(ResultSet rs, int rowNum) throws SQLException {
		Category category = new Category();
		category.setId(rs.getInt("id"));
		category.setCategoryId(rs.getInt("id"));
		category.setName(rs.getString("name"));
		System.out.println(category.toString());
	      
		return category;
	}

}
