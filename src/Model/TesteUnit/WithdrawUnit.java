package Model.TesteUnit;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import Model.Entities.Account;
import Model.Execptions.WithdrawExecpetion;

public class WithdrawUnit {

	Account account = new Account(123, "Teste", 0.0, 0.0);
	
	@Test
	public void SaqueOK() {
		Account acc = new Account(123, "Teste", 120.0, 130.0);
		Assert.assertEquals(0.0, acc.Withdraw(120.0),0.0);
	}
	
	@Rule
	public ExpectedException thrown = ExpectedException.none();
	
	@Test
	public void SaqueMaiorQueLimite() {
		thrown.expect(WithdrawExecpetion.class);
		thrown.expectMessage("The amount exceeds withdraw limit");
		account.Withdraw(300.0);
	}
}
