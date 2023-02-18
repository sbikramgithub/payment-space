package com.payment.entitiy;

public class PaymentInfo {
	private String accNo;
	private String toAccount;
	private double amount;
	private String status;
	
	public PaymentInfo() {
		super();
	}
	public PaymentInfo(String accNo, String toAccount, double amount, String status) {
		this.accNo = accNo;
		this.toAccount = toAccount;
		this.amount = amount;
		this.status = status;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getAccNo() {
		return accNo;
	}
	public void setAccNo(String accNo) {
		this.accNo = accNo;
	}
	public String getToAccount() {
		return toAccount;
	}
	public void setToAccount(String toAccount) {
		this.toAccount = toAccount;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	@Override
	public String toString() {
		return "PaymentInfo [accNo=" + accNo + ", toAccount=" + toAccount + ", amount=" + amount + ", status=" + status
				+ "]";
	}
	
	
}
