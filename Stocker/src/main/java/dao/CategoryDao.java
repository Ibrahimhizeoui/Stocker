package dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import beans.Category;

public class CategoryDao implements Dao<Category> {

	private DataSource dataSource;
	   private JdbcTemplate jdbcTemplateObject;
	   
	   public void setDataSource(DataSource dataSource) {
	      this.dataSource = dataSource;
	      this.jdbcTemplateObject = new JdbcTemplate(dataSource);
	   }
	public Category create(Category obj) {
		String query = "";
		return null;
	}

	public boolean delete(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	public Category update(Category obj) {
		// TODO Auto-generated method stub
		return null;
	}

	public Category find(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Category> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
