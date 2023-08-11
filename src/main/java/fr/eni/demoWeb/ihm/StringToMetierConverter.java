package fr.eni.demoWeb.ihm;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import fr.eni.demoWeb.bo.Metier;
import fr.eni.demoWeb.service.MetierServiceImpl;

@Component //Définir le converter en tant que bean Spring
public class StringToMetierConverter implements Converter<String, Metier>{ //Implementer Converter

	private MetierServiceImpl service;
	
	@Autowired
	public void setMetierService(MetierServiceImpl service) {
		this.service = service;
	}
	
	@Override
	public Metier convert(String id) {
		Integer theid = Integer.parseInt(id);
		
		return service.getMapMetiers().get(theid);
	}

}
