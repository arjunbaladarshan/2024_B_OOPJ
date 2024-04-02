import java.util.Scanner;
import java.io.*;
public class DemoException{
	public static void main(String[] args) {
		arjun();
		System.out.println("Goodbye");
	}

	public static void arjun(){
		Scanner sc = new Scanner(System.in);
		int n1 =0;
		int n2 = 1;
		
		System.out.println("Enter number 1");
		n1 = sc.nextInt();
		System.out.println("Enter number 2");
		n2 = sc.nextInt();
		int ans;

		ans = n1 / n2;
		PrintStream	ps = null;
		try{		
			ps = new PrintStream("answer.txt");
			ps.println("Answer = "+ans);
			ps.close();
			ans = n1 / n2;
			System.out.println("Data saved in answer.txt file");
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}	
		finally{
			ps.close();

		}
	}
}