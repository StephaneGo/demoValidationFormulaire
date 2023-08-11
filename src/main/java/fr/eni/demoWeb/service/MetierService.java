package fr.eni.demoWeb.service;

import java.util.List;
import java.util.Map;

import fr.eni.demoWeb.bo.Metier;

public interface MetierService {

	public List<Metier> getListeMetiers();
	
	public Map<Integer, Metier> getMapMetiers();
	
}
