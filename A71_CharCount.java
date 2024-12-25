package assignmentprograms;
//A71 - Write a java code to print count of each character of a string without using build-in length functionString name = "Lionel Messi LM10"
public class A71_CharCount {

	public static void main(String[] args) {
		String a ="Lionel Messi LM10";
		char[] b =a.toCharArray();
		int chr = 0;
		for(int i=0;i<b.length;i++) {
		if(Character.isAlphabetic(b[i])==true) {
			chr++;
	}
		}System.out.println(chr);
}
}
