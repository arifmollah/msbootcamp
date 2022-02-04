package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

import com.example.services.CurrencyServiceFeignClient;

@SpringBootApplication
@EnableFeignClients(basePackageClasses = CurrencyServiceFeignClient.class)
public class ConvertCurrencyMs2Application {

	public static void main(String[] args) {
		SpringApplication.run(ConvertCurrencyMs2Application.class, args);
	}

}
