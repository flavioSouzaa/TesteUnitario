package Model.Entities;

import javax.management.RuntimeErrorException;
import javax.swing.text.StyleContext.SmallAttributeSet;

import Model.Execptions.WithdrawExecpetion;

public class Account {

	private Integer number;
	private String holde;
	private Double balance;
	private Double withdrawLimit;

	public Account() {
	}

	public Account(Integer number, String holde, Double balance, Double withdrawLimit) {
		this.number = number;
		this.holde = holde;
		this.balance = balance;
		this.withdrawLimit = withdrawLimit;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getHolde() {
		return holde;
	}

	public void setHolde(String holde) {
		this.holde = holde;
	}

	public Double getBalance() {
		return balance;
	}

	public Double getWithdrawLimit() {
		return withdrawLimit;
	}

	public Double Deposit(Double amount) {

		if (amount <= 0) {
			throw new RuntimeException("Deposit cannot be null");
		} else {
			return balance += amount;
		}
	}

	public Double Withdraw(Double amount) {
		if (amount > withdrawLimit) {
			throw new WithdrawExecpetion("The amount exceeds withdraw limit");
		}
		if (amount > balance) {
			throw new WithdrawExecpetion("Not enough balance");
		}
		return balance -= amount;
	}

}
