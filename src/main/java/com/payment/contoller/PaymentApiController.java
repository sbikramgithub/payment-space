package com.payment.contoller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.payment.entitiy.PaymentGateway;
import com.payment.entitiy.PaymentInfo;
import com.payment.services.PaymentService;

@RestController
@RequestMapping("/api/payment")
public class PaymentApiController {
	
	@Autowired
	private PaymentService services;
	
	@GetMapping(value = "/{toAccount}/{amount}/getPaymentInfo")
	public PaymentGateway getPaymentInfo(@PathVariable("toAccount") String toAccount,@PathVariable("amount") double amount) {
		
		return services.getPaymentService(toAccount, amount);
	}
}
