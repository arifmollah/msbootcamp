package com.example.services;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

public interface CurrencyService {
	
	@RequestMapping(value = "/currencyConversion/getConversionFactor/{country_code}", method = RequestMethod.GET, produces = "application/json")
	Double getConvertedCurrency();

}
