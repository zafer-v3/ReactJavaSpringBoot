package tr.com.softsyrup.SalaryCalculate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EntityScan("tr.com.softsyrup.SalaryCalculate.entity")
@ComponentScan(basePackages = { "tr.com.softsyrup.SalaryCalculate.*" })
@EnableMongoRepositories("tr.com.softsyrup.SalaryCalculate.repository")
public class SalaryCalculateApplication extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(SalaryCalculateApplication.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(SalaryCalculateApplication.class, args);
	}

}
