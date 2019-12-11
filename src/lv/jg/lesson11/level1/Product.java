import java.util.List;

public class Product {
	
	private String name;
	private double price;
	private Category category;
	private List<Product> list;
	
    public Product() {
    }
	
    public Product(String name, double price, Category category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }
    
	@Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price='" + price + '\'' +
                ", category=" + category +
                '}';
    }
    
    public List<Product> getList() {
		return list;
	}

    public void setList(List<Product> list, String title) {
    	this.list = list;
    	System.out.println("A new shopping list was created! Title: '" + title + "'.");
    	System.out.println("==============================================================");
    }

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public Category getCategory() {
		return category;
	}
	
	public void setCategory(Category category) {
		this.category = category;
	}

}
