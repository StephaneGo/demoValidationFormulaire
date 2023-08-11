package fr.eni.demoWeb.bo;

import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

public class Personne {
	@NotBlank(message = "Le prenom est obligatoire")
	private String prenom;
	
	@Min(0)
	private int age;
	
	@Pattern(regexp = "^[0-9]{5}")
	private String codePostal;
	
	private Metier metier;
	
	@Email
	@NotBlank
	private String email;
	
	public Personne() {
	}
	
	public Personne(String nom,  int age) {
		super();
		this.prenom = nom;
		this.age = age;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String nom) {
		this.prenom = nom;
	}


	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Personne [prenom=" + prenom + ", age=" + age + "]";
	}

	public Metier getMetier() {
		return metier;
	}

	public void setMetier(Metier metier) {
		this.metier = metier;
	}

	public String getCodePostal() {
		return codePostal;
	}

	public void setCodePostal(String codePostal) {
		this.codePostal = codePostal;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
