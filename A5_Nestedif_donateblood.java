package assignmentprograms;

/*Assignment 5
Nested if: Donate blood considering the metrics age and weight. the person age must be greater 
than 18 and weight must be greater than 55 in order to donate the blood*/
public class A5_Nestedif_donateblood {

	public static void main(String[] args) {
		int age = 21;
		int weight = 54;
		if (age >= 18) {
			if (weight >= 55) {
				System.out.println("Person is eligible for donating blood");
			}
		}else {
			if (age < 18) {
				if (weight < 55) {
					System.out.println("Person is not eligible for donating blood");
				}
			}
			if (age >= 18) {
				if (weight < 55) {
					System.out.println("Person is not eligible for donating blood due to weight criteria doesn't match");
				}
			}
			if (age < 18) {
				if (weight >= 55) {
					System.out.println("Person is not eligible for donating blood due to age criteria doesn't match");
				}
			}
		}
	}
}

