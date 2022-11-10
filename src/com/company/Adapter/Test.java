package com.company.Adapter;

public class Test {
	public static void main(String[] args) {

		Xpay xpay = new XpayImpl();
		xpay.setCustomerName("Baistan");
		xpay.setCreditCardNo("11090221");
		xpay.setCardExpireYear("In 2 minutes");
		xpay.setCardCVVNo("1232131");
		xpay.setAmount(12312.12);

		Dpay dpay = new XpayToDpayAdapter(xpay);

		testDpay(dpay);
	}

	private static void testDpay(Dpay dpay) {
		System.out.println(dpay.getCardOwnerName());
		System.out.println(dpay.getCustCardNo());
		System.out.println(dpay.getCardExpYear());
		System.out.println(dpay.getCVVNo());
		System.out.println(dpay.getTotal());
	}
}
