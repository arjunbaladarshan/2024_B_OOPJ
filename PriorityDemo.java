class Thread1 extends Thread{
	public void run(){
		int temp = 0;
		while(true){
			temp++;
			System.out.println("Thread 1 = "+temp);
		}
	}
}
class Thread2 extends Thread{
	public void run(){
		int temp = 0;
		while(true){
			temp++;
			System.out.println("Thread 2 = "+temp);
		}
	}
}
public class PriorityDemo{
	public static void main(String[] args) {
		Thread1 t1 = new Thread1();
		t1.setPriority(10);
		t1.start();

		Thread2 t2 = new Thread2();
		t1.setPriority(1);
		t2.start();
	}
}