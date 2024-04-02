class Table{
	synchronized public void printTable(int n){
		for(int i=1;i<=10;i++){
			System.out.println(n+" X "+i+ " = "+(n*i));

			try{
				Thread.sleep(100);
			}catch(Exception e){
				e.printStackTrace();
			}
		}
	}
}

class Thread1 extends Thread{
	Table t;
	public Thread1(Table t){
		this.t = t;
	}
	public void run(){
		for(int i=0;i<10;i++){
			System.out.println("Thread 1 iteration "+i);
			try{
				sleep(100);
			}catch(Exception e){
				e.printStackTrace();
			}
		}
		t.printTable(5);
	}
}
class Thread2 extends Thread{
	Table t;
	public Thread2(Table t){
		this.t = t;
	}
	public void run(){
		for(int i=0;i<10;i++){
			System.out.println("Thread 2 iteration "+i);
			try{
				sleep(100);
			}catch(Exception e){
				e.printStackTrace();
			}
		}
		t.printTable(12);
	}
}


public class SyncDemo{
	public static void main(String[] args) {
		Table t = new Table();
		
		Thread1 t1 = new Thread1(t);
		Thread2 t2 = new Thread2(t);

		t1.start();
		t2.start();
	}
}