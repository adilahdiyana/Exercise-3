package PencilCaseConstructor;
import java.util.Scanner;
public class PencilCase {
	
		String brand;
		String color;
		String material;
		String shape;
		double dimensions;
		double price;
		double weight;
		double rating;
		
		Scanner sc = new Scanner(System.in);
		
		// default constructor
		PencilCase(){
			
			System.out.println("Brand name : ");
			this.brand = sc.nextLine();
			
			System.out.println("Color of brand : ");
			this.color = sc.nextLine();
			
			System.out.println("Material of brand : ");
			this.material = sc.nextLine();
			
			System.out.println("Shape of case? : ");
			this.shape = sc.next();
			
			System.out.println("Dimensions of brand : ");
			this.dimensions = sc.nextDouble();
			
			System.out.println("Price of brand : ");
			this.price = sc.nextDouble();
			
			System.out.println("Weight of brand : ");
			this.weight = sc.nextDouble();
			
			System.out.println("Rating of brand : ");
			this.rating = sc.nextDouble();
		
		}
			
			// Parameterized constructor
		PencilCase(String brand, String color, String material, String shape, double dimensions, double price, double weight, double rating){
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
