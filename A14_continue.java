package assignmentprograms;

//Assignment 14 - Write a program using 'continue' statement to skip printing any numbers from 100 to 200

public class A14_continue {

	public static void main(String[] args) {
	for (int num = 105;num>=100 && num<=200;num++)
	{
		if(num==130) {
			continue;
		}
		if(num>110 && num<130) {
			continue;
		}
		if(num>=145 && num<=190) {
			continue;
		}
		System.out.println(num);
		}
	}
}
	

