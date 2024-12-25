package assignmentprograms;

import java.util.Map;
import java.util.TreeMap;

/*Assignment 57 - Write a program to demostrate the Map interface functions like put, remove, putAll, equals, replace, 
putIfAbsent, keyset, values, isempty, containskey, containsvalue & clear
*/public class A57_Mapfunctions {

	public static void main(String[] args) {
		Map<String, Integer> M1 = new TreeMap<String, Integer>();
//Put method
		M1.put("Adharsh", 4007);
		M1.put("Messi", 10);
		M1.put("ronaldo", 07);
		System.out.println(M1);
//Put all
		Map<String, Integer> M2 = new TreeMap<String, Integer>();
		M2.put("Beckham", 23);
		M2.putAll(M1);
		System.out.println(M2);
//Remove
		M2.remove("Messi");
		System.out.println(M2);
//equals
		Boolean B1 = M2.equals(M1);
		System.out.println("M1=M2->"+B1);
//Replace
		M2.replace("Adharsh", 162);
		System.out.println(M2);
//Putif absent
		M2.putIfAbsent("Zidane", 19);
		System.out.println(M2);
//Keyset
		System.out.println(M2.keySet());
// Values
		System.out.println(M2.values());
//isEmpty
		Boolean B2 =M2.isEmpty();
		System.out.println("Isempty->"+B2);
//ContainsKEy
		Boolean B3 =M2.containsKey("Adharsh");
		System.out.println("Contains->"+B3);
//Containsvalue
		Boolean B4 = M2.containsValue(19);
		System.out.println("Contains Value->"+B4);
//Clear
		M2.clear();
		System.out.println(M2);
	}

}
