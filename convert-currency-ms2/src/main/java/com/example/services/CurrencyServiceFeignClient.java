package com.example.services;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(value = "currency-conversion-ms1",fallback = CurrencyFallback.class)
public interface CurrencyServiceFeignClient extends CurrencyService {

}
