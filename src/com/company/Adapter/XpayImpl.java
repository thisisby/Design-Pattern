package com.company.Adapter;

public class XpayImpl implements Xpay{

	private String creditCardNo;
	private String customerName;
	private String cardExpYear;
	private String cardCVVNo;
	private Double amount;


	@Override
	public String getCreditCardNo() {
		return creditCardNo;
	}

	@Override
	public String getCustomerName() {
		return customerName;
	}

	@Override
	public String getCardExpireYear() {
		return cardExpYear;
	}

	@Override
	public String getCardCVVNo() {
		return cardCVVNo;
	}

	@Override
	public Double getAmount() {
		return amount;
	}
	@Override
	public void setCreditCardNo(String creditCardNo) {
		this.creditCardNo = creditCardNo;
	}
	@Override
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	@Override
	public void setCardExpireYear(String cardExpYear) {
		this.cardExpYear = cardExpYear;
	}
	@Override
	public void setCardCVVNo(String cardCVVNo) {
		this.cardCVVNo = cardCVVNo;
	}
	@Override
	public void setAmount(Double amount) {
		this.amount = amount;
	}
}
