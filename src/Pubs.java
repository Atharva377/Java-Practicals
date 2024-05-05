/*Identify commonalities and differences between Publication, Book and Magazine classes. Title,
Price, Copies are common instance variables and saleCopy is common method. The differences
are, Bookclass has author and orderCopies(). Magazine Class has methods orderQty, Current issue,
receiveissue().Write a program to find how many copies of the given books are ordered and
display total sale of publication.
*/
import java.util.Scanner;

class Publication{
	String title;
	int price,copies;
	void Salescopy() {
		
	}
	
}
class Book{
	String title,author;
	int price,copies;
	
void Salescopy() {
	price=120;
	System.out.print("Total sale:"+price*copies);
			
}
void orderCopies() {
Scanner sc=new Scanner(System.in);	
System.out.print("Enter copies:");
copies=sc.nextInt();
		
}
	
}
class Magazine{
	String title;
	int price,copies;
	
void Salescopy() {
		
	}
	
void Currentissue() {
	
	
}
void Recieveissue() {
	
	
	
}
	
	
	
}








public class Pubs {
public static void main(String[]args) {
	
Book b=new Book();
b.orderCopies();
b.Salescopy();
	
	
	
   }
}
