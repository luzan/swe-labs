package products;
public class Product {
	String productnumber;
	double price;
	String description;

	public Product(String productnumber, double price, String description) {
		this.productnumber = productnumber;
		this.price = price;
		this.description = description;
	}

	public String getProductnumber() {
		return productnumber;
	}

	public void setProductnumber(String productnumber) {
		this.productnumber = productnumber;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
