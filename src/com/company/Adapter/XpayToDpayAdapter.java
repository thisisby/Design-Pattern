package com.company.Adapter;

public class XpayToDpayAdapter implements Dpay {

	private String custCardNo;
	private String cardOwnerName;
	private String cardExpMonthDate;
	private Integer cVVNo;
	private Double totalAmount;

	private final Xpay xpay;

	public XpayToDpayAdapter(Xpay xpay) {
		this.xpay = xpay;
		setProp();
	}

	private void setProp(){
		setCardOwnerName(this.xpay.getCustomerName());
		setCardExpYear(this.xpay.getCardExpireYear());
		setCustCardNo(this.xpay.getCreditCardNo());
		setCVVNo(Integer.valueOf(this.xpay.getCardCVVNo()));
		setTotal(this.xpay.getAmount());
	}

	@Override
	public String getCustCardNo() {
		return custCardNo;
	}
	@Override
	public String getCardOwnerName() {
		return cardOwnerName;
	}
	@Override
	public String getCardExpYear() {
		return cardExpMonthDate;
	}
	@Override
	public Integer getCVVNo() {
		return cVVNo;
	}
	@Override
	public Double getTotal() {
		return totalAmount;
	}
	@Override
	public void setCustCardNo(String custCardNo) {
		this.custCardNo = custCardNo;
	}
	@Override
	public void setCardOwnerName(String cardOwnerName) {
		this.cardOwnerName = cardOwnerName;
	}
	@Override
	public void setCardExpYear(String cardExpMonthDate) {
		this.cardExpMonthDate = cardExpMonthDate;
	}
	@Override
	public void setCVVNo(Integer cVVNo) {
		this.cVVNo = cVVNo;
	}
	@Override
	public void setTotal(Double totalAmount) {
		this.totalAmount = totalAmount;
	}
}
