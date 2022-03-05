package ma.fstm.ilisi2.ExpertSysCovid19.model.bo;

public class Symptome{
	private int id;
	private String description;
	private Mesure mesure;
	
	
	public Mesure getMesure() {
		return mesure;
	}
	public void setMesure(Mesure mesure) {
		this.mesure = mesure;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	public Symptome(String des) {
		this.description=des;
	}

	public Symptome() {
		
	}
	
	
	
}
