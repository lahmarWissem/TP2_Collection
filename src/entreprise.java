
import java.util.HashMap;
public class entreprise {
	private String nomEntreprise;
	HashMap<Integer,departement> Liste_Deps;

	public entreprise(String nomEntreprise
			) {
		super();
		this.nomEntreprise = nomEntreprise;
		Liste_Deps = new  HashMap<Integer, departement>();
	}

	public String getNomEntreprise() {
		return nomEntreprise;
	}

	public void setNomEntreprise(String nomEntreprise) {
		this.nomEntreprise = nomEntreprise;
	}

	public HashMap<Integer, departement> getListe_Deps() {
		return Liste_Deps;
	}

	public void setListe_Deps(HashMap<Integer, departement> liste_Deps) {
		Liste_Deps = liste_Deps;
	}
	
	public void addDep(departement d) {
		Liste_Deps.put(d.getIdDep(), d);
	}

	public void retirerDep(departement d) {
		Liste_Deps.remove(1, d);
	}

	public void afficheE() {
		for (Integer i : Liste_Deps.keySet()) {
			  System.out.println("key: " + i + " value: " + Liste_Deps.get(i));
			}
	}

	public void UpdateDep(employe e, int idDep) {
    
		
	}

	public boolean existeD(departement d) {
		return true;
	}

	public void DepMinCapacity() {

	}
}
