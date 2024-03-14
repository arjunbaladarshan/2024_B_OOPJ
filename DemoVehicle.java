interface MovingObject{
	public void start();
	public void stop();
	public void speedUp();
	public void slowDown();
	int a = 10;
}

interface LuxuryPlace{
	public void sofa();
}

class Vehicle implements MovingObject, LuxuryPlace{
	public void stop(){
		System.out.println("Stop method");
	}
	public void start(){
		System.out.println("Start method");
	}
	public void slowDown(){
		System.out.println("SlowDown method");
	}
	public void speedUp(){
		System.out.println("speedUp method");
	}
	public void sofa(){
		//some code
	}
}
public class DemoVehicle{
	public static void main(String[] args) {
		System.out.println(Vehicle.a);
	}
}