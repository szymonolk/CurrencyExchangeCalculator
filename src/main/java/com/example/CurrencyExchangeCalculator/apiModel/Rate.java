package com.example.CurrencyExchangeCalculator.apiModel;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Rate {
        public String no;
        public String effectiveDate;
        public double mid;
}

