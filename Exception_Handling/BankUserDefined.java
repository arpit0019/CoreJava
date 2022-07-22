package Exception_Handling;

import java.util.Scanner;

class LowBalanceException extends Exception{
	public String toString() {
		return "Bank is going low than 5000 , please enter a less amount ";
	}
}

public class BankUserDefined {

	public static void main(String[] args) throws LowBalanceException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the amount to be debited");
		int x = sc.nextInt();
		if(x<5000) {
			
			throw new LowBalanceException();
		
			
		}
		else {
			System.out.println("your amount is debited");
		}

	}

}
