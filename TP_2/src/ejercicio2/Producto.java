package ejercicio2;
import java.util.*;

public class Producto {
	private int lote;
	private Date fechaVencimiento;
	
	public Producto(int lote, Date fv) {
		this.lote = lote;
		this.fechaVencimiento = fv;
	}
	public Producto(int lote, Calendar fv) {
		this(lote, fv.getTime());
	}
	public Producto(int lote) {
		Calendar fechaActual = Calendar.getInstance();
        fechaActual.add(Calendar.YEAR, 1);
        this.lote = lote;
        this.fechaVencimiento = fechaActual.getTime();
	}
	public Producto() {
		this(0);
	}
	
	@Override
	public String toString() {
		return "lote [" + lote + "], fecha de Vencimiento " + fechaVencimiento.toString() +" ";
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
