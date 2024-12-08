package assignmentprograms;
import java.util.Scanner;
/*Design a class LibraryItem with attributes like title and author. Then, create two subclasses Book and Magazine that inherit 
 * from LibraryItem. The Book class should have additional attributes like ISBN and numPages, while the Magazine class should 
 * have attributes like issueNumber and month.
Tasks:
Create a Book object and a Magazine object.
Print out all their details using appropriate methods.*/

class LibraryItem{
	String title;
	String author;
}
class Book extends LibraryItem{
	long ISBN;
	int numPages;
}
class Magazine extends LibraryItem{
	int issueNumber;
	String month;
}
public class A20_hierarchicalinherit  {
	public static void main(String[] args) {
		Book n1 = new Book();
		Scanner n2 = new Scanner(System.in);
		System.out.println("Please enter book name");
		n1.title = n2.nextLine();	
		System.out.println("Please enter Author name");
		n1.author = n2.nextLine();
		System.out.println("Please enter ISBN number");
		n1.ISBN = n2.nextLong();
		System.out.println("Please enter numPages");
		n1.numPages = n2.nextInt();
		Magazine n3 = new Magazine();
		System.out.println("Please enter Issue number");
		n3.issueNumber = n2.nextInt();
		System.out.println("Please enter Issued month");
		n3.month = n2.next();
		System.out.println("Book Name->"+n1.title);
		System.out.println("Author Name->"+n1.author);
		System.out.println("ISBN Number->"+n1.ISBN);
		System.out.println("NumPages->"+n1.numPages);
		System.out.println("Issue Number->"+n3.issueNumber);
		System.out.println("Issue Month->"+n3.month);
	}
}
