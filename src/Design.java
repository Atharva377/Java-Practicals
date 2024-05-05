/*Implement Factory design pattern for the given context. Consider Car building process, which
requires many steps from allocating accessories to final makeup. These steps should be written as
methods and should be called while creating an instance of a specific car type. Hatchback, Sedan,
SUV could be the subclasses of Car class. Car class and its subclasses, CarFactory and Test Factory
Pattern should be implemented.*/


 import java.util.Scanner;
 abstract class Car_Factory
 {
 String company,car_name;
 double budget;
 abstract void accessories(); //abstract method
 void input()
 {
 Scanner scan =new Scanner (System.in);
 System.out.print("Company- ");
 company=scan.next();
 System.out.print("Car- ");
 car_name=scan.next();
 System.out.print("Rough Budget(in Lakhs)- ");
 budget=scan.nextDouble();
 }
 void display(Car_Factory obj1)
 {
 System.out.println("\n-----------------------------------");
 obj1.accessories();//calling accessories method
 System.out.println("\n-----------------------------------");
 }
 }
 class Small_car extends Car_Factory
 {
 public void accessories() {
 System.out.println("Color- Black/White/Orange/Red");
 System.out.println("Fuel- Petrol");
 System.out.println("Types of Tyres- Alloy Wheels");
 System.out.println("Airbags ");
 System.out.println("Back Wiper ");
 System.out.println("Side Mirror- Two");
 System.out.println("Touch Screen Music Player ");
 }
 }
 class Sedan extends Car_Factory{
 //method to display accessories of car//
 public void accessories() {
 System.out.println("Types of Tyres- Alloy Wheels");
 System.out.println("Airbags");
 System.out.println("Back Wiper");
 System.out.println("Side Mirror");
 System.out.println("Touch Screen Music Player");
 System.out.println("Roof Window ");
 }
 }
 class Luxary extends Car_Factory
 {
 String Ans;//declaration of data member
 //method to display accessories of car//
 public void accessories() {
 System.out.println("Types of Tyres- Alloy Wheels");
 System.out.println("Airbags");
 System.out.println("Back Wiper");
 System.out.println("Side Mirror");
 System.out.println("Touch Screen Music Player");
 System.out.println("Roof Window");
 System.out.println("Automotive Garbage Cans ");
 System.out.println("Automotice Air Freshner ");
 System.out.println("Button Start ");
 }
 }
 public class Design {
 //ststic main method
 public static void main(String[] args)
 {
 // TODO Auto-generated method stub
 Scanner scan = new Scanner(System.in);//creating object of scanner class
 int ch;
 //double price;
 Car_Factory obj;// object of reference Car_Factory
 while(true)
 {
 //menu driven
 System.out.println("Which Car you want to See?- ");
 System.out.println("\n\t1.Small Car\n\t2.Sedan Car\n\t3.LuxaryCar\n\t4.Exit");
 ch=scan.nextInt();//taking input from user
 System.out.println();
 //switch case
 switch(ch) {
 case 1:
 obj= new Small_car(); //creating object of Small_car
 obj.input();//calling input method
 obj.display(obj);//calling display method
 break;
 case 2:
 obj= new Sedan();//creating object of Sedan
 obj.input();//calling input method
 obj.display(obj);//calling display method
 break;
 case 3:
 obj= new Luxary();//creating object of Luxary
 obj.input();//calling input method
 obj.display(obj);//calling display method
 break;
 case 4:
 System.out.println("\n-----------------------------------");
 return;//stop execution of program
 default:
 System.out.println("INVALID CHOICE !!");//default
 System.out.println("\n-----------------------------------");
 break;
 }
 }
 }
 }