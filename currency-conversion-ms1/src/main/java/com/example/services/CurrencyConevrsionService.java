package com.example.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.entity.CurrencyEntity;
import com.example.repository.CurrencyConversionRepository;

@Service
public class CurrencyConevrsionService {
	
	@Autowired	
	private CurrencyConversionRepository currencyConversionRepository;
	
	public Optional<CurrencyEntity> getCurrencyConversion(String countryCode) {
		
		Optional<CurrencyEntity> conversionEntity = currencyConversionRepository.findById(countryCode);
		return conversionEntity;
	
	}

}
