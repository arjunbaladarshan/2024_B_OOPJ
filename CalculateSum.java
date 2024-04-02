import java.util.Scanner;
import java.util.Date;
public class CalculateSum{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter Number");

		long n = sc.nextLong();

		long ans = 0;

		long dStart = new Date().getTime(); 
		
		CountHalf ch1 = new CountHalf("1");
		ch1.start();

		CountHalf ch2 = new CountHalf("2");
		ch2.start();

		CountHalf ch3 = new CountHalf("3");
		ch3.start();

		CountHalf ch4 = new CountHalf("4");
		ch4.start();

		CountHalf ch5 = new CountHalf("5");
		ch5.start();	

		try{
			ch1.join();
			ch2.join();
			ch3.join();
			ch4.join();
			ch5.join();
		}
		catch(Exception e){
			e.printStackTrace();
		}
		

		long dEnd = new Date().getTime();
		System.out.println("Program Completed");
		System.out.println("Time Taken = "+(dEnd-dStart) + " ms");
	}
}

class CountHalf extends Thread{
	public CountHalf(String name){
		super(name);
	}
	public void run(){
		for(long i=0;i<10000000000l;i++){
			// doing nothing
		}
		System.out.println("Loop "+getName()+" completed");
	}
}