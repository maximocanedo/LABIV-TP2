package ejercicio2;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Iterator;


public class MainEjercicio2 {

	public static void main(String[] args) {
		// Establecemos algunas fechas de ejemplo.
		Calendar fechaA = new GregorianCalendar(2020, Calendar.AUGUST, 16);
		Calendar fechaB = new GregorianCalendar(2027, Calendar.NOVEMBER, 12);
		Calendar fechaC = new GregorianCalendar(2024, Calendar.JUNE, 21);
		// Creamos el ArrayList y lo rellenamos.
		ArrayList<Producto> productos = new ArrayList<Producto>();
		productos.add(new Producto(10, fechaB));
		productos.add(new ProductoCongelado(12, 10));
		productos.add(new ProductoFresco("AR", fechaA));
		productos.add(new ProductoRefrigerado(10, 10, fechaC));
		// Creamos un Iterator.
		Iterator<Producto> iProducto = productos.iterator();
		// Imprimimos los detalles de cada registro Producto por consola.
		while(iProducto.hasNext()) {
			Producto myProduct = iProducto.next();
			System.out.println(myProduct.toString());
		}
		
	}

}
