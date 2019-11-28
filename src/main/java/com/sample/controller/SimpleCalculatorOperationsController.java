package com.sample.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.sample.service.SimpleCalculatorOperationsService;

@RestController("SimpleCalcualtorOperations")
@RequestMapping("/simpleCalcualtorOperations")
public class SimpleCalculatorOperationsController {

	@Autowired
	SimpleCalculatorOperationsService simpleCalculatorOperationsService;

	@CrossOrigin
	@GetMapping("/add/{id1}/{id2}")
	@ResponseBody
	  public Double getAdditionResult(@PathVariable Double id1, @PathVariable Double id2) {
	    return simpleCalculatorOperationsService.add(id1,id2);
	  } 

	@CrossOrigin
	@GetMapping("/sub/{id1}/{id2}")
	@ResponseBody
	  public Double getSubtractionResult(@PathVariable Double id1, @PathVariable Double id2) {
	    return simpleCalculatorOperationsService.sub(id1,id2);
	  } 

	@CrossOrigin
	@GetMapping("/multiply/{id1}/{id2}")
	@ResponseBody
	  public Double getMultiplicationResult(@PathVariable Double id1, @PathVariable Double id2) {
	    return simpleCalculatorOperationsService.multiply(id1,id2);
	  }

	@CrossOrigin
	@GetMapping("/divide/{id1}/{id2}")
	@ResponseBody
	  public Double getDivisionResult(@PathVariable Double id1, @PathVariable Double id2) {
	    return simpleCalculatorOperationsService.divide(id1,id2);
	  }
}
