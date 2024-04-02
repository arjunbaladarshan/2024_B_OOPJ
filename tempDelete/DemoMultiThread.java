class PrintName extends Thread{
	String name;
	public PrintName(String name){
		this.name = name;
	}
	public void run(){
		for(int i=0;i<name.length();i++){
			System.out.print(name.charAt(i));
			try{
				sleep(100);	
			}catch(Exception e){
				e.printStackTrace();
			}
		}
	}
}
public class DemoMultiThread{
	public static void main(String[] args) {
		PrintName pn1 = new PrintName("drhnuiest");
		pn1.start();

		PrintName pn2 = new PrintName("asa nvriy");
		pn2.start();
	}
}