package assignmentprograms;

/*Assignment 18 - Write a program on 'super' statement to invoke a parent class constructor from 
a child class constructor.Consider here the Parent class is 'Vehicle'and Child class is 'Car.'*/

class vehicle{
	vehicle(){ //default constructor
		System.out.println("Please check list of car types");
		}
	}
class car extends vehicle{
	car(String a){
		/*no super function added to invoke because parent class
		constructor is non-parameterized which is implicit */
		System.out.println("Sports car");
		System.out.println("Compact car");
		System.out.println("SUV");
		System.out.println("Jeep");
		System.out.println("Luxury");
	}
}
public class A18_SuperCalling extends car{
	A18_SuperCalling(){
		/*here we used super function because it's parent class constructor
		 is parameterized which was explicited*/
		super("adharsh");
	
		System.out.println("Pick anyone and get quote instantly!!!!");
	}
	public static void main(String[] args) {	
new A18_SuperCalling();
	}
}
