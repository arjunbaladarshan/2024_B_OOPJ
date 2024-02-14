import java.util.Scanner;
public class FirstNOdd{
	public static void main(String[] artgs){
		System.out.println("Please enter number");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		boolean isPrime = true;

		for(int i=2;i<n/2;i++){
			if(n%i==0){
				isPrime = false;
				break;
			}
		}

		if(isPrime){
			System.out.println("Number is prime");
		}
		else{
			System.out.println("Number is not prime");
		}
	}
}