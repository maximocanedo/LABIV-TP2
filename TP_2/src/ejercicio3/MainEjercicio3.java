package ejercicio3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class MainEjercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Estructura> listaConstrucciones = new ArrayList<Estructura>();
		Scanner entrada = new Scanner(System.in);
		String nombrePolideportivo;
		double largo,ancho;
		int cantidadOficinas;
		
		for(int i=0; i < 5; i++) {
			boolean REPETIR=true;
			if(i <= 2) {
				System.out.println("CARGA DE DATOS DE UN POLIDEPORTIVO\n");
				System.out.print("Ingrese nombre del Poliderportivo: ");
				nombrePolideportivo=entrada.nextLine();
				
				
				do {
					System.out.print("Ingrese el ancho del polideportivo (metros): ");
					ancho=entrada.nextDouble();
					if(ancho <= 0) {
						System.out.println("El valor ingresado no es válido. Debe ingresar una medida correcta.");						
					}else {
						REPETIR=false;
					}					
				}while(REPETIR);
				
				REPETIR=true;
				do {
					System.out.print("Ingrese el largo del polideportivo (metros): ");
					largo=entrada.nextDouble();
					if(largo <= 0) {
						System.out.println("El valor ingresado no es válido. Debe ingresar una medida correcta.");						
					}else {
						REPETIR=false;
					}					
				}while(REPETIR);
				
				listaConstrucciones.add(new Polideportivo(nombrePolideportivo,ancho,largo));
				entrada.nextLine();
				System.out.println(" ");
			}
			else {
				System.out.println("CARGA DE DATOS DE UN EDIFICIO\n");
				System.out.print("Ingrese número de oficinas del Edificio: ");
				cantidadOficinas=entrada.nextInt();
				do {
					System.out.print("Ingrese el ancho del edificio (metros): ");
					ancho=entrada.nextDouble();
					if(ancho <= 0) {
						System.out.println("El valor ingresado no es válido. Debe ingresar una medida correcta.");						
					}else {
						REPETIR=false;
					}					
				}while(REPETIR);
				
				REPETIR=true;
				do {
					System.out.print("Ingrese el largo del edificio (metros): ");
					largo=entrada.nextDouble();
					if(largo <= 0) {
						System.out.println("El valor ingresado no es válido. Debe ingresar una medida correcta.");						
					}else {
						REPETIR=false;
					}					
				}while(REPETIR);
				listaConstrucciones.add(new Edif_Oficina(cantidadOficinas,ancho,largo));
				System.out.println(" ");
			}
		}
		
		System.out.println("LISTADO DE LOS ATRIBUTOS SEGÚN EL TIPO DE ESTRUCTURA");
		System.out.println("======================================================\n");
		
		Iterator<Estructura> it = listaConstrucciones.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next().toString() + "\n");
		}
		
		entrada.close();
	}

}
