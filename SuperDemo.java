class MovingObject{
	int noOfGears = 2;
}
class Vehicle extends MovingObject{
	int noOfGears = 5;

	public int getSuper(){
		return super.noOfGears;
	}
}
class Car extends Vehicle{
	int noOfGears = 10;

	public void printGear(){
		int noOfGears = 15;
		System.out.println("Local = "+noOfGears);
		System.out.println("Insta = "+this.noOfGears);
		System.out.println("Super = "+super.noOfGears);
		System.out.println("Super ka super = "+super.getSuper());
	}
}
public class SuperDemo{
	public static void main(String[] args) {
		Car audi = new Car();
		audi.printGear();
	}
}