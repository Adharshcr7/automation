package assignmentprograms;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;
/*Assignment 49 - Write a program to demonstrate the Map interface with the given details:
1.Name and Bodyweight
2.BankName and Bank Account ID
3.Firstname and Lastname
4.List of Household Items and their Quantities*/
public class A49_MapInteraceProblem {
public static void main(String[] args) {
//Name & Body weight using Map interface
		Map<String,Float> bmi = new TreeMap<String, Float>();
		bmi.put("Adharsh", 82.3f);
		bmi.put("Ronaldo", 78.4f);
		bmi.put("Messi", 72.3f);
		for(Entry<String,Float> print:bmi.entrySet()) {
			System.out.println(print);
		}
		System.out.println();
//Bank name & bank account ID using Map interface
		Map<String,Long> bank = new TreeMap<String, Long>();
		bank.put("HDFC", 129321939213l);
		bank.put("ICICI", 283883833l);
		bank.put("SBI", 9293923l);
		for(Entry<String,Long> print1:bank.entrySet()) {
			System.out.println(print1);
		}
		System.out.println();
//Firstname & Lastname using Map Interface
		Map<String,Character> name = new TreeMap<String, Character>();
		name.put("Lionel", 'M');
		name.put("Cristiano", 'R');
		name.put("David", 'B');
		for(Entry<String,Character> print2:name.entrySet()) {
			System.out.println(print2);
		}
		System.out.println();
//List of Household Items and their Quantities using Map Interface
		Map<String,Integer> items = new TreeMap<String, Integer>();
		items.put("Soap", 10);
		items.put("Shampoo", 5);
		items.put("Dish washer", 2);
		for(Entry<String,Integer> print3:items.entrySet()) {
			System.out.println(print3);
		}
		System.out.println();
//Sports & famous players using Map interface
		Map sport = new TreeMap();
		sport.put("Football", "Pele");
		sport.put("Boxing", "Mike Tyson");
		sport.put("MMA", "Khabib");
		for(Object print4:sport.entrySet()) {
			System.out.println(print4);
		}
	}
	}


