package com.arthur.hrpayroll.servicies;

import org.springframework.stereotype.Service;

import com.arthur.hrpayroll.entities.Payment;

@Service
public class PayrollService {

	public Payment getPayment(long workerId, int days) {
		return new Payment("Bob", 200.0, days);
	}
}
