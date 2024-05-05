/*Implement a program to handle Arithmetic exception, Array Index Out of Bounds. The user enters
two numbers Num1 and Num2. The division of Num1 and Num2 is displayed. If Num1 and Num2
are not integers, the program would throw a Number Format Exception. If Num2 were zero, the
program would throw an Arithmetic Exception. Display the exception.
*/

import java.util.Scanner;
public class Exceptions {
	
	public static void main(String[]args) {
		
		int num1,num2,result;
		
		Scanner sc=new Scanner(System.in);
		
		try {
			
		System.out.println("Enter first value:");
		
		num1=Integer.parseInt(sc.next());
		
		System.out.println("Enter second value:");
		
		num2=Integer.parseInt(sc.next());
		
		result=num1/num2;
		System.out.println("Division is:"+result);
		}
		
		catch(ArithmeticException e) {
			
		System.out.println("Denominator cannot be zero");
		
		}
		catch(NumberFormatException e) {
			
			System.out.println("Invalid output");	
			
		}		
			
	}
	
}
