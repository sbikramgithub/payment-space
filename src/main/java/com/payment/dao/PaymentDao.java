package com.payment.dao;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Component
public class PaymentDao {

	public String getFromDao() {
		System.out.println("called dao");
		return "received fom dao";
	}
}
