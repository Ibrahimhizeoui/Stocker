package beans;

public class Category {
	int id, categoryId;
	String name;
	public Category() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getCategory_id() {
		return categoryId;
	}
	public void setCategoryId(int category_id) {
		this.categoryId = category_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
