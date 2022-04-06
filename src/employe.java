import java.util.Objects;


public  class employe implements Comparable<employe> {
	private int cin;
	private String nom;
	private double salaire;
	private int numDep;
	public employe(int cin, String nom, double salaire, int numDep) {
		super();
		this.cin = cin;
		this.nom = nom;
		this.salaire = salaire;
		this.numDep = numDep;
		
		
	}
	public employe(int cin) {
		this.cin = cin;
	}
	public int getCin() {
		return cin;
	}
	public void setCin(int cin) {
		this.cin = cin;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public double getSalaire() {
		return salaire;
	}
	public void setSalaire(double salaire) {
		this.salaire = salaire;
	}
	public int getNumDep() {
		return numDep;
	}
	public void setNumDep(int numDep) {
		this.numDep = numDep;
	}
	@Override
	public String toString() {
		return "employe [cin=" + cin + ", nom=" + nom + ", salaire=" + salaire
				+ ", numDep=" + numDep + "]";
	}
	
	@Override
	public int hashCode(){
		return Objects.hash(cin);
		
	}
	
	 @Override
	 public boolean equals(Object o){
		 employe E=(employe)o; 
		 if (this.getCin()==E.getCin()){
			 return true;
		 }
	 return false;
		
	}
	 @Override
	public int compareTo(employe e) {
		if (this.salaire>e.salaire)
			return 1;
		if (this.salaire<e.salaire)
	       return -1;
		else 
		   return 0;
	}
	
	
	


	
	
	

}
