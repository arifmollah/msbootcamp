package com.example.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class CurrencyFallback implements CurrencyServiceFeignClient {

	@Override
	public Double getConvertedCurrency() {
		return 0.00;
	}
}