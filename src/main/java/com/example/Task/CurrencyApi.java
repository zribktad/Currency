package com.example.Task;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/currencies")
public class CurrencyApi {

    private final CurrencyService currencyService;
    private final CurrencyRepository currencyRepository;

    public CurrencyApi(CurrencyService currencyService, CurrencyRepository currencyRepository) {
        this.currencyService = currencyService;
        this.currencyRepository = currencyRepository;
    }

    @GetMapping
    public List<Currency> getCurrencies(@RequestParam(value = "usedb", defaultValue = "true") boolean useDb) {
        List<Currency> currencies;
        if (useDb) {
            currencies = currencyRepository.findAll();

        }else{
            currencies = currencyService.retrieveCurrenciesFromApi();
            currencyRepository.saveAll(currencies);
        }
            return currencies;
    }

}
