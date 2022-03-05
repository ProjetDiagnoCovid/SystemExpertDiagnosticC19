package ma.fstm.ilisi2.ExpertSysCovid19.model.bo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Diagnostic {
	private int id;
	private Client client;
	private ArrayList<Symptome> symptomes;
	private Maladie maladieDiag;
	private Collection<Maladie> maladiesSympt;
	
	
	public Maladie getMaladieDiag() {
		return maladieDiag;
	}
	public void setMaladieDiag(Maladie maladieDiag) {
		this.maladieDiag = maladieDiag;
	}
	
	public Collection<Maladie> getMaladiesSympt() {
		return maladiesSympt;
	}
	public void setMaladiesSympt(Collection<Maladie> maladiesSympt) {
		this.maladiesSympt = maladiesSympt;
	}

	private double degreCont_C19;
	private boolean possi_presence;
	private boolean contact_Covid19;
	
	public boolean isContact_Covid19() {
		return contact_Covid19;
	}
	public void setContact_Covid19(boolean contact_Covid19) {
		this.contact_Covid19 = contact_Covid19;
	}
	public void envoyerInfo()
	{
		System.out.println("envoie des infos ... ");
	}
	public boolean isPossi_presence() {
		return possi_presence;
	}
	public void setPossi_presence(boolean possi_presence) {
		this.possi_presence = possi_presence;
	}
	
	public double getDegreCont_C19() {
		return degreCont_C19;
	}

	public void setDegreCont_C19(double degreCont_C19) {
		this.degreCont_C19 = degreCont_C19;
	}

	@Override
	public String toString() {
		return "Diagnostic [id=" + id + ", client=" + client.getNom() + ", symptomes=" + symptomes.toString() + ", degreCont_C19="
				+ degreCont_C19 + "]";
	}
	public void ajouterMaladieSympt(Maladie m) {
		this.maladiesSympt.add(m);
	}

	public Diagnostic(Client client) {
		this.client = client;
		symptomes = new ArrayList<Symptome>();
		maladiesSympt = new ArrayList<Maladie>();
	}
	
	public void ajouter_symptome(Symptome s) {
		this.symptomes.add(s);
	}
	
	public boolean trouve(Symptome s)
	{
		Iterator<Symptome> it = symptomes.iterator();
		while(it.hasNext())
			if(((Symptome) it.next()).getDescription().equals(s.getDescription()))
				return true;
		return false;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}


	public Client getClient() {
		return client;
	}


	public void setClient(Client client) {
		this.client = client;
	}


	public ArrayList<Symptome> getSymptomes() {
		return symptomes;
	}


	public void setSymptomes(ArrayList<Symptome> symptomes) {
		this.symptomes = symptomes;
	}


	
	
}
