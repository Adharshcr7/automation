package assignmentprograms;

public class A2_Methods5_3Static_2Nonstatic {
	public static void test1() {
		int a = 35;
		int b = 42;
		System.out.println(a + b);
	}

	protected static void test2() {
		String username = "Adharsh123";
		int Age = 28;
		double weight = 66.20;
		System.out.println("Welcome = " + username);
		System.out.println("Your Age = " + Age);
		System.out.println("Your Weight = " + weight);
	}

	static void test3() {
		int c = 24;
		int d = 20;
		int e = c + d;
		int f = c + d * e;
		System.out.println(f);
	}

	public void test4() {
		long mobno = 9999988888l;
		String model = "Iqoo";
		String Sim = "Airtel";
		System.out.println("Welcome Adharsh your mobile info");
		System.out.println(model + Sim + mobno);
	}

	void test5() {
		String user = "Adharsh";
		int age = 27;
		System.out.println("BMI Calculation for user = " + user);
		System.out.println("BMI user age = " + age);
		int weight = 85;
		double height = 1.80;
		double heightdata = height * height;
		double BMI = weight / heightdata;
		System.out.println("BMI details = " + BMI);
	}

	public static void main(String[] args) {
		test1();
		test2();
		test3();
		A2_Methods5_3Static_2Nonstatic NS = new A2_Methods5_3Static_2Nonstatic();
		NS.test4();
		NS.test5();
		System.out.println("Print all 3 static & 2 Non- Static methods successfully");

	}
}
