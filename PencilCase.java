package PencilCaseConstructor;

import java.util.Scanner;

public class PencilCase {
	
	String brand;
	String color;
	String material;
	Boolean shape;
	double dimensions;
	double price;
	double weight;
	double rating;
	
	Scanner sc = new Scanner(System.in);
	
	// default constructor
	PencilCase(){
		
		System.out.println("Brand name \t: ");
		this.brand = sc.nextLine();
		
		System.out.println("Color of brand \t: ");
		this.color = sc.nextLine();
		
		System.out.println("Material of brand \t: ");
		this.material = sc.nextLine();
		
		System.out.println("Shape of brand? (cylindrical/round): ");
		this.shape = sc.nextBoolean();
		
		System.out.println("Dimensions of brand \t: ");
		this.dimensions = sc.nextDouble();
		
		System.out.println("Price of brand \t: ");
		this.price = sc.nextDouble();
		
		System.out.println("Weight of brand \t: ");
		this.weight = sc.nextDouble();
		
		System.out.println("Rating of brand: \t");
		this.rating = sc.nextDouble();
	
	}
		
		// Parameterized constructor
		PencilCase(String brand, String color, String material, Boolean shape, double dimensions, double price, double weight, double rating){
			this.brand = brand;
			this.color = color;
			this.material = material;
			this.shape = shape;
			this.dimensions = dimensions;
			this.price = price;
			this.weight = weight;
			this.rating = rating;
			
		}	

}
