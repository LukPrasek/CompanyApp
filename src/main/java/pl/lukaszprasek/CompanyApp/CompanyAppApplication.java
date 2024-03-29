package pl.lukaszprasek.CompanyApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
@ComponentScan(basePackages = "pl.lukaszprasek.CompanyApp")
public class CompanyAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(CompanyAppApplication.class, args);
	}

}
