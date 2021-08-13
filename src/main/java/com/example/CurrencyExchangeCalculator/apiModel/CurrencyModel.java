package com.example.CurrencyExchangeCalculator.apiModel;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "Currency")
public class CurrencyModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @DateTimeFormat(pattern = "dd.MM.yyyy")
    private String localDate;
    private double pln;
    private String currency;
    private double Price;

    public CurrencyModel(String localDate, double pln, String currency, double price) {
        this.localDate = localDate;
        this.pln = pln;
        this.currency = currency;
        Price = price;
    }
}
