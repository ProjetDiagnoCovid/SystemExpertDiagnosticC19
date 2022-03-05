package ma.fstm.ilisi2.ExpertSysCovid19.model.bo;

public abstract class Mesure {
	private int id;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public abstract int getValeur();

}
