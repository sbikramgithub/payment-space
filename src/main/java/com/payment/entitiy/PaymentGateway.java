package com.payment.entitiy;

public class PaymentGateway {
	private String fromAcc;
	private String toAccount;
	private double debitAmount;
	private String status;
	
	
	public PaymentGateway() {
		super();
	}
	public PaymentGateway(String fromAcc, String toAccount, double debitAmount, String status) {
		super();
		this.fromAcc = fromAcc;
		this.toAccount = toAccount;
		this.debitAmount = debitAmount;
		this.status = status;
	}
	public String getFromAcc() {
		return fromAcc;
	}
	public void setFromAcc(String fromAcc) {
		this.fromAcc = fromAcc;
	}
	public String getToAccount() {
		return toAccount;
	}
	public void setToAccount(String toAccount) {
		this.toAccount = toAccount;
	}
	public double getDebitAmount() {
		return debitAmount;
	}
	public void setDebitAmount(double debitAmount) {
		this.debitAmount = debitAmount;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "PaymentGateway [fromAcc=" + fromAcc + ", toAccount=" + toAccount + ", debitAmount=" + debitAmount
				+ ", status=" + status + "]";
	}
	
	
}
