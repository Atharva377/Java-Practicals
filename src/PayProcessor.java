import java.util.Scanner;

 interface PaymentProcessor {
	
	abstract public void pay(int amt);

}
class CreditCard implements PaymentProcessor{
	
	String name;
	int no,cvv;
	
	CreditCard(){
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter card holder name-");
	name=sc.next();	
	System.out.print("Enter Card Number-");
	no=sc.nextInt();	
	System.out.print("Enter cvv Number-");
	cvv=sc.nextInt();	
	}	
	public void pay(int amt) {
		
		System.out.println("Payment through credit card charging:"+amt);
		
	}
}
class PayPal implements PaymentProcessor{
	
public void pay(int amt) {
		
		System.out.println("Payment through PayPal charging:"+amt);
		
	}	
		
}
class Bitcoin implements PaymentProcessor{
	
	String add;
	
	Scanner sc=new Scanner(System.in);
	Bitcoin(){
		
		System.out.println("Enter Transaction input address-");
		add=sc.next();
	}
		public void pay(int amt) {
			
			System.out.println("Payment through Bitcoin charging:"+amt);
			
		}		
		
		
	}
class Order{
	private final PaymentProcessor paymentProcessor;
	private final int  amt;
	
	public Order(int amt,PaymentProcessor paymentProcessor) {
		this.amt=amt;
		this.paymentProcessor=paymentProcessor;
	}
		void process() {
			paymentProcessor.pay(amt);
				
		}		
	}
		

	public class PayProcessor{
		public static void main(String[] args) {
			
		int ch;
		Order ord;
		int amt=0;
		Scanner sc=new Scanner(System.in);
		
		while(true) {
			System.out.println("\n-----SHOPPING CART----------");
			System.out.println("\n1.Credit Card\n2.PayPal\n3.Bitcoin\n4.Exit");
			System.out.println("Enter your choice-");
			ch=sc.nextInt();
			
			if(ch==1||ch==2||ch==3) {
				
				
	     System.out.println("Enter amt to be paid-");
	      amt=sc.nextInt();			
	      }
			
		switch(ch) {
		
		case 1:
			ord=new Order(amt, new CreditCard());
			ord.process();
			break;
		case 2:
			ord=new Order(amt, new PayPal());
			ord.process();
			break;	
		case 3:
			ord=new Order(amt, new Bitcoin());
			ord.process();
			break;
		case 4:
			System.out.println("Thank you for shopping");
			return;
		case 5:
			 System.out.println("Invalid choice");
			 
		
		
		}	
			
			
			
			
			
		}		
			
			
			
			
		}
			
			
			
			
			
			
			
			
		}
		
		
		
		
		
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
