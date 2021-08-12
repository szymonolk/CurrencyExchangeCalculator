package com.example.CurrencyExchangeCalculator.apiModel;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CurrencyModel {

    private Integer id;
    @DateTimeFormat(pattern = "dd.MM.yyyy")
    private String localDate;
    private double Price;
}
