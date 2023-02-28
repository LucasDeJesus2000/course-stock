package application;
import java.util.Scanner;
import entities.Product;
import java.util.Locale;

public class Program {
	public static void main (String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		
		System.out.println("enter product data:");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Price: ");
		double price = sc.nextDouble();
		System.out.println();
		Product product = new Product(name, price);
		
		System.out.print("Product data: " + product);
		System.out.println();
		
		System.out.println();
		System.out.printf("Enter the number of products to be added in stock: ");
		int add = sc.nextInt();
		product.addProducts(add);
		System.out.println();
		System.out.print("Update data: " + product);
		System.out.println();
		
		System.out.println();
		System.out.printf("Enter the number of products to be removed in stock: ");
		int remove = sc.nextInt();
		product.removeProducts(remove);
		System.out.println();
		System.out.print("Update data: " + product);
				
		sc.close();
	}
}
