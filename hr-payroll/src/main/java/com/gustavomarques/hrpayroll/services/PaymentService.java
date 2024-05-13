package com.gustavomarques.hrpayroll.services;

import org.springframework.stereotype.Service;

import com.gustavomarques.hrpayroll.entities.Payment;

@Service
public class PaymentService {
	
	public Payment getPayment(Long workerId, Integer days) {
		return new Payment("Bob", 200.0, days);
	}

}
