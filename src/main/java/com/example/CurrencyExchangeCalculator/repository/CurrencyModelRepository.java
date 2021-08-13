package com.example.CurrencyExchangeCalculator.repository;

import com.example.CurrencyExchangeCalculator.apiModel.CurrencyModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CurrencyModelRepository extends JpaRepository<CurrencyModel, Integer> {
}
