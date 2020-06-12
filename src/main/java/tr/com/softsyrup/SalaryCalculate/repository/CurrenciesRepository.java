package tr.com.softsyrup.SalaryCalculate.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import tr.com.softsyrup.SalaryCalculate.entity.Currencies;

@Repository
public interface CurrenciesRepository extends MongoRepository<Currencies, String> {

}
