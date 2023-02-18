package com.payment.services;

import java.net.URI;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriBuilder;
import org.springframework.web.util.UriComponentsBuilder;

import com.payment.dao.PaymentDao;
import com.payment.entitiy.PaymentGateway;
import com.payment.entitiy.PaymentInfo;
import com.payment.repository.StudentRepository;

@Service
public class PaymentService {
	@Autowired
	private RestTemplate restTemplate;
	
	
	@Autowired
	PaymentDao paymentDao;
	
	public PaymentGateway getPaymentService(String toAccount,double amount){
		Map<String, Object> pathVariables=new HashMap<String, Object>();
		UriBuilder uriBuilder=UriComponentsBuilder.fromUriString("http://localhost:8081/payment_gateway/{toAccount}/{amount}/getPaymentStatemnt");
		pathVariables.put("toAccount", toAccount);
		pathVariables.put("amount", amount);
		//PaymentGateway getGateway=restTemplate.getForObject("http://localhost:8081/api/payment_gateway/getPaymentStatemnt", PaymentGateway.class);
		//restTemplate.exchange("", HttpMethod.GET,null,PaymentGateway.class,null);
		//PaymentGateway getGateway= entity.getBody();
		URI uri=uriBuilder.build(pathVariables);
		return restTemplate.getForEntity(uri, PaymentGateway.class).getBody();
		//return new PaymentInfo(getGateway.getFromAcc(), getGateway.getToAccount(), getGateway.getDebitAmount(), getGateway.getStatus());
	}
	
	public String sample() {
		//throw new RuntimeException();
		//return "test";
		return paymentDao.getFromDao();
	}
	
	
}
