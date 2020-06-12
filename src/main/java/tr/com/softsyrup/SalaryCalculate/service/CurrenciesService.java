package tr.com.softsyrup.SalaryCalculate.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tr.com.softsyrup.SalaryCalculate.entity.Currencies;
import tr.com.softsyrup.SalaryCalculate.repository.CurrenciesRepository;

@Service
public class CurrenciesService {

	@Autowired
	private CurrenciesRepository currenciesRepository;

	public void saveCurrencies(Currencies currencies) {
		currenciesRepository.save(currencies);
	}

	public List<Currencies> findAllCurrencies() {
		return currenciesRepository.findAll();
	}
}
