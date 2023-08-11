package fr.eni.demoWeb.config;

import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.annotation.ApplicationScope;

import fr.eni.demoWeb.bo.Metier;
import fr.eni.demoWeb.service.MetierService;

@Configuration
public class DemoWebConfig {

	@Bean
	@ApplicationScope
	public List<Metier> metiers(MetierService service){
		return service.getListeMetiers();
	}

}
