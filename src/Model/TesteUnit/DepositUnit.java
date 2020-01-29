package Model.TesteUnit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import Model.Entities.Account;

public class DepositUnit {

	Account account = new Account(100, "teste", 100.0, 100.0);
	Account Dep = new Account(00, "teste", 0.0, 0.0);

	// @Test(expected = SaldoInsuficienteException.class)

	@Test(expected = RuntimeException.class)
	public void TesteDepExecption() {
		try {
			account.Deposit(0.0);
			fail();
		} catch (RuntimeException e) {
			assertEquals("Dep�sito n�o pode ser nullu", e.getMessage());
		}
	}

	@Rule
	public ExpectedException thrown = ExpectedException.none();
	
	@Test
	public void DepositoComExcecao() {
		thrown.expect(RuntimeException.class);
		thrown.expectMessage("Dep�sito n�o pode ser nullu");
		account.Deposit(0.0);
	}
	
	@Test
	public void TesteDeposito() {
		Assert.assertEquals(10.0, Dep.Deposit(10.0), 0.0001);
	}
}
