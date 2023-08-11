package fr.eni.demoWeb.bo;

public class Metier {
	private Integer id;	
	private String libelle;
	
	public Metier() {
		// TODO Auto-generated constructor stub
	}

	public Metier(Integer id, String libelle) {
		super();
		this.id = id;
		this.libelle = libelle;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	@Override
	public String toString() {
		return "Metier [id=" + id + ", libelle=" + libelle + "]";
	}

}
