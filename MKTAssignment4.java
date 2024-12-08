package assignmentprograms;
import java.util.Arrays;
//In the given string "Cristiano @ Ronaldo - CR7" find out number of alphabets used, number of numeric letters used, spaces used
//and special character used
public class MKTAssignment4 {
public static void main(String[] args) {
	String name = "Cristiano @ Ronaldo - CR7";
	int alphacount=0;
	int digitcount=0;
	int spacescount=0;
	char[] cc = name.toCharArray();
	System.out.println(Arrays.toString(cc));
	for(int i = 0;i<cc.length;i++) {
		if(Character.isAlphabetic(cc[i])==true) {
			alphacount++;
		}
		if(Character.isDigit(cc[i])==true) {
			digitcount++;
		}
		if(Character.isWhitespace(cc[i])==true) {
			spacescount++;
		}
}System.out.println(alphacount);
System.out.println(digitcount);
System.out.println(spacescount);
int c = name.length() - (alphacount+digitcount+spacescount);
System.out.println(c);
}
}