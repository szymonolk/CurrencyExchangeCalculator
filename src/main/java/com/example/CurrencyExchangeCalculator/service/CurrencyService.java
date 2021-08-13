package com.example.CurrencyExchangeCalculator.service;



import com.example.CurrencyExchangeCalculator.apiModel.CurrencyModel;
import com.example.CurrencyExchangeCalculator.apiModel.Root;
import com.example.CurrencyExchangeCalculator.conf.Conf;
import com.example.CurrencyExchangeCalculator.repository.CurrencyModelRepository;
import org.decimal4j.util.DoubleRounder;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;


@Service
public class CurrencyService {
    private final Conf conf;
    private final CurrencyModelRepository currencyModelRepository;

    public CurrencyService(Conf conf, CurrencyModelRepository currencyModelRepository) {
        this.conf = conf;
        this.currencyModelRepository = currencyModelRepository;
    }

    public Double CalculateFromPLNToOtherCurrency(Double pln, String currency){
        final String url = "http://api.nbp.pl/api/exchangerates/rates/a/"+currency+"?format=json";
        Root root = conf.restTemplateConf().getForObject(url, Root.class);
        double currencyPrice = root.rates.get(0).getMid();
        currencyModelRepository.save(new CurrencyModel(dateFormatter(),
                DoubleRounder.round(pln/currencyPrice, 2)));
        return DoubleRounder.round(pln/currencyPrice, 2);
    }

    public String dateFormatter(){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm");
        String date = simpleDateFormat.format(new Date());
        return date;
    }
}
