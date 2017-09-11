package beans;

import java.sql.Timestamp;
import java.util.Date;

public class Product{
	private int id,quantity;
	private String name,description,price;
	private Timestamp createdAt;
	private Timestamp updatedAt;
	public Product() {
		this.createdAt =new Timestamp(new Date().getTime());
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	
	public Timestamp getcreatedAt() {
		return createdAt;
	}
	public void setcreatedAt(Timestamp createdAt) {
		this.createdAt = createdAt;
	}
	public Timestamp getupdatedAt() {
		return updatedAt;
	}
	public void setupdatedAt(Timestamp updatedAt) {
		this.updatedAt = updatedAt;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", quantity=" + quantity + ", name=" + name + ", description=" + description
				+ ", price=" + price + ", createdAt=" + createdAt + ", updatedAt=" + updatedAt + "]";
	}
	
	
	
}
