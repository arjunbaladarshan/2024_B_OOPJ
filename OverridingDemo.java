import java.util.Scanner;
class Vehicle{
	public void start(){
		System.out.println("Set a Key and Kick Start");
	}
}
class Car extends Vehicle{
	@Override
	public void start(){
		System.out.println("Keep the key with you and press button");
	}
}
class Bike extends Vehicle{
	public void start(){
		System.out.println("Set a key and self start");
	}
}
class EBike extends Bike{
	public void start(){
		System.out.println("Enter Password and go");
	}
}
public class OverridingDemo{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter \n1 for Car\n2 for Bike\n3 for EBike\n Any other numner for vehicle");
		int temp = sc.nextInt();
		Vehicle myVehicle = null;
		if(temp==1){
			myVehicle = new Car();
		}
		else if(temp==2){
			myVehicle = new Bike();
		}
		else if(temp==3){
			myVehicle = new EBike();
		}
		else{
			myVehicle = new Vehicle();
		}

		
		myVehicle.start();
	}
}