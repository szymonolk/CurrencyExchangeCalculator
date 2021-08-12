package com.example.CurrencyExchangeCalculator.service;



import com.example.CurrencyExchangeCalculator.apiModel.CurrencyModel;
import com.example.CurrencyExchangeCalculator.apiModel.Root;
import com.example.CurrencyExchangeCalculator.conf.Conf;
import org.decimal4j.util.DoubleRounder;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


@Service
public class CurrencyService {
    private final Conf conf;

    public CurrencyService(Conf conf) {
        this.conf = conf;
    }

    public Double CalculateFromPLNToOtherCurrency(Double pln, String currency){
        final String url = "http://api.nbp.pl/api/exchangerates/rates/a/"+currency+"?format=json";
        Root root = conf.restTemplateConf().getForObject(url, Root.class);
        double currencyPrice = root.rates.get(0).getMid();
        return DoubleRounder.round(pln/currencyPrice, 2);
    }
}
