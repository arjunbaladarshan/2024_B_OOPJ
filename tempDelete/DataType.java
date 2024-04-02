import java.util.Scanner;

public class DataType{
	public static void main(String[] args) {
		
		// Scanner class
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter number 1");
		int n1 = sc.nextInt();

		System.out.println("Please enter number 2");
		int n2 = sc.nextInt();

		System.out.println("Please enter number 3");
		int n3 = sc.nextInt();

		if(n1>n2){
			if(n1>n3){
				System.out.println("Number 1 is largest");
			}
			else{
				System.out.println("Number 3 is largest");
			}
		}
		else{
			if(n2>n3){
				System.out.println("Number 2 is largest");
			}
			else{
				System.out.println("Number 3 is largest");
			}
		}
	}
}
