package tr.com.softsyrup.SalaryCalculate.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import tr.com.softsyrup.SalaryCalculate.entity.Currencies;
import tr.com.softsyrup.SalaryCalculate.service.CurrenciesService;

@RestController
@RequestMapping(value = "/api/currencies")
public class CurrenciesController {

	@Autowired
	private CurrenciesService currenciesService;

	@RequestMapping(value = "/addCurrency", method = RequestMethod.POST)
	public ResponseEntity<String> addCurrency(@RequestBody Currencies currencies) {
		currenciesService.saveCurrencies(currencies);
		return new ResponseEntity<>("Başarılı şekilde eklendi", HttpStatus.OK);
	}

	@RequestMapping(value = "/getCurrencies", method = RequestMethod.GET)
	public ResponseEntity<List<Currencies>> getCurrencies() {
		List<Currencies> currencies = currenciesService.findAllCurrencies();
		return new ResponseEntity<>(currencies, HttpStatus.OK);
	}

}
