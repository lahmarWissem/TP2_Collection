
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class departement {

	private int idDep;
	private int Capacity;
	Set<employe> LEmployes;

	public departement(int idDep, int capacity) {
		super();
		this.idDep = idDep;
		Capacity = capacity;
		LEmployes = new HashSet<employe>();
	}

	public int getIdDep() {
		return idDep;
	}

	public void setIdDep(int idDep) {
		this.idDep = idDep;
	}

	public int getCapacity() {
		return Capacity;
	}

	public void setCapacity(int capacity) {
		Capacity = capacity;
	}

	public Set<employe> getLEmployes() {
		return LEmployes;
	}

	public void setLEmployes(Set<employe> lEmployes) {
		LEmployes = lEmployes;
	}

	public void ajoutEmploye(employe E) {
		if (E.getCin() > 0) {
			LEmployes.add(E);
			E.setNumDep(idDep);
		}
	}

	public void retirerEmploye(employe E) {
		LEmployes.remove(E);
	}

	public void afficheDep() {
		for (employe a : LEmployes) {
			System.out.println(a);
		}
	}
	
 
	public boolean existeE(int cin) {

		employe E = new employe(cin);
		if (LEmployes.contains(E)) {
			return true ;
		} else {
			return false;
		}

	}

	public employe getEmSalMax() {
		TreeSet<employe> t = new TreeSet<employe>(LEmployes);
		/*System.out.println(t);*/
		return t.last();

	}

	


}
