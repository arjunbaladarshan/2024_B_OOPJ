class Vehicle{
	public Vehicle(){
		System.out.println("Default Vehicle");
	}
	public Vehicle(int a){
		this();
		System.out.println("Parameterized Vehicle");	
	}
}
class Car extends Vehicle{
	public Car(){
		System.out.println("Default Car");
	}
	public Car(int a){
		super(a);
		this();
		System.out.println("Parameterized Car");	
	}	
}
class Audi extends Car{
	public Audi(){
		System.out.println("Default Audi");
	}
	public Audi(int a){
		super(a);
		this();
		System.out.println("Parameterized Audi");	
	}
}
public class VehicleDemo{
	public static void main(String[] args) {
		Audi v1 = new Audi(15);
	}
}