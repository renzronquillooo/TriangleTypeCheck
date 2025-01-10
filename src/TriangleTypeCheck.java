import java.util.Scanner;

public class TriangleTypeCheck {

	public static void main(String[] args) {
		
	try (Scanner scanner = new Scanner(System.in)) {
		//Enter the length of the sides of the triangle
		//Input length of first side
		System.out.print("Please enter the length of first side: ");
		int sidea = scanner.nextInt();
		
		//Input length of second side
		System.out.print("Please enter the length of second side: ");
		int sideb = scanner.nextInt();
		
		//Input length of third side
		System.out.print("Please enter the length of third side: ");
		int sidec = scanner.nextInt();
		
		//Verify if it is a triangle or not by calling method IsTriangle then if yes (true), verify the type of triangle, else the sides ae not forming a triangle
		if (isTriangle(sidea, sideb, sidec) == true) {
			if (sidea == sideb && sideb == sidec && sidea == sidec) {
				System.out.println("The triangle is Equilateral.");
			} else if ((sidea == sideb && sidea != sidec) || (sidea == sidec && sidea != sideb) || (sideb == sidec && sidea != sideb)){
				System.out.println("The triangle is Isosceles.");
			} else {
				System.out.println("The triangle is Scalene.");
			}
		} else {
			System.out.println("The sides are not forming a triangle hence cannot determine the triangle type.");
			}
		} 
	catch (Exception e) {
		System.out.println("Invalid input entered. Please enter a valid integer number for the length of the three sides."); 
		}	
	}
		
		// Creating method to verify if the sides are forming a triangle 
		public static boolean isTriangle(int sidea, int sideb, int sidec) {
			return ((sidea+sideb > sidec) && (sideb+sidec > sidea) && (sidea+sidec > sideb));
		}
		

}

