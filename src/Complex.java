/*
Design a class ‘Complex ‘with data members for real and imaginary part. Provide default and
Parameterized constructors. Write a program to perform arithmetic operations of two complex
numbers.*/

public class Complex {
	float real, img;
	
   Complex(){}
   
   Complex(float x,float y){
	   real=x;
	   img=y;
	   
   }
   Complex add(Complex a) {
   Complex temp=new Complex();
	temp.real=this.real+a.real;
    temp.img=this.img+a.img;
   
	return temp;   
	      
   }
   
	
public static void main(String[]args) {
Complex c1=new Complex(5,4);
Complex c2=new Complex(12,4);	

Complex res;
res=c2.add(c1);
System.out.println("Addition is:"+res.real+res.img);

	
	
	
	
}


}





