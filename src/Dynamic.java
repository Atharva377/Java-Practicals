/*Design a base class shape with two double type values and member functions to input the data
and compute_area() for calculating area of shape. Derive two classes: triangle and rectangle. Make
compute_area() as abstract function and redefine this function in the derived class to suit their
requirements. Write a program that accepts dimensions of triangle/rectangle and display
calculated area. Implement dynamic binding for given case study.*/
import java.util.Scanner;

abstract class Shape{
	
	double val1,val2;
	
	void input() {	
	 Scanner s=new Scanner(System.in);
	 System.out.println("Enter first value:"+val1);
	 val1=s.nextDouble();
	 System.out.println("Enter second value:"+val2);
	 val2=s.nextDouble();
	}
	
	abstract void compute_area();
		
}
class Triangle extends Shape{
	void compute_area() {
		double area;
		area=1.0f/2.0f* val1 * val2 ;
	System.out.println("Triangle area is:"+area);
		
	}	
	
}
class Rectangle extends Shape{
	void compute_area() {
		double area;
		area= val1 * val2 ;
	System.out.println("Rectange area is:"+area);
				
	}
	
}
public class Dynamic {
	public static void main(String[]args) {
	Shape s;
	Triangle t=new Triangle();
	Rectangle r=new Rectangle();
		
	s=t;
	s.input();
	s.compute_area();
	
	s=r;
	s.input();
	s.compute_area();
		
		
	}
	
}
