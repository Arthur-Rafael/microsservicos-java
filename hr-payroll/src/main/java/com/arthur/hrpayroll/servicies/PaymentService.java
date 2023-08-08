package com.arthur.hrpayroll.servicies;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.arthur.hrpayroll.entities.Payment;
import com.arthur.hrpayroll.entities.Worker;
import com.arthur.hrpayroll.feignclients.WorkerFeignClient;

@Service
public class PaymentService {
	
	@Autowired
	private WorkerFeignClient workerFeignClient;
	
	public Payment getPayment(long workerId, int days) {
		
		Worker worker = workerFeignClient.findById(workerId).getBody();
		return new Payment(worker.getName(), worker.getDailyIncome(), days);
	}
}
