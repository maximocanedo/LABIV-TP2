package ejercicio2;
import java.util.*;

public class Producto {
	private int lote;
	private Date fechaVencimiento;
	
	
	@Override
	public String toString() {
		return "lote [" + lote + "], fecha de Vencimiento " +
	fechaVencimiento+" ";
	}
	//GETTERS SETTERS
	public int getLote() {
		return lote;
	}
	public void setLote(int lote) {
		this.lote = lote;
	}
	public Date getFechaVencimiento() {
		return fechaVencimiento;
	}
	public void setFechaVencimiento(Date fechaVencimiento) {
		this.fechaVencimiento = fechaVencimiento;
	}
	
	/* [ Eliminar antes de entregar ]
	 * Cómo usar Date en Java: https://www.geeksforgeeks.org/date-class-java-examples/
	 * Contiene info sobre cómo crear un objeto Date, sus métodos y cómo imprimirlos en pantalla.
	 */
	
	
}
