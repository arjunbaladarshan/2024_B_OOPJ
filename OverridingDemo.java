class SmartPhone{
	public void setAlarm(){
		System.out.println("=== Set Alarm Steps ===");
		System.out.println("1) Go to Settings");
		System.out.println("2) Go to Clocks");
		System.out.println("3) Go to Alarm");
		System.out.println("4) Set Time");
		System.out.println("5) Save alarm");
	}
}

class IPhone extends SmartPhone{
	public void setAlarm(){
		System.out.println("=== Set Alarm ===");
		System.out.println("Tell siri to set alram for you");
	}
}

class Android extends SmartPhone{
	public void setAlarm(){
		System.out.println("=== Set Alarm ===");
		System.out.println("Tell Google Assist to set alram for you");
	}	
}

public class OverridingDemo{
	public static void main(String[] args) {
		Android oppo = new Android();
		oppo.setAlarm();
		IPhone i15 = new IPhone();
		i15.setAlarm();
		SmartPhone lava = new SmartPhone();
		lava.setAlarm();
	}
}