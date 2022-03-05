package ma.fstm.ilisi2.ExpertSysCovid19.model.bo;

import java.util.ArrayList;
import java.util.List;

public class Region {
	private int id;
	private String nom;
	private Etatpandemie Etat_pandemie;
	private List<Ville> les_Villes;
	
	public Region(String nom, Etatpandemie etat_pandemie) {
		
		
		this.nom = nom;
		Etat_pandemie = etat_pandemie;
		les_Villes = new ArrayList<Ville>();
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public List<Ville> getLes_Villes() {
		return les_Villes;
	}
	
	public Etatpandemie getEtat_pandemie() {
		return Etat_pandemie;
	}

	public void setEtat_pandemie(Etatpandemie etat_pandemie) {
		Etat_pandemie = etat_pandemie;
	}
	
	public String toString() {
		// TODO Auto-generated method stub
		String info = "Nom:"+nom+"\n a l'etat :"+
		Etat_pandemie.toString();
		return info;
	}




}
