package dao;

import java.util.List;

import javax.sql.DataSource;

public interface Dao<T> {
	  
	/** 
     * This is the method to be used to initialize
     * database resources ie. connection.
     */
		public void setDataSource(DataSource ds);
		
		public T create(T obj);
		
		public  boolean delete(int id);
		
		public  T update(T obj);
		
		public  T find(int id);
	    
		public List<T> findAll();


}
