package Model.Execptions;

public class WithdrawExecpetion extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public WithdrawExecpetion(String msg) {
		super(msg);
	}
}
