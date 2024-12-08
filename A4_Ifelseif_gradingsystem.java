package assignmentprograms;
/*Assignment 4
if else if - grading system considering the marks 
A+: 90-100 , A: 80-90, B: 70-80, C: 60-70, D: 50-60, less than 50 marks is FAIL*/
public class A4_Ifelseif_gradingsystem {
	A4_Ifelseif_gradingsystem() {
		double marks = 51;
		if (marks < 50) {
			System.out.println("You are Failed in Exam");
		} else if (marks >= 50 && marks <= 60)  {
			System.out.println("Good you passed the exam with 'D' Grade");
		} else if (marks >= 60 && marks <= 70) {
			System.out.println("Nice you passed the exam with 'C' Grade");
		} else if (marks >= 70 && marks <= 80) {
			System.out.println("Great you passed the exam with 'B' Grade");
		} else if (marks >= 80 && marks <= 90) {
			System.out.println("Excellent you passed the exam with 'A' Grade");
		} else if (marks >= 90 && marks <= 100) {
			System.out.println("Outstanding you passed the exam with 'A+' Grade");
		}
		if(marks>50) {
			System.out.println("Congratulations your promoted to next level");
		}else {
			System.out.println("Sorry your depromoted");
		}
	}
	public static void main(String[] args) {
		A4_Ifelseif_gradingsystem grade = new A4_Ifelseif_gradingsystem();				
	}

}
