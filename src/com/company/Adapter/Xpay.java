package com.company.Adapter;

public interface Xpay {

	String getCreditCardNo();
	String getCustomerName();
	String getCardExpireYear();
	String getCardCVVNo();
	Double getAmount();

	void setCreditCardNo(String creditCardNo);
	void setCustomerName(String customerName);
	void setCardExpireYear(String cardExpireYear);
	void setCardCVVNo(String cardCVVNo);
	void setAmount(Double amount);

}
