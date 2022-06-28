package Day11;

import java.util.Scanner;

public class AccountManagement {

private long balance = 0;
	
	Scanner sc = new Scanner(System.in);
	
	public void credit() {
		System.out.println("Enter the Amount you want to Add: $");
		long creditAmount = sc.nextLong();
		balance = balance + creditAmount;
		System.out.println("The Account is Credited $"+creditAmount+".\n your Current balance is $"+balance+".");		
	}
		public void Debit() {
			System.out.println("Enter the Amount you want to Withdraw: $");
			long debitAmount = sc.nextLong();
			if(balance > debitAmount) {
				balance = balance - debitAmount;
				System.out.println("The account is debited $"+debitAmount + ".\n your Current balance is $" + balance+".");	
			}
			else
				System.out.println("Debit Amount exceeded Amount balance,");
		}
		public static void main(String[] args) {
			
			AccountManagement ac = new AccountManagement();
			int choice = 0;
			while(choice<3) {
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter your choice: \n 0:Exit \n 1:credit \n 2:debit");
				choice = sc.nextInt();
				
				switch(choice) {
					case 1:
						ac.credit();
						break;
					case 2:
						ac.Debit();
						break;
						
				}
			}
		}
	
}	
