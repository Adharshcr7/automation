package assignmentprograms;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class A39_PropOfCollection {

	public static void main(String[] args) {
		Collection s1 = new ArrayList();
//collection is heterogeneous in nature and doesn't have fixed size of objects		
		s1.add(12);
		s1.add(22.82);
		s1.add(42.28383);
		s1.add("Adharsh");
		s1.add('V');
//Follows indexing & order of insertion
		System.out.println(s1); 
//Allows null values and duplicate values
		s1.add(null);
		s1.add(null);
		s1.add("Adharsh");
		System.out.println(s1); 
//Collection follows forward iteration using iterator and list iterator is not applicable
		Iterator sm = s1.iterator();
		while(sm.hasNext()) {
			System.out.println(sm.next());
		}
//Sorting collection using collections class is not possible so used collections class in list interface
		List<Integer> s2 = new ArrayList<Integer>();
		s2.add(82);
		s2.add(92);
		s2.add(102);
		s2.add(14);
		Collections.sort(s2);
		System.out.println(s2);

	}

}
