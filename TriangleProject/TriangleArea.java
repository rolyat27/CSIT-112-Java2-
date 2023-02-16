import java.util.*;

public class TriangleArea {
	public static void get_larger_triangle(Triangle triangle_1,Triangle triangle_2){
		double size1;
		double size2;
		size1 = triangle_1.getArea();
		size2 = triangle_2.getArea();
		if (size1 > size2) 
		{ 
			System.out.println("Triangle 1 is larger: ");
			triangle_1.printInfo();
		}
		else if (size2 > size1)
		{
			System.out.println("Triangle 2 is larger: ");
			triangle_2.printInfo();
		}
		else if (size1 == size2)
		{
			System.out.println("the Triangles are the same size: ");
			triangle_1.printInfo();
			triangle_2.printInfo();
		}
	}
			
			
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		Triangle triangle_1 = new Triangle();
		System.out.println("enter the length of the base of Triangle 1: ");
		double userBase1 = scan.nextDouble();
		System.out.println("enter the height of Triangle 1: ");
		double userHeight1 = scan.nextDouble();

		Triangle triangle_2 = new Triangle();
		System.out.println("enter the length of the base of Triangle 2: ");
		double userBase2 = scan.nextDouble();
		System.out.println("enter the height of Triangle 2: ");
		double userHeight2 = scan.nextDouble();
		
		triangle_1.setBase(userBase1);
		triangle_1.setHeight(userHeight1);

		triangle_2.setBase(userBase2);
		triangle_2.setHeight(userHeight2);

		get_larger_triangle(triangle_1, triangle_2);
	}
}


		
	
		       
