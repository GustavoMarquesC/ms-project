package com.gustavomarques.hrpayroll.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gustavomarques.hrpayroll.entities.Payment;
import com.gustavomarques.hrpayroll.entities.Worker;
import com.gustavomarques.hrpayroll.feignclients.WorkerFeignClient;


@Service
public class PaymentService {

	@Autowired
	private WorkerFeignClient workerFeignClient;
	
	public Payment getPayment(Long workerId, Integer days) {
		Worker worker = workerFeignClient.findById(workerId).getBody();
		return new Payment(worker.getName(), worker.getDailyIncome(), days);
 	}

}
   