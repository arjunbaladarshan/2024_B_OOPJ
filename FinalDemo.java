final class Vehicle{
	int speedLimit=80;

	public void printSpeed(){
		System.out.println("Limit for vehicle = "+speedLimit);
	}
	
}
class Car extends Vehicle{
	public void printSpeed(){
		System.out.println("Limit for car = "+speedLimit);
	}
}
public class FinalDemo{
	public static void main(String[] args) {
		Car v1 = new Car();
		v1.printSpeed();
	}
}