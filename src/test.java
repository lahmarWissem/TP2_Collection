
public class test {

	public static void main(String[] args) {
		departement d=new departement(1,2);
		employe E1= new employe (1, "wissem", 100,1);
		employe E2= new employe (2, "houssem", 200,1);
		employe E3= new employe (3, "foulen", 300,1);
		employe E4= new employe (4, "amin", 400,1);
	
		d.ajoutEmploye(E1);
		d.ajoutEmploye(E2);
		d.ajoutEmploye(E3);
		d.ajoutEmploye(E4);
		d.afficheDep();
		System.out.println(d.existeE(1));
		System.out.println(d.existeE(2));
		System.out.println(d.existeE(3));
		System.out.println(d.existeE(4));
		System.out.println(d.getEmSalMax());
		
		
		
		

	}

}
