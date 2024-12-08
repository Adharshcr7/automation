package assignmentprograms;
/*Assignment 3
if else - Find the largest number among two*/
public class A3_Largestnumber_among_two {
	void largest() {
		int a = 78;
		int b = 77;
		if(a>b)
		{
			System.out.println("Largest number is A");
		}else
		{
			System.out.println("Largest number is B");
		}
	}
public static void main(String[] args) {
	A3_Largestnumber_among_two LN = new A3_Largestnumber_among_two();
	LN.largest();
}
}