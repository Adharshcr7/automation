package assignmentprograms;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;
/*Assignment 53 - Write a program to demonstrate the properties of Vector class and 
also use some of the vector functions like addElements, firstElement, lastElement, removeElement, removeElementAt, removeAllElement & capacity
*/
public class A53_VectorClass {

	public static void main(String[] args) {
		Vector <String> vect = new Vector<String>();
//Adding elements - It allows heterogeneous datatype to store values and also follows indexing & order of insertion
		vect.addElement("Adharsh");
		vect.addElement("Messi");
		vect.addElement("Ronaldo");
		vect.addElement("Beckham");
		System.out.println("Added elements->"+vect);
//It allows null values and duplicates as well
		vect.addElement(null);
		vect.addElement(null);
		vect.addElement("Adharsh");
		System.out.println(vect);
//It allows iterator, list iterator & enumeration
//iterator
		Iterator it1 = vect.iterator();
		while(it1.hasNext()) {
			System.out.println(it1.next());
		}
//List iterator
		ListIterator lt1 = vect.listIterator();
		while(lt1.hasNext()) {
			System.out.println(lt1.next());
		}
		while(lt1.hasPrevious()) {
			System.out.println(lt1.previous());
		}
//Enumeration
		Enumeration enu = vect.elements();
		while(enu.hasMoreElements()) {
			System.out.println(enu.nextElement());
		}
//First element
		System.out.println("Prints first element->"+vect.firstElement());
//Last element
		System.out.println("Prints last element->"+vect.lastElement());
//Capacity
		System.out.println("print capacity->"+vect.capacity());
//Remove elements
		vect.removeElement("Adharsh");
		System.out.println(vect);
//Remove elementsAt
		vect.removeElementAt(2);
		System.out.println(vect);
//Remove all elements
		vect.removeAll(vect);
		System.out.println(vect);
	}
}
