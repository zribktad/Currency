package com.example.Task;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.List;

@Component
public class CurrencyLoader {
    private final CurrencyService currencyService;
    private final CurrencyRepository currencyRepository;

    public CurrencyLoader(CurrencyService currencyService, CurrencyRepository currencyRepository) {
        this.currencyService = currencyService;
        this.currencyRepository = currencyRepository;
    }

    @PostConstruct
    public void loadCurrenciesIntoDatabase() {
        List<Currency> currencies = currencyService.retrieveCurrenciesFromApi();
        currencyRepository.saveAll(currencies);
    }
}

