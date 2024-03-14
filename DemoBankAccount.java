import java.util.Scanner;
class BankAccount{
	int balance;
	int accountNumber;
	String accountHolderName;
	public BankAccount(int balance, int accountNumber, String accountHolderName){
		this.balance = balance;
		this.accountNumber = accountNumber;
		this.accountHolderName = accountHolderName;
	}

	public void withdraw(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter amount to withdraw");
		int temp = sc.nextInt();

		try{
			if(balance<temp){
				throw new Exception("Insuffient Balance");
			}
			balance = balance - temp;
			System.out.println("New Balance = "+balance);	
		}catch(Exception e){
			e.printStackTrace();
		}
		
		
	}
}
public class DemoBankAccount{
	public static void main(String[] args) {
		BankAccount ba1 = new BankAccount(10000,1,"arjun");
		BankAccount ba2 = new BankAccount(25000,2,"darshan");

		ba1.withdraw();

		
	}
}