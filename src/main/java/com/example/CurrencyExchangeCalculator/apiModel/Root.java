package com.example.CurrencyExchangeCalculator.apiModel;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Root {
    public String table;
    public String currency;
    public String code;
    public List<Rate> rates;
}
