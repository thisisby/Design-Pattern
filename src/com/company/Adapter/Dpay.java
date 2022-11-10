package com.company.Adapter;

public interface Dpay {

	String getCustCardNo();
	String getCardOwnerName();
	String getCardExpYear();
	Integer getCVVNo();
	Double getTotal();

	public void setCustCardNo(String custCardNo);
	public void setCardOwnerName(String cardOwnerName);
	public void setCardExpYear(String cardExpMonthDate);
	public void setCVVNo(Integer cVVNo);
	public void setTotal(Double totalAmount);
}
