import java.util.*;

public class Bank{
	double balance = 0, draw_amt, deposit;
	public void ATM(){
		System.out.println("****** Aastha Bank ATM ******");
		Scanner s = new Scanner(System.in);
		System.out.println("Enter A/c No: ");
		int acc_no = s.nextInt();
		while(true){
			if(acc_no == 889814){
				System.out.println("\n1. Check Balance\n2. Withdraw Money\n3. Deposit Money\n4. Exit\n");
				System.out.println("\nChoose Option: ");
				int n = s.nextInt();
				switch(n)
				{
					case 1:
						System.out.println("\nYour Balance: " + balance);
						break;
					case 2:
						System.out.println("\nEnter amount to withdraw: ");
						draw_amt = s.nextDouble();
						if(balance < draw_amt){
							System.out.println("Insufficient Balance...");
						}
						else{
							balance = balance - draw_amt;
							System.out.println("n" + draw_amt + " Rs. Withdrawn Successfully...");
							System.out.println("New Balance: " + balance);
						}
						break;
					case 3:
						System.out.println("\nEnter amount to deposit: ");
						deposit = s.nextDouble();
						balance = balance + deposit;
						System.out.println(deposit + " Rs. Deposited Successfully...");
						System.out.println("New Balance: " + balance);
						break;
					case 4:
						System.exit(0);
					default:
						System.out.println("Invalid option...");
				}
			}
			else if(acc_no == 654321){
				System.out.println("\n1. Check Balance\n2. Withdraw Money\n3. Deposit Money\n4. Exit\n");
				System.out.println("\nChoose Option: ");
				int n = s.nextInt();
				switch(n)
				{
					case 1:
						System.out.println("\nYour Balance: " + balance);
						break;
					case 2:
						System.out.println("\nEnter amount to withdraw: ");
						draw_amt = s.nextDouble();
						if(balance < draw_amt){
							System.out.println("Insufficient Balance...");
						}
						else{
							balance = balance - draw_amt;
							System.out.println("n" + draw_amt + " Rs. Withdrawn Successfully...");
							System.out.println("New Balance: " + balance);
						}
						break;
					case 3:
						System.out.println("\nEnter amount to deposit: ");
						deposit = s.nextDouble();
						balance = balance + deposit;
						System.out.println(deposit + " Rs. Deposited Successfully...");
						System.out.println("New Balance: " + balance);
						break;
					case 4:
						System.exit(0);
					default:
						System.out.println("Invalid option...");
				}
			}
			else{
				System.out.println("Invalid account number. Please check your account number.");
			}
		}
	}
	public static void main(String args[]){
		Bank bank = new Bank();
		bank.ATM();
	}
}
