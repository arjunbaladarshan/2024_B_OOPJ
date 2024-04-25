class MobilePhone{
	int stock=3;

	public synchronized void produce(){
		while(stock>6){
			try{
				wait();
			}catch(Exception e){
				e.printStackTrace();
			}
		}
		stock++;
		try{
			notifyAll();
		}catch(Exception e){
			e.printStackTrace();
		}
		System.out.println("Current Stock = "+stock);
	}

	public synchronized void consume(){
		while(stock<1){
			try{
				wait();
			}catch(Exception e){
				e.printStackTrace();
			}
		}
		stock--;
		try{
			notifyAll();
		}catch(Exception e){
			e.printStackTrace();
		}
		System.out.println("Current Stock = "+stock);
	}
}

class Producer extends Thread{
	MobilePhone mp;
	public Producer(MobilePhone mp){
		this.mp = mp;
	}
	public void run(){
		try{
			while(true){
				mp.produce();
				int randomWait = (int)(Math.random()*100);
				sleep(randomWait);
			}
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}

class Consumer extends Thread{
	MobilePhone mp;
	public Consumer(MobilePhone mp){
		this.mp = mp;
	}
	public void run(){
		try{
			while(true){
				mp.consume();
				int randomWait = (int)(Math.random()*100);
				sleep(randomWait);
			}
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}

public class ProducerConsumer{
	public static void main(String[] args) {
		MobilePhone mp = new MobilePhone();
		Consumer c = new Consumer(mp);
		Producer p = new Producer(mp);

		c.start();
		p.start();
	}
}