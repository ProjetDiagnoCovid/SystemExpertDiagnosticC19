package ma.fstm.ilisi2.ExpertSysCovid19.model.bo;
import java.time.LocalDate;
import java.time.Year;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;

public class Client {
	private int id;
	private LocalDate date_naissance;
	private String nom;
	private String prenom;
	private String username;
	private String password;
	private long age;
	private Ville ville;
	private ArrayList<Historique_fiche> historiques_fiche;
	private ArrayList<Diagnostic> diagnostics;
	
	
	
	public Ville getVille() {
		return ville;
	}
	public void setVille(Ville ville) {
		this.ville = ville;
	}
	
	
	public void ajouter_diagnostic(Diagnostic d)
	{
		this.diagnostics.add(d);
	}
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public LocalDate getDate_naissance() {
		return date_naissance;
	}

	public void setDate_naissance(LocalDate date_naissance) {
		this.date_naissance = date_naissance;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public ArrayList<Historique_fiche> getHistoriques_fiche() {
		return historiques_fiche;
	}

	public void setHistoriques_fiche(ArrayList<Historique_fiche> historiques_fiche) {
		this.historiques_fiche = historiques_fiche;
	}

	public ArrayList<Diagnostic> getDiagnostics() {
		return diagnostics;
	}

	public void setDiagnostics(ArrayList<Diagnostic> diagnostics) {
		this.diagnostics = diagnostics;
	}

	public void setAge(long age) {
		this.age = age;
	}

	public Client() {
		historiques_fiche = new ArrayList<Historique_fiche>();
		diagnostics = new ArrayList<Diagnostic>();
	}

	public long getAge() {
		return age;
	}

	public Client(int id, LocalDate date_naissance, String nom, String prenom, String username, String password) {
		this.id = id;
		this.date_naissance = date_naissance;
		this.nom = nom;
		this.prenom = prenom;
		this.username = username;
		this.password = password;
		this.age = ChronoUnit.YEARS.between(date_naissance,LocalDate.now());
	}

	@Override
	public String toString() {
		return "Client [id=" + id + ", date_naissance=" + date_naissance + ", nom=" + nom + ", prenom=" + prenom
				+ ", username=" + username + ", password=" + password + ", age=" + age +"]";
	}
	public void envoyer() {
		System.out.println("la fonction envoyer");
	}
}
