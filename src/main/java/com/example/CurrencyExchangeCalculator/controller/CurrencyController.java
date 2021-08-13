package com.example.CurrencyExchangeCalculator.controller;


import com.example.CurrencyExchangeCalculator.service.CurrencyService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class CurrencyController {

    private final CurrencyService currencyService;

    public CurrencyController(CurrencyService currencyService) {
        this.currencyService = currencyService;
    }

    @GetMapping("/{pln}/to/{curr}")
    public ResponseEntity calculateCurrencyFromPlnToOtherCurrency(@PathVariable double pln, @PathVariable String curr){
        return ResponseEntity.ok(currencyService.CalculateFromPLNToOtherCurrency(pln, curr));
    }
}

