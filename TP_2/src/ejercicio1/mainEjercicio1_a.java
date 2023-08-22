package ejercicio1;
import java.util.ArrayList;
import java.util.Iterator;

public class mainEjercicio1_a {

	public static void main(String[] args) {
		ArrayList<Profesor> listaProfesores = new ArrayList<Profesor>();
		
		listaProfesores.add(new Profesor("Eduardo Galeno",48,12,"Titular Adjunto"));
		listaProfesores.add(new Profesor("Francisco Quevedo",54,25,"Jefe de Trabajos Prácticos"));
		listaProfesores.add(new Profesor("Daniel García Márquez",44,22,"Ayudante de Primera Categoría"));
		listaProfesores.add(new Profesor("Manuel Fontanarrosa",37,9,"Ayudante de Segunda Categoría"));
		listaProfesores.add(new Profesor("Ignacio Lumiére",38,15,"Titular Ordinario"));
				
		Iterator<Profesor> it = listaProfesores.iterator();
		
		while(it.hasNext()) {
			Profesor profAux = it.next();
			System.out.println(profAux.toString());
		}			

	}

}
