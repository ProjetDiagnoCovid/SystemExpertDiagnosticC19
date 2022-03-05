package ma.fstm.ilisi2.ExpertSysCovid19.model.bo;

import java.time.LocalDate;

public class Admin extends Client {

	private int id;
	public Admin(int id, LocalDate date_naissance, String nom, String prenom, String username, String password) {
		super(id, date_naissance, nom, prenom, username, password);
	}

}
