package ejercicio1;
import java.util.Iterator;
import java.util.TreeSet;

public class mainEjercicio1_b {
	
	public static void main(String[] args) {
		
		TreeSet<Profesor> listaProfesores = new TreeSet<Profesor>();
		
		Profesor p1 = new Profesor("Alex",40,16,"Profesor de Matematicas");
		Profesor p2 = new Profesor("Pamela",38,15,"Profesora de Historia");
		Profesor p3 = new Profesor("Lilian",39,15,"Profesora de Biologia");
		Profesor p4 = new Profesor("Roxana",42,18,"Directora de la institucion");
		Profesor p5 = new Profesor("Miguel",27,9,"Asistente de la institucion");
		
		listaProfesores.add(p1);
		listaProfesores.add(p2);
		listaProfesores.add(p3);
		listaProfesores.add(p4);
		listaProfesores.add(p5);
		
		Iterator<Profesor> itP = listaProfesores.iterator();
		while(itP.hasNext()) {
			Profesor Prof = itP.next();
			itP.remove();
			System.out.println(Prof.toString());
		}
		
		
	}
}
