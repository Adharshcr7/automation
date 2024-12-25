package assignmentprograms;
interface adhar{
	void adh1();
	void adh2();
}
public class A66_InterfaceAS implements adhar {
	public void adh1() {
		System.out.println("Hello1");
	}
	public void adh2() {
		System.out.println("Hello2");
	}
	public static void main(String[] args) {
		A66_InterfaceAS u1 = new A66_InterfaceAS();
		u1.adh1();
		u1.adh2();

	}

}
