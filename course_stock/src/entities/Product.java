package entities;

public class Product {
	private String name;
	private double price;
	private int quantity ;
	
	public Product(String name, double price , int quantity) { //construtor para definir obrigatoriedade dos campos. 
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	public Product(String name, double price) { // sobrecarga definindo atributo quantity como zero.  
		this.name = name;
		this.price = price;
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
	
	public int getQuantity() {
		return quantity;
	}
	
	public void addProducts(int quantity) {
		this.quantity += quantity;
	}
	
	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}
	
	public double totalValueStock() {
		return price * quantity;
	}	
	public String toString() {
		return name
				+ ", $ "
				+ String.format("%.2f", price)
				+ ", "
				+ quantity
				+ " units, Total: $ "
				+ String.format("%.2f", totalValueStock());
	}
}
