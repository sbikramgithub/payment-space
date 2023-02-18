package com.payment.services;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.payment.dao.PaymentDao;


@SpringBootTest
//@RunWith(SpringJUnit4ClassRunner.class)
public class PaymentServiceTest {
	
//	@Autowired
//	PaymentService paymentService;
//	
//	@Test
//	public void sampleTest() {
//		String res = paymentService.sample();
//		assertEquals("test1",res);
//		assertNotNull(res);
//	}
	
	@InjectMocks
	PaymentService paymentService;
	
	@Mock
	PaymentDao paymentDao;
	
	@Test
	public void sampleTest() {
		Mockito.when(paymentDao.getFromDao()).thenReturn("Hello Biktam");
		
		String res = paymentService.sample();
		Assertions.assertEquals(res, "Hello Biktam");
	}

}
