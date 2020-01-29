package Application;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

import javax.tools.DocumentationTool.Location;

import Model.Entities.Account;
import Model.Execptions.WithdrawExecpetion;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		/*
		try {
			System.out.print("Enter account data");
			System.out.print("Number:");
			Integer number = sc.nextInt();
			System.out.print("Holder:");
			String holde = sc.nextLine();
			sc.nextLine();
			System.out.print("Initial balance:");
			Double balance = sc.nextDouble();
			System.out.print("Withdraw limit:");
			Double withdrawLimit = sc.nextDouble();

			Account account = new Account(number, holde, balance, withdrawLimit);
			System.out.print("informs the deposit amount: ");
			Double amount = sc.nextDouble();
			account.Deposit(amount);
			System.out.print("Balance amount : " + account.getBalance());
			System.out.print("\nLimit Withdraw: " + account.getWithdrawLimit());
			
			System.out.println();
			System.out.print("Enter amount for withdraw:");
			Double withdraw = sc.nextDouble();
			account.Withdraw(withdraw);
			System.out.print("Balance data : " + account.getBalance());
			System.out.print("\nLimit Withdraw: " + account.getWithdrawLimit());
		} 
		catch (InputMismatchException e) {
			System.out.println("Invalid date!");
		}
		catch(WithdrawExecpetion e) {
			System.out.println("Error Withdraw: " + e.getMessage());
		}
		catch(RuntimeException e) {
			System.out.println("Falha no Depósito: " + e.getMessage());
		}

*/
	}
}
