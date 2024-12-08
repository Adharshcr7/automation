package assignmentprograms;
//Assignment 24 - Write a program that demonstrate 'interface' concept.
//Create an interface called Vehicle has the following methods:void start() void stop() void getSpeed() void setSpeed (int speed)
// Then, create two classes that implement this interface: Car,Bicycle
interface Vehicles{
	void start();
	void stop();
	void getSpeed();
	void setSpeed(int speed);
}
class cars implements Vehicles{
	public void start(){
		System.out.println("Welcome to ride Bugatti Veyron");
		String key = "on";
		if(key.equals("on")) {
			System.out.println("Ready to race!!!!");
		}else {
			System.out.println("Please put key and start the Car");
		}
	}
	public void stop() {
		String key = "Stop";
		if(key.equals("Stop")) {
			System.out.println("Park the car safely");
		}else {
			System.out.println("Turn off the engine to stop the car");
		}
	}
	public void getSpeed() {
		int speed = 120;
		if(speed<30) {
			System.out.println("Please try to maintain average speed");
		} else if(speed>=30 && speed<=100) {
			System.out.println("Good!! you are going in average speed maintain same speed level");
		} else {
			System.out.println("You exceeded the average speed!!! please drive safe");
		}
			
	}
	public void setSpeed(int speed) {
		System.out.println("Your speed limit is = "+speed);
	}
}
class bicycle extends cars{
	public void start1(){
		String key = "on";
		if(key.equals("on")) {
			System.out.println("Ready to ride!!!!");
		}else {
			System.out.println("Please put key and unlock");
		}
	}
	public void stop1() {
		String key = "Stop";
		if(key.equals("Stop")) {
			System.out.println("Park the bicycle safely");
		}else {
			System.out.println("Stop the bicycle and lock with key");
		}
}
}
public class A24_Interface extends bicycle{
	public static void main(String[] args) {
		A24_Interface n1 = new A24_Interface();
		n1.start();
		n1.stop();
		n1.getSpeed();
		n1.setSpeed(80);
		n1.start1();
		n1.stop1();
	}
}

