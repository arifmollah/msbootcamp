package com.example.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.entity.CurrencyEntity;

public interface CurrencyConversionRepository extends CrudRepository<CurrencyEntity,String>{

}
