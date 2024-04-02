public class WHenWhat{
	public static void main(String[] args) {
		TempThread tt = new TempThread();
		tt.start();


		try{
			tt.join();
		}catch(Exception e){
			
		}
		System.out.println("Program Completed");
	}
}

class TempThread extends Thread{
	public void run(){
		for(long i=0;i<10000000000l;i++){
			// time pass
		}
		System.out.println("Loop COmpleted");
	}
}