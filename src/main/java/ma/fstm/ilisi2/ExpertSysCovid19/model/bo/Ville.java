package ma.fstm.ilisi2.ExpertSysCovid19.model.bo;

public class Ville {
	private int id;
    private String nom;
    private Region region;
    
	public Ville(String nom,Region r) {
		this.region =r;
		this.nom = nom;
	}
	public int getId() {
		return id;
	}
	public Region getRegion() {
		return region;
	}
	public void setRegion(Region region) {
		this.region = region;
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
	
	public String toString() {
		
		String r = "Ville: "+nom;
		return r;
	}
   
    
  
}
