package assignmentprograms;
//Assignment 73 - Write a program to demonstrate "this" keyword
public class A73_thisKeywordEncap {
int a;
 void mm(int a) {
	this.a = a;
	System.out.println("nS->"+a);
}
	public static void main(String[] args) {
		A73_thisKeywordEncap ss = new A73_thisKeywordEncap();
		ss.mm(23);
		System.out.println(ss.a);

	}

}
