package com.payment;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class PaymentapiApplication {
	
	/*
	 * @Override public void
	 * configureMessageConverters(List<HttpMessageConverter<?>> converters) {
	 * 
	 * }
	 */
	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}
	public static void main(String[] args) {
		SpringApplication.run(PaymentapiApplication.class, args);
	}

}
