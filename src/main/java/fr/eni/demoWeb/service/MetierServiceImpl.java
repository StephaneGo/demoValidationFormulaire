package fr.eni.demoWeb.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import fr.eni.demoWeb.bo.Metier;

@Service
public class MetierServiceImpl implements MetierService{

	private List<Metier> listeMetiers;
	private Map<Integer, Metier> mapMetiers;
	
	public MetierServiceImpl() {
		listeMetiers = new ArrayList<>();
		listeMetiers.add( new Metier(1, "Estheticien.ne"));
		listeMetiers.add( new Metier(2, "Bucheron.ne"));
		listeMetiers.add(new Metier(3, "Vigneron.ne"));
		
		mapMetiers = new HashMap<Integer, Metier>();
		listeMetiers.forEach(m -> mapMetiers.put(m.getId(), m));
		
	}
	
	public List<Metier> getListeMetiers(){
		return listeMetiers;		
	}
	
	public Map<Integer, Metier> getMapMetiers(){
		return mapMetiers;
	}


}
