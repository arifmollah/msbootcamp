package com.examle.controllers;

import java.util.Optional;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.CurrencyEntity;
import com.example.repository.CurrencyConversionRepository;
import com.example.services.CurrencyConevrsionService;
import org.springframework.web.server.ResponseStatusException;

@RestController("/currencyConversion")
public class CurrencyController {
	
	@Autowired
	private CurrencyConevrsionService CurrencyConevrsionService;
	
	@Autowired
	private CurrencyConversionRepository CurrencyConversionRepository;
	
	@GetMapping("/getConversionFactor/{country_code}")	
	public ResponseEntity<Double> getConversionFactor(@PathParam("country_code") String countryCode ){
		
		Optional<CurrencyEntity> currencyEntity = CurrencyConevrsionService.getCurrencyConversion(countryCode);
		
		if (currencyEntity.isPresent()) {
			return ResponseEntity.ok(currencyEntity.get().getConversinFcator());
		}
		throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Courrency Conversion factory is not found");
		
	}
	
	@PostMapping("/addConversionFactor")
	public ResponseEntity<CurrencyEntity> addConversionFactor(@RequestBody CurrencyEntity currency){
		CurrencyConversionRepository.save(currency);
		return new ResponseEntity(HttpStatus.CREATED);
	}
	
	@PutMapping("/updateConversionFactor")
	public ResponseEntity<CurrencyEntity> updateConversionFactor(@RequestBody CurrencyEntity currency){
		CurrencyConversionRepository.save(currency);
		return new ResponseEntity(HttpStatus.ACCEPTED);
	}

}
