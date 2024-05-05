/*Design and develop a context for given case study and implement an interface for Vehicles
Consider the example of vehicles like bicycle, car and bike. All Vehicles have common
functionalities such as Gear Change, Speed up and apply breaks. Make an interface and put all
these common functionalities. Bicycle, Bike, Car classes should be implemented for all these
functionalities in their own class in their own way.*/
interface Vehicles{
	
	public void GearChange();
	public void Speedup();
	public void Applybreaks();
	
}
class Bicycle implements Vehicles{
	public void GearChange(){
	System.out.println("Gear changed for bicycle");	
		
	}
	
	public void Speedup() {
		
	System.out.println("Speed Up for bicycle");	
	}
	
	public void Applybreaks() {

	System.out.println("Breaks applied for bicycle");
	}
	
	
}
class Car implements Vehicles{
	
	public void GearChange(){
		System.out.println("Gear changed for Car");	
			
		}
		
		public void Speedup() {
			
		System.out.println("Speed Up for Car");	
		}
		
		public void Applybreaks() {

		System.out.println("Breaks applied for Car");
		}
	
}
class Bike implements Vehicles{
	
	public void GearChange(){
		System.out.println("Gear changed for bike");	
			
		}
		
		public void Speedup() {
			
		System.out.println("Speed Up for bike");	
		}
		
		public void Applybreaks() {

		System.out.println("Breaks applied for bike");
		}
		
	
}
public class Interface {
	public static void main(String[]args) {
		
	Vehicles v;	
	
	v=new Bicycle();
	v.GearChange();
	v.Speedup();
	v.Applybreaks();
	
	v=new Car();
	v.GearChange();
	v.Speedup();
	v.Applybreaks();
	
	v=new Bike();
	v.GearChange();
	v.Speedup();
	v.Applybreaks();
	
  }

}