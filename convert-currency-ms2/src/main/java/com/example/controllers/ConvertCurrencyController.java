package com.example.controllers;

import java.util.Optional;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.server.ResponseStatusException;

import com.example.services.CurrencyServiceFeignClient;



@RequestMapping("/convertCurrency")
public class ConvertCurrencyController {
	
	@Autowired
	private CurrencyServiceFeignClient currencyServiceFeignClient;
	
	@GetMapping("/getConvertedAmount/{country_code}/{amount}")
	public ResponseEntity<Double> getConversionFactor(@PathParam("country_code") String countryCode,@PathParam("amount") Double amount){
		
		Double conversionFcator = currencyServiceFeignClient.getConvertedCurrency();
		if (conversionFcator != null ) {
			Double conversionAmount = conversionFcator * amount;
			return ResponseEntity.ok(conversionAmount);
		}
		throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Courrency Conversion factory is not found");
		
	}

}
