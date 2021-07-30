package com.example.CurrencyExchangeCalculator.conf;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class Conf {

    @Bean
    public RestTemplate restTemplateConf(){
        return new RestTemplate();
    }
}
