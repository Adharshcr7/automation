package assignmentprograms;
import java.util.Arrays;
/*Assignment 30 - find the below from the given string: " Hello! 123@ jAvA_"
a)Number of alphabets used?
b)Number of numeric used?
c)Specail characters used?
d)Spaces used?*/
public class A30_AlphaSpecialDigit {
	public static void main(String[] args) {
	String a = " Hello! 123@ jAvA_";
	int alphabet =0;
	int numeric = 0;
	int spaces = 0;
	char[] ch = a.toCharArray();
	System.out.println(Arrays.toString(ch));
    for(int i = 0;i<ch.length;i++) {
    	if(Character.isAlphabetic(ch[i])==true) {
    		alphabet++;
    	}
    	if(Character.isDigit(ch[i])==true) {
    		numeric++;
    	}
    	if(Character.isWhitespace(ch[i])==true) {
    		spaces++;
    	}
 
    }System.out.println("Number of alphabets used = "+alphabet);
    System.out.println("Number of numeric values used = "+numeric);
    System.out.println("Number of spaces used = "+spaces);
    int special = ch.length - (alphabet+numeric+spaces);
    System.out.println("Number of special characters used = "+special);
	}

}
