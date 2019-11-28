package com.sample.service.impl;

import org.springframework.stereotype.Service;

import com.sample.service.SimpleCalculatorOperationsService;

@Service
public class SimpleCalculatorOperationsServiceImpl implements SimpleCalculatorOperationsService {

	public Double add(Double id1, Double id2) {
		Double result = id1 + id2;
		return result;
	}

	public Double sub(Double id1, Double id2) {
		Double result = id1 - id2;
		return result;
	}

	public Double multiply(Double id1, Double id2) {
		Double result = id1 * id2;
		return result;
	}

	public Double divide(Double id1, Double id2) {
		Double result = id1/id2;
		return result;
	}

}
